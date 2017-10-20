package com._520it.day02._03_buffer;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

//节点流和缓冲流性能对比
public class NodeStreamVSBufferedStreamDemo {
	public static void main(String[] args) throws Exception{
		File srcFile=new File("");
		File destFile=new File("");
		//test1(srcFile,destFile);
		//test2(srcFile,destFile);
		test3(srcFile,destFile);
		
	}
	//使用缓冲流，从内存文件中，一个字节一个字节的读写
	private static void test2(File srcFile, File destFile) throws Exception{
		long begin=System.currentTimeMillis();
		InputStream in=new BufferedInputStream(new FileInputStream(srcFile));
		OutputStream out=new BufferedOutputStream(new FileOutputStream(destFile));
		
		int len=-1;
		while((len=in.read())!=-1){
			out.write(len);
		}
		
		in.close();
		out.close();
		
		System.out.println(System.currentTimeMillis()-begin);
	}

	//使用节点流，从磁盘文件中,一个字节一个字节的读写
	private static void test1(File srcFile, File destFile) throws Exception{
		long begin=System.currentTimeMillis();
		InputStream in=new FileInputStream(srcFile);
		OutputStream out=new FileOutputStream(destFile);
		
		int len=-1;
		while((len=in.read())!=-1){
			out.write(len);
		}
		
		in.close();
		out.close();
		
		System.out.println(System.currentTimeMillis()-begin);
	}
	
	//使用节点流，从磁盘文件中每次读写1024个字节
	private static void test3(File srcFile, File destFile) throws Exception{
		long begin=System.currentTimeMillis();
		InputStream in=new FileInputStream(srcFile);
		OutputStream out=new FileOutputStream(destFile);
		byte[] buffer=new byte[1024];
		int len=-1;
		while((len=in.read(buffer))!=-1){
			out.write(buffer,0,len);
		}
		
		in.close();
		out.close();
		
		System.out.println(System.currentTimeMillis()-begin);
	}
	//使用缓冲流，从内存文件中每次读写1024个字节
	private static void test4(File srcFile, File destFile) throws Exception{
		long begin=System.currentTimeMillis();
		InputStream in=new BufferedInputStream(new FileInputStream(srcFile));
		OutputStream out=new BufferedOutputStream(new FileOutputStream(destFile));
		
		byte[] buffer=new byte[1024];
		int len=-1;
		while((len=in.read(buffer))!=-1){
			out.write(buffer,0,len);
		}
		
		in.close();
		out.close();
		
		System.out.println(System.currentTimeMillis()-begin);
	}
}
