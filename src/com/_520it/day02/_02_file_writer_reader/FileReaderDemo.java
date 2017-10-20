package com._520it.day02._02_file_writer_reader;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;

//文件的字符输入流
public class FileReaderDemo {
	public static void main(String[] args) throws Exception{
		//1:创建源
		File srcFile=new File("file/ch.txt");
		//2:创建流对象
		Reader in=new FileReader(srcFile);
		//3:读取操作
		char[] buffer=new char[5];//每次读取5个字符
		int len=-1;//当前读取字符的数量
		len=in.read(buffer);
		while(len!=-1){
			System.out.println(buffer);
			len=in.read(buffer);
		}
		//4:关闭流
		in.close();
	}
}
