package org.file.e;

import java.io.File;

public class FolderCreate {
	
	public static void main(String[] args) {
		
		
		
		//to create single folder use "mkdir"
		
		File fi = new File("G://File Creat");
		boolean a = fi.mkdir();
		System.out.println(a);
		
		// to create multiple folder in expand mode use "mkdirs"
		
		
		File f = new File("G:\\File Creates\\facebook\\instagram\\twitter");
		boolean b = f.mkdirs();
		System.out.println(b);
		
		
		
		
		
	}
}
