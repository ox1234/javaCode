package com._520it.day01._01_file;

import java.io.File;

//需求：列出指定目录中所有的文件，包括子文件夹中的所有文件（使用递归算法recursion）
public class FileDemo3 {
	public static void main(String[] args) {
		File dir = new File("/Users/zhz/javaworkplace");
		listAllFile(dir);
	}

	//列出所有文件
	private static void listAllFile(File f) {
		System.out.println(f);
		File[] fs = f.listFiles();
		//第一级文件
		for (File file : fs) {
			System.out.println(file);
			if (file.isDirectory()) {
				listAllFile(file);
			}
		}
	}
}
