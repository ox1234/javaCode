package com._520it.day01._01_file;

import java.io.File;
import java.io.IOException;

public class FileDemo2 {
	public static void main(String[] args) throws IOException {
		//test1();
		//test2();
		//test3();
		test4();
	}

	private static void test4() {
		File dir=new File("/Users/zhz/javaworkplace");
		File f1=new File(dir,"123.txt");
		System.out.println(dir.isDirectory());
		System.out.println(f1.isDirectory());
		System.out.println(dir.exists());
		boolean ret=dir.mkdir();
		System.out.println(ret);
		
		String[] names=dir.list();
		for(String name:names){
			System.out.println(name);
		}
		System.out.println("---------------------");
		File[] fs=dir.listFiles();
		for(File file:fs){
			System.out.println(file);
		}
		System.out.println("-----------------------");
		File[] roots=dir.listRoots();
		for(File root:roots){
			System.out.println(root);
		}
	}

	private static void test3() throws IOException {
		//		File dir=new File("/Users/zhz/javaworkplace");
		//		File f1=new File("/Users/zhz/javaworkplace/123.txt");
		//		System.out.println(f1.exists());
		//		System.out.println(f1.isFile());
		//		//如果文件不存在，则新建该文件
		//		if(!f1.exists()){
		//			f1.createNewFile();
		//		}else{
		//			//f1.renameTo(new File(dir,"abc.txt"));
		//			f1.delete();
		//		}
		//创建临时使用的文件，随时都可以呗清除掉
		File.createTempFile("will", null, null);
	}

	private static void test2() {
		File f1 = new File("/Users/zhz/javaworkplace/123.txt");
		System.out.println(f1.canExecute());
		System.out.println(f1.canRead());
		System.out.println(f1.canWrite());
		System.out.println(f1.isHidden());
		System.out.println(f1.lastModified());
		System.out.println(new java.util.Date(f1.lastModified()).toLocaleString());
		System.out.println(f1.length());

	}

	private static void test1() {
		//创建一个file对象
		File f1 = new File("/Users/zhz/javaworkplace", "123.txt");
		System.out.println(f1.getAbsolutePath());
		System.out.println(f1.getAbsoluteFile());

		System.out.println(f1.getPath());
		System.out.println(f1.getName());

		System.out.println(f1.getParent());
		System.out.println(f1.getParentFile());
	}
}
