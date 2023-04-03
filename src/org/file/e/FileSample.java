package org.file.e;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class FileSample {
	
	public static void main(String[] args) throws IOException {
		
		
		File f = new File("G:\\Altrons.txt");
		
		boolean newfile = f.createNewFile();
		System.out.println(newfile);
		
		FileUtils.write(f, "Welcome to altron world");
		
		FileUtils.write(f, "\nI am the king",true);  
		
		boolean canExecute = f.canExecute();
		System.out.println(canExecute);
		
		boolean canRead = f.canRead();
		System.out.println(canRead);
		
		boolean canWrite = f.canWrite();
		System.out.println(canWrite);
		
		boolean file = f.isFile();
		System.out.println(file);
		
		List<String> readLines = FileUtils.readLines(f);
		System.out.println(readLines);
		
		for (String string : readLines) {
			System.out.println(string);
		

	}
		
		System.out.println("************");
		String FileToString = FileUtils.readFileToString(f);
		System.out.println(FileToString);

}
}
