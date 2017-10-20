package com._520it.day02._02_file_writer_reader;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.Arrays;

//使用文件字符流完成文件的拷贝
public class FileCopyDemo {
	public static void main(String[] args) throws Exception{
		
		byte[] data="小龙哥".getBytes();
		System.out.println(Arrays.toString(data));
		
		//创建源文件
		File srcFile=new File("file/ch.txt");
		File destFile=new File("file/copy.txt");
		//创建流对象
		Reader in=new FileReader(srcFile);
		Writer out=new FileWriter(destFile);
		//具体操作
		char[] buffer=new char[1024];
		int len=-1;
		len=in.read(buffer);
		while(len!=-1){
			System.out.println(buffer);
			len=in.read(buffer);
		}
		out.write(buffer);
		//关闭流对象
		out.close();
		in.close();
	}
}
