package com._520it.day01._02_file_stream;

import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;

//演示文件字节输入流
public class FileInputStreamDemo {
	public static void main(String[] args) throws Exception {
		//1：创建源
		File f = new File("file/String.txt");
		//2：创建文件字节输入流对象，并接在源上
		FileInputStream in = new FileInputStream(f);
		//3：读取操作
		//int date=in.read();
		byte[] buffer = new byte[5];//此时buffer最多存储5个字节
		System.out.println(Arrays.toString(buffer));
		//in.read(buffer);
		//String str=new String(buffer,0,7);
		//System.out.println(str);
		//		int ret=in.read(buffer,2,6);
		//		System.out.println(Arrays.toString(buffer));
		//		把文件中所有的数据读取到程序中
		int len=-1;//表示当前读取的字节总数,如果为-1表示读取到末尾
		
		while((len=in.read(buffer))!=-1){
			String str=new String(buffer,0,len);
			System.out.println(str);
		}
		//4：关闭资源
		in.close();
	}
}
