package xyz.pplax.pplaxnetdisk.io;

import com.qiwenshare.ufop.util.UFOPUtils;
import org.apache.commons.io.FilenameUtils;

/**
 * 文件和路径的处理
 */
public class PPLAXFile {

    private final String path;                          // 记录文件或目录的路径
    public static final String separator = "/";         // 路径分隔符
    private boolean isDirectory;                        // 是否是目录

    /**
     * 初始化
     * @param pathname          路径
     * @param isDirectory       是否是目录
     */
    public PPLAXFile(String pathname, boolean isDirectory) {
//        if (StringUtils.isEmpty(pathname)) {
//            throw new PPLAXException("file name format error，pathname:" + pathname);
//        }
        this.path = formatPath(pathname);
        this.isDirectory = isDirectory;
    }

    /**
     * 初始化，将父路径和子路径合并成一个完整的路径
     * @param parent        父路径
     * @param child         子路径
     * @param isDirectory   是否是目录
     */
    public PPLAXFile(String parent, String child, boolean isDirectory) {
//        if (StringUtils.isEmpty(child)) {
//            throw new PPLAXException("file name format error，parent:" + parent +", child:" + child);
//        }
        if (parent != null) {
            String parentPath = separator.equals(formatPath(parent)) ? "" : formatPath(parent);
            String childPath = formatPath(child);
            if (childPath.startsWith(separator)) {
                childPath = childPath.replaceFirst(separator, "");
            }
            this.path = parentPath + separator + childPath;
        } else {
            this.path = formatPath(child);
        }
        this.isDirectory = isDirectory;
    }

    /**
     * 格式化路径
     * @param path  路径
     * @return
     */
    public static String formatPath(String path) {
        path = UFOPUtils.pathSplitFormat(path);
        if ("/".equals(path)) {
            return path;
        }
        if (!path.startsWith(separator)) {
            path = separator + path;
        }
        if (path.endsWith("/")) {
            int length = path.length();
            return path.substring(0, length - 1);
        }

        return path;
    }

    /**
     * 获得父路径
     * @return
     */
    public String getParent() {
        if (separator.equals(this.path)) {  // 如果当前路径是根目录，返回空
            return null;
        }
        if (!this.path.contains("/")) {
            return null;
        }
        int index = path.lastIndexOf(separator);
        if (index == 0) {
            return separator;
        }
        return path.substring(0, index);
    }

    /**
     * 返回新的PPLAXFile对象，在当前路径的父路径
     * @return
     */
    public PPLAXFile getParentFile() {
        String parentPath = this.getParent();
        return new PPLAXFile(parentPath, true);
    }

    /**
     * 返回路径中的文件或目录名称
     * @return
     */
    public String getName() {
        int index = path.lastIndexOf(separator);
        if (!path.contains(separator)) {
            return path;
        }
        return path.substring(index + 1);
    }

    /**
     * 返回文件的扩展名
     * @return
     */
    public String getExtendName() {
        return FilenameUtils.getExtension(getName());
    }

    /**
     * 返回文件的名称（不包括扩展名）
     * @return
     */
    public String getNameNotExtend() {
        return FilenameUtils.removeExtension(getName());
    }

    /**
     * 返回当前路径
     * @return
     */
    public String getPath() {
        return path;
    }

    /**
     * 返回isDirectory
     * @return
     */
    public boolean isDirectory() {
       return isDirectory;
    }

    /**
     * 返回 !isDirectory
     * @return
     */
    public boolean isFile() {
        return !isDirectory;
    }

    
}
