package com._520it.day02._02_file_writer_reader;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

//文件的字符输出流
public class FileWriterDemo {
	public static void main(String[] args) throws Exception{
		//1:创建目标对象
		File destFile=new File("file/ch.txt");
		//2:创建流对象
		Writer out=new FileWriter(destFile,false);
		//3:写出操作
		out.write("A");
		out.write("Will".toCharArray());
		//4:关闭流
		out.close();
	}
}
