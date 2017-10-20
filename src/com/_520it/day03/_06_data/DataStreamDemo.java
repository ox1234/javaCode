package com._520it.day03._06_data;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataStreamDemo {
	public static void main(String[] args) throws Exception{
		File f=new File("file/out.txt");
		//write(f);
		read(f);
	}

	private static void read(File f) throws Exception{
		DataInputStream in=new DataInputStream(new FileInputStream(f));
		System.out.println(in.readByte());
		System.out.println(in.readChar());
		System.out.println(in.readUTF());
		
		in.close();
	}

	private static void write(File f) throws Exception{
		DataOutputStream out=new DataOutputStream(new FileOutputStream("file/out.txt"));
		out.writeByte(65);
		out.writeChars("哥");
		out.writeUTF("小马哥教育");
		
		out.close();
	}
}
