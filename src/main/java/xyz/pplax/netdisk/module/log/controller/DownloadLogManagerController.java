package xyz.pplax.netdisk.module.log.controller;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.OrderItem;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import com.github.xiaoymin.knife4j.annotations.ApiSort;
import xyz.pplax.netdisk.core.util.AjaxJson;
import xyz.pplax.netdisk.module.link.model.request.BatchDeleteRequest;
import xyz.pplax.netdisk.module.link.model.request.QueryDownloadLogRequest;
import xyz.pplax.netdisk.module.log.convert.DownloadLogConvert;
import xyz.pplax.netdisk.module.log.model.entity.DownloadLog;
import xyz.pplax.netdisk.module.log.model.result.DownloadLogResult;
import xyz.pplax.netdisk.module.log.service.DownloadLogService;
import xyz.pplax.netdisk.module.storage.model.entity.StorageSource;
import xyz.pplax.netdisk.module.storage.service.StorageSourceService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Stream;

/**
 * 直链下载日志接口
 *
 * @author zhaojun
 */
@Api(tags = "直链日志管理")
@ApiSort(7)
@Controller
@RequestMapping("/admin/download/log")
public class DownloadLogManagerController {

    @Resource
    private StorageSourceService storageSourceService;

    @Resource
    private DownloadLogConvert downloadLogConvert;

    @Resource
    private DownloadLogService downloadLogService;

    @ApiOperationSupport(order = 1)
    @GetMapping("/list")
    @ApiOperation(value = "直链下载日志")
    @ResponseBody
    public AjaxJson<?> list(QueryDownloadLogRequest queryDownloadLogRequest) {
        // 分页和排序
        boolean asc = Objects.equals(queryDownloadLogRequest.getOrderDirection(), "asc");
        Page<DownloadLog> pages = new Page<DownloadLog>(queryDownloadLogRequest.getPage(), queryDownloadLogRequest.getLimit())
                .addOrder(new OrderItem(queryDownloadLogRequest.getOrderBy(), asc));

        DownloadLog downloadLog = new DownloadLog();
        QueryWrapper<DownloadLog> queryWrapper =
                new QueryWrapper<>(downloadLog)
                .eq(StrUtil.isNotEmpty(queryDownloadLogRequest.getStorageKey()), "storage_key", queryDownloadLogRequest.getStorageKey())
                .like(StrUtil.isNotEmpty(queryDownloadLogRequest.getPath()), "path", queryDownloadLogRequest.getPath())
                .like(StrUtil.isNotEmpty(queryDownloadLogRequest.getShortKey()), "short_key", queryDownloadLogRequest.getShortKey())
                .like(StrUtil.isNotEmpty(queryDownloadLogRequest.getIp()), "ip", queryDownloadLogRequest.getIp())
                .like(StrUtil.isNotEmpty(queryDownloadLogRequest.getReferer()), "referer", queryDownloadLogRequest.getReferer())
                .like(StrUtil.isNotEmpty(queryDownloadLogRequest.getUserAgent()), "user_agent", queryDownloadLogRequest.getUserAgent())
                .ge(StrUtil.isNotEmpty(queryDownloadLogRequest.getDateFrom()), "create_time", queryDownloadLogRequest.getDateFrom())
                .le(StrUtil.isNotEmpty(queryDownloadLogRequest.getDateTo()), "create_time", queryDownloadLogRequest.getDateTo());

        Page<DownloadLog> selectResult = downloadLogService.selectPage(pages, queryWrapper);

        Map<String, StorageSource> cache = new HashMap<>();

        Stream<DownloadLogResult> shortLinkResultList = selectResult.getRecords().stream().map(model -> {
            String storageKey = model.getStorageKey();

            StorageSource storageSource = cache.getOrDefault(storageKey, storageSourceService.findByStorageKey(storageKey));
            cache.put(storageKey, storageSource);

            return downloadLogConvert.entityToResultList(model, storageSource);
        });
        return AjaxJson.getPageData(selectResult.getTotal(), shortLinkResultList);
    }


    @ApiOperationSupport(order = 2)
    @DeleteMapping("/delete/{id}")
    @ApiOperation(value = "删除直链")
    @ApiImplicitParam(paramType = "path", name = "id", value = "直链 id", required = true, dataTypeClass = Integer.class)
    @ResponseBody
    public AjaxJson<Void> deleteById(@PathVariable Integer id) {
        downloadLogService.removeById(id);
        return AjaxJson.getSuccess();
    }


    @ApiOperationSupport(order = 3)
    @PostMapping("/delete/batch")
    @ResponseBody
    @ApiOperation(value = "批量删除直链")
    public AjaxJson<Void> batchDelete(@RequestBody BatchDeleteRequest batchDeleteRequest) {
        List<Integer> ids = batchDeleteRequest.getIds();
        downloadLogService.removeBatchByIds(ids);
        return AjaxJson.getSuccess();
    }

    @ApiOperationSupport(order = 4)
    @PostMapping("/delete/batch/query")
    @ResponseBody
    @ApiOperation(value = "根据查询条件批量删除直链")
    public AjaxJson<Void> batchDeleteBySearchParams(@RequestBody QueryDownloadLogRequest queryDownloadLogRequest) {
        DownloadLog downloadLog = new DownloadLog();
        QueryWrapper<DownloadLog> queryWrapper =
                new QueryWrapper<>(downloadLog)
                        .eq(StrUtil.isNotEmpty(queryDownloadLogRequest.getStorageKey()), "storage_key", queryDownloadLogRequest.getStorageKey())
                        .like(StrUtil.isNotEmpty(queryDownloadLogRequest.getPath()), "path", queryDownloadLogRequest.getPath())
                        .like(StrUtil.isNotEmpty(queryDownloadLogRequest.getShortKey()), "short_key", queryDownloadLogRequest.getShortKey())
                        .like(StrUtil.isNotEmpty(queryDownloadLogRequest.getIp()), "ip", queryDownloadLogRequest.getIp())
                        .like(StrUtil.isNotEmpty(queryDownloadLogRequest.getReferer()), "referer", queryDownloadLogRequest.getReferer())
                        .like(StrUtil.isNotEmpty(queryDownloadLogRequest.getUserAgent()), "user_agent", queryDownloadLogRequest.getUserAgent())
                        .ge(StrUtil.isNotEmpty(queryDownloadLogRequest.getDateFrom()), "create_time", queryDownloadLogRequest.getDateFrom())
                        .le(StrUtil.isNotEmpty(queryDownloadLogRequest.getDateTo()), "create_time", queryDownloadLogRequest.getDateTo());

        downloadLogService.deleteByQueryWrapper(queryWrapper);
        return AjaxJson.getSuccess();
    }

}