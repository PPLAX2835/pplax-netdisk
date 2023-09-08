package xyz.pplax.netdisk.module.link.convert;

import xyz.pplax.netdisk.module.link.model.entity.ShortLink;
import xyz.pplax.netdisk.module.storage.model.entity.StorageSource;
import xyz.pplax.netdisk.module.link.model.request.ShortLinkResult;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

/**
 * 直链实体类器
 *
 * @author zhaojun
 */
@Component
@Mapper(componentModel = "spring")
public interface ShortLinkConvert {

	@Mapping(source = "shortLink.id", target = "id")
	@Mapping(source = "storageSource.name", target = "storageName")
	@Mapping(source = "storageSource.type", target = "storageType")
	ShortLinkResult entityToResultList(ShortLink shortLink, StorageSource storageSource);

}