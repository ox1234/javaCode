package com._520it.day03._07_randomaccessfile;

import java.io.File;
import java.io.RandomAccessFile;

//读写文件的任意位置
public class RandomAccessFileDemo {
	public static void main(String[] args) throws Exception{
		File f=new File("file/raf.txt");
		//write(f);
		read(f);
	}

	private static void read(File f) throws Exception{
		RandomAccessFile raf=new RandomAccessFile(f,"r");
		System.out.println("文件指针位置"+raf.getFilePointer());//0
		byte b=raf.readByte();
		System.out.println(b);
		System.out.println("文件指针位置"+raf.getFilePointer());//1
		String str=raf.readUTF();
		System.out.println(str);
		System.out.println("文件指针位置"+raf.getFilePointer());//9
		raf.seek(0);//设置文件指针为0
		System.out.println("文件指针位置"+raf.getFilePointer());//9
		raf.skipBytes(3);//设置文件指针跳过12个字节
		System.out.println("文件指针位置"+raf.getFilePointer());//9
		int i=raf.readInt();
		System.out.println(i);
		System.out.println("文件指针位置"+raf.getFilePointer());//13
		raf.close();
	}

	private static void write(File f) throws Exception{
		RandomAccessFile raf=new RandomAccessFile(f,"rw");
		raf.writeByte(65);
		raf.writeUTF("龙哥");
		raf.writeInt(17);
		raf.close();
	}
}
