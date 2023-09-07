package xyz.pplax.netdisk.module.storage.service.base;

import xyz.pplax.netdisk.module.storage.model.param.SharePointParam;

/**
 * @author zhaojun
 */
public abstract class AbstractSharePointServiceBase<P extends SharePointParam> extends AbstractMicrosoftDriveService<SharePointParam> {

    @Override
    public void init() {
        refreshAccessToken();
    }

    @Override
    public String getType() {
        return "sites/" + param.getSiteId();
    }

    @Override
    public String getDownloadUrl(String pathAndName) {
        return getFileItem(pathAndName).getUrl();
    }

}