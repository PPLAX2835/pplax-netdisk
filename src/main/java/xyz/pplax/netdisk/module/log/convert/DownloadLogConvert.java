package xyz.pplax.netdisk.module.log.convert;

import xyz.pplax.netdisk.module.log.model.entity.DownloadLog;
import xyz.pplax.netdisk.module.storage.model.entity.StorageSource;
import xyz.pplax.netdisk.module.log.model.result.DownloadLogResult;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

/**
 * 下载日志实体类转换器
 *
 * @author zhaojun
 */
@Component
@Mapper(componentModel = "spring")
public interface DownloadLogConvert {

	@Mapping(source = "downloadLog.id", target = "id")
	@Mapping(source = "storageSource.name", target = "storageName")
	@Mapping(source = "storageSource.type", target = "storageType")
	DownloadLogResult entityToResultList(DownloadLog downloadLog, StorageSource storageSource);

}