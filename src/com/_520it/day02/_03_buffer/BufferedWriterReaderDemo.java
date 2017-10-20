package com._520it.day02._03_buffer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

//字符缓冲流
public class BufferedWriterReaderDemo {
	public static void main(String[] args) throws Exception{
		//输出
		BufferedWriter out=new BufferedWriter(new FileWriter("file/stream.txt"));
		out.write("君不见黄河之水天上来");
		out.newLine();
		out.write("奔流到海不复回");
		out.close();
		//输入
		BufferedReader in=new BufferedReader(new FileReader("file/stream.txt"));
		/*char[] buffer=new char[1024];
		int len=-1;
		while((len=in.read(buffer))!=-1){
			System.out.println(buffer);
		}*/
		String line=null;//表示读取的行
		while((line=in.readLine())!=null){
			System.out.println(line);
		}
		in.close();
	}
}
