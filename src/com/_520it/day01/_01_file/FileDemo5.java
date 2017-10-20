package com._520it.day01._01_file;

import java.io.File;

public class FileDemo5 {
	public static void main(String[] args) {
		File dir=new File("/Users/zhz/javaworkplace");
		//获取当前目录下所有的文件
		File[] fs=dir.listFiles();
		//需要被删除的文字
		String deleteText="ccc";
		for(File file:fs){
			System.out.println(file);
			if(file.getName().contains(deleteText)){
				String newFileName=file.getName().replace(deleteText, "");
				file.renameTo(new File(dir,newFileName));
			}
		}
	}
}
