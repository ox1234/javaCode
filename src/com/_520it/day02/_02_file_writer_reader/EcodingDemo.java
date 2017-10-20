package com._520it.day02._02_file_writer_reader;

import java.util.Arrays;

//编码和解码
public class EcodingDemo {
	public static void main(String[] args) throws Exception{
		String msg="龙哥";
		//编码操作
		byte[] data=msg.getBytes("GBK");
		System.out.println(Arrays.toString(data));
		
		//解码操作
		String ret=new String(data,"GBK");
		System.out.println(ret);
	}
}
