package xyz.pplax.netdisk.module.storage.annotation.impl;

import xyz.pplax.netdisk.module.storage.annotation.StorageParamItem;
import xyz.pplax.netdisk.module.storage.annotation.StorageParamSelect;
import xyz.pplax.netdisk.module.storage.model.bo.StorageSourceParamDef;
import xyz.pplax.netdisk.module.storage.model.param.IStorageParam;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/**
 * 编码格式动态参数.
 *
 * @author zhaojun
 */
public class EncodingStorageParamSelect implements StorageParamSelect {

	@Override
	public List<StorageSourceParamDef.Options> getOptions(StorageParamItem storageParamItem, IStorageParam targetParam) {
		List<StorageSourceParamDef.Options> options = new ArrayList<>();

		for (String name : Charset.availableCharsets().keySet()) {
			StorageSourceParamDef.Options option = new StorageSourceParamDef.Options(name);
			options.add(option);
		}
		return options;
	}

}