package org.file.e;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class Filesclass {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("G:\\Altron.txt");
		
		boolean newfile = f.createNewFile();
		System.out.println(newfile);
		
		FileUtils.write(f, "Welcome to altron world");
		
		// To overwrite the data
		// FileUtils.write(f, "Welcome to altron world");
		
		// to combine the words
		
		FileUtils.write(f, "\nI am the king",true);  
		// method called 
		// \n use for separate the line
		
		//to check whether the file is execute or not
		boolean canExecute = f.canExecute();
		System.out.println(canExecute);
		
		// to check whether the file is read or not
		boolean canRead = f.canRead();
		System.out.println(canRead);
		
		//to check whether the file is write or not
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
