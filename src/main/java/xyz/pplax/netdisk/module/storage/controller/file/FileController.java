package xyz.pplax.netdisk.module.storage.controller.file;import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;import com.github.xiaoymin.knife4j.annotations.ApiSort;import xyz.pplax.netdisk.module.storage.model.entity.StorageSource;import xyz.pplax.netdisk.module.storage.service.StorageSourceService;import xyz.pplax.netdisk.module.storage.context.StorageSourceContext;import xyz.pplax.netdisk.core.exception.file.InvalidStorageSourceException;import xyz.pplax.netdisk.core.util.AjaxJson;import xyz.pplax.netdisk.module.storage.annotation.CheckPassword;import xyz.pplax.netdisk.module.storage.chain.FileChain;import xyz.pplax.netdisk.module.storage.chain.FileContext;import xyz.pplax.netdisk.module.storage.convert.StorageSourceConvert;import xyz.pplax.netdisk.module.storage.model.request.base.FileItemRequest;import xyz.pplax.netdisk.module.storage.model.request.base.FileListRequest;import xyz.pplax.netdisk.module.storage.model.result.FileInfoResult;import xyz.pplax.netdisk.module.storage.model.result.FileItemResult;import xyz.pplax.netdisk.module.storage.model.result.StorageSourceResult;import xyz.pplax.netdisk.module.storage.service.base.AbstractBaseFileService;import io.swagger.annotations.Api;import io.swagger.annotations.ApiOperation;import lombok.extern.slf4j.Slf4j;import org.springframework.web.bind.annotation.GetMapping;import org.springframework.web.bind.annotation.PostMapping;import org.springframework.web.bind.annotation.RequestBody;import org.springframework.web.bind.annotation.RequestMapping;import org.springframework.web.bind.annotation.RestController;import javax.annotation.Resource;import javax.validation.Valid;import java.util.List;/** * 文件列表相关接口, 如展示存储源列表, 展示文件列表, 搜索文件列表等. * * @author zhaojun */@Api(tags = "文件列表模块")@ApiSort(2)@Slf4j@RequestMapping("/api/storage")@RestControllerpublic class FileController {		@Resource	private StorageSourceContext storageSourceContext;		@Resource	private StorageSourceService storageSourceService;		@Resource	private FileChain fileChain;		@Resource	private StorageSourceConvert storageSourceConvert;			@ApiOperationSupport(order = 1)	@ApiOperation(value = "获取存储源列表", notes = "获取所有已启用的存储源, 并且按照后台顺序排序")	@GetMapping("/list")	public AjaxJson<List<StorageSourceResult>> storageList() {		List<StorageSource> storageList = storageSourceService.findAllEnableOrderByOrderNum();		List<StorageSourceResult> storageSourceResultList =				storageSourceConvert.entityToResultList(storageList);		return AjaxJson.getSuccessData(storageSourceResultList);	}			@ApiOperationSupport(order = 2)	@ApiOperation(value = "获取文件列表", notes = "获取某个存储源下, 指定路径的文件&文件夹列表")	@PostMapping("/files")	public AjaxJson<FileInfoResult> list(@Valid @RequestBody FileListRequest fileListRequest) throws Exception {		String storageKey = fileListRequest.getStorageKey();		Integer storageId = storageSourceService.findIdByKey(storageKey);		if (storageId == null) {			throw new InvalidStorageSourceException("通过存储源 key 未找到存储源, key: " + storageKey);		}				// 处理请求参数默认值		fileListRequest.handleDefaultValue();				// 获取文件列表		AbstractBaseFileService<?> fileService = storageSourceContext.getByStorageId(storageId);		List<FileItemResult> fileItemList = fileService.fileList(fileListRequest.getPath());				// 执行责任链		FileContext fileContext = FileContext.builder()				.storageId(storageId)				.fileListRequest(fileListRequest)				.fileItemList(fileItemList).build();		fileChain.execute(fileContext);				return AjaxJson.getSuccessData(new FileInfoResult(fileContext.getFileItemList(), fileContext.getPasswordPattern()));	}			@ApiOperationSupport(order = 3)	@ApiOperation(value = "获取单个文件信息", notes = "获取某个存储源下, 单个文件的信息")	@PostMapping("/file/item")	@CheckPassword(storageKeyFieldExpression = "[0].storageKey",					pathFieldExpression = "[0].path",					pathIsDirectory = false,					passwordFieldExpression = "[0].password")	public AjaxJson<?> fileItem(@Valid @RequestBody FileItemRequest fileItemRequest) {		String storageKey = fileItemRequest.getStorageKey();		Integer storageId = storageSourceService.findIdByKey(storageKey);		if (storageId == null) {			throw new InvalidStorageSourceException("通过存储源 key 未找到存储源, key: " + storageKey);		}				// 处理请求参数默认值		fileItemRequest.handleDefaultValue();				// 获取文件列表		AbstractBaseFileService<?> fileService = storageSourceContext.getByStorageId(storageId);				FileItemResult fileItemResult;		try {			fileItemResult = fileService.getFileItem(fileItemRequest.getPath());		} catch (Exception e) {			return AjaxJson.getError("获取文件信息失败: " + e.getMessage());		}				return AjaxJson.getSuccessData(fileItemResult);	}	}