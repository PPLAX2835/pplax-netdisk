package xyz.pplax.netdisk.core.constant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * PPLAX 常量
 */
@Configuration
public class PPLAXFileConstant {

    public static final Character PATH_SEPARATOR_CHAR = '/';

    public static final String PATH_SEPARATOR = "/";

    /**
     * 最大支持文本文件大小为 ? KB 的文件内容.
     */
    public static Long TEXT_MAX_FILE_SIZE_KB = 100L;

    @Autowired(required = false)
    public void setTextMaxFileSizeMb(@Value("${pplax.preview.text.maxFileSizeKb}") Long maxFileSizeKb) {
        PPLAXFileConstant.TEXT_MAX_FILE_SIZE_KB = maxFileSizeKb;
    }

}