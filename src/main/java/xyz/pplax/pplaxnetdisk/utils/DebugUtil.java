package xyz.pplax.pplaxnetdisk.utils;

import org.springframework.beans.factory.annotation.Autowired;
import xyz.pplax.pplaxnetdisk.property.StorageProperties;


public class DebugUtil {
	
	@Autowired
	StorageProperties prop;

	public DebugUtil() {
		// TODO Auto-generated constructor stub
	}

	public static void debug(String str){
			System.out.println(str);
	}
}
