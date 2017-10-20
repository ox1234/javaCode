package com._520it.day01._02_file_stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

//演示文件字节输出流
public class FileOutputStreamDemo {
	public static void main(String[] args) throws Exception {
		//1：创建目标对象（表示把数据保存到哪一个文件）
		File target = new File("file/String.txt");
		//2：创建文件字节输出流对象（水管）
		FileOutputStream out = new FileOutputStream(target,true);//需要追加文件内容
		//3：具体的输出操作（往外写操作）
		//out.write(65);//写出A
		out.write("ABCDE".getBytes(),0,"ABCDE".length());
		//4：关闭资源
		out.close();
	}
}
