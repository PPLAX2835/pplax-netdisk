package xyz.pplax.pplaxnetdisk.service;

import xyz.pplax.pplaxnetdisk.domain.File;
import xyz.pplax.pplaxnetdisk.dto.file.DownloadFileDTO;
import xyz.pplax.pplaxnetdisk.dto.file.PreviewDTO;
import xyz.pplax.pplaxnetdisk.dto.file.UploadFileDTO;
import xyz.pplax.pplaxnetdisk.vo.file.UploadFileVo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public interface FileTransferService {

    UploadFileVo uploadFileSpeed(UploadFileDTO uploadFileDTO);

    void uploadFile(HttpServletRequest request, UploadFileDTO UploadFileDto, String userId);

    void downloadFile(HttpServletResponse httpServletResponse, DownloadFileDTO downloadFileDTO);
    void downloadUserFileList(HttpServletResponse httpServletResponse, String filePath, String fileName, List<String> userFileIds);
    void previewFile(HttpServletResponse httpServletResponse, PreviewDTO previewDTO);
    void previewPictureFile(HttpServletResponse httpServletResponse, PreviewDTO previewDTO);
    void deleteFile(File fileBean);

    Long selectStorageSizeByUserId(String userId);
}
