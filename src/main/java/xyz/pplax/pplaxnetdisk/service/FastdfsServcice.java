package xyz.pplax.pplaxnetdisk.service;


import org.springframework.stereotype.Service;
import xyz.pplax.pplaxnetdisk.constant.FileListener;
import xyz.pplax.pplaxnetdisk.constant.UploadFileExt;
import xyz.pplax.pplaxnetdisk.constant.UploadResult;

@Service
public class FastdfsServcice implements FileListener {

	public void store(String filePath, String finalFilename) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public UploadResult Store(UploadFileExt ufe) {
		//TODO 上传回调
		return null;
	}

	@Override
	public void Download(String fileKeyorName) {
		// TODO 下载
		
	}

}
