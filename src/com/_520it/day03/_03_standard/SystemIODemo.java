package com._520it.day03._03_standard;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;

//标准的IO操作
public class SystemIODemo {
	public static void main(String[] args) throws Exception{
		//重定向标准输入流
		System.setIn(new FileInputStream("file/stream.txt"));
		//重定向到标准输出流
		//System.setOut(new PrintStream("file/xx.txt"));
		System.out.println(".....begin");
		int data=System.in.read();//接受键盘录入的一个字节
		System.out.println(data);
		System.out.println(".....ending");
		
		System.err.println("xxx");
	}
}
