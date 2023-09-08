package xyz.pplax.netdisk.module.storage.convert;

import xyz.pplax.netdisk.module.readme.model.entity.ReadmeConfig;
import xyz.pplax.netdisk.module.storage.model.request.base.SaveStorageSourceRequest;
import xyz.pplax.netdisk.module.storage.model.result.StorageSourceAdminResult;
import xyz.pplax.netdisk.module.storage.model.dto.StorageSourceAllParamDTO;
import xyz.pplax.netdisk.module.storage.model.dto.StorageSourceDTO;
import xyz.pplax.netdisk.module.storage.model.result.StorageSourceConfigResult;
import xyz.pplax.netdisk.module.storage.model.result.StorageSourceResult;
import xyz.pplax.netdisk.module.storage.model.entity.StorageSource;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * StorageSource 转换器
 *
 * @author zhaojun
 */
@Component
@Mapper(componentModel = "spring")
public interface StorageSourceConvert {


	/**
	 * 将 StorageSource 转换为 StorageSourceResult
	 *
	 * @param   list
	 *          StorageSource 列表
	 *
	 * @return  StorageSourceResult 列表
	 */
	List<StorageSourceResult> entityToResultList(List<StorageSource> list);


	/**
	 * 将 StorageSource 转换为 StorageSourceConfigResult
	 *
	 * @param   storageSource
	 *          StorageSource 实体
	 *
	 * @return  StorageSourceConfigResult 实体
	 */
	@Mapping(source = "readmeConfig.displayMode", target = "readmeDisplayMode")
	@Mapping(source = "storageSource.allowOperator", target = "enableFileOperator")
	StorageSourceConfigResult entityToConfigResult(StorageSource storageSource, ReadmeConfig readmeConfig);


	/**
	 * 将 StorageSource 转换为 StorageSourceAdminResult
	 *
	 * @param   list
	 *          StorageSource 列表
	 *
	 * @return  StorageSourceAdminResult 列表
	 */
	List<StorageSourceAdminResult> entityToAdminResultList(List<StorageSource> list);


	StorageSourceDTO entityToDTO(StorageSource storageSource, StorageSourceAllParamDTO storageSourceAllParam);
	
	
	/**
	 * 将 SaveStorageSourceRequest 转换为 StorageSource
	 *
	 * @param   saveStorageSourceRequest
	 *          SaveStorageSourceRequest 实体
	 *
	 * @return  StorageSource 实体
	 */
	StorageSource saveRequestToEntity(SaveStorageSourceRequest saveStorageSourceRequest);
	
}