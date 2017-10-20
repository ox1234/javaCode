package com._520it.day01._01_file;

import java.io.File;
import java.io.FilenameFilter;

public class FileDemo6 {
	public static void main(String[] args) {
		File dir=new File("/Users/zhz/javaworkplace");
		File[] fs=dir.listFiles(new FilenameFilter(){
			public boolean accept(File dir, String name) {
				return new File(dir,name).isFile()&&name.endsWith(".pdf");
			}
		});
		for(File file:fs){
			System.out.println(file);
		}
	}
}
