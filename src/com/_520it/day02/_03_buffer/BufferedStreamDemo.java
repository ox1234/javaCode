package com._520it.day02._03_buffer;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

//字节缓冲流
public class BufferedStreamDemo {
	public static void main(String[] args) throws Exception{
		//字节缓冲输出流
		BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("stream.txt",true));
		bos.write("hello world".getBytes());
		bos.close();
		//字节缓冲输出流
		BufferedInputStream bin=new BufferedInputStream(new FileInputStream("stream.txt"));
		byte[] buffer=new byte[1024];
		int len=-1;
		
		while((len=bin.read(buffer))!=-1){
			System.out.println(new String(buffer,0,len));
		}
		bin.close();
	}
}
