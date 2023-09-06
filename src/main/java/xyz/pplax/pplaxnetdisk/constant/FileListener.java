package xyz.pplax.pplaxnetdisk.constant;

public interface FileListener {
	
	UploadResult Store(UploadFileExt ufe);
	void Download(String fileKeyorName);
	
}
