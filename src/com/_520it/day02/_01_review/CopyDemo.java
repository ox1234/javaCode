package com._520it.day02._01_review;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.InputStream;
import java.io.OutputStream;

//案例1:文件拷贝案例-拷贝指定目录的指定类型文件到指定目录
public class CopyDemo {
	public static void main(String[] args) throws Exception{
		//1、找到原目录中所有的java文件
		File srcDir = new File("java");
		File destDir = new File("text");
		File[] fs = srcDir.listFiles(new FilenameFilter() {
			public boolean accept(File dir, String name) {
				return new File(dir, name).isFile() && name.endsWith(".java");
			}
		});
		//2、迭代出每一个文件对象，并拷贝
		for(File srcFile:fs){
			//创建流对象
			InputStream in=new FileInputStream(srcFile);
			OutputStream out=new FileOutputStream(new File(destDir,srcFile.getName()));
			//读写操作
			byte[] buffer=new byte[1024];//一次性可以读取1024个字节
			int len=-1;//已经读取的字节数，在底层规定-1读取到末尾
			len=in.read(buffer);
			while(len!=-1){
				out.write(buffer,0,len);
				len=in.read(buffer);
			}
			in.close();
			out.close();
			//修改拷贝之后的文件名称
		}
	}
}
