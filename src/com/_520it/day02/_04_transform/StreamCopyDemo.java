package com._520it.day02._04_transform;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.CharBuffer;

public class StreamCopyDemo {
	public static void main(String[] args) throws Exception{
		File srcFile=new File("file/stream.txt");
		File destFile=new File("target/stream.txt");
		
		Reader in=new InputStreamReader(new FileInputStream(srcFile),"GBK");
		Writer out=new OutputStreamWriter(new FileOutputStream(destFile),"GBK");
		char[] buffer=new char[1024];
		int len=-1;
		
		while((len=in.read(buffer))!=-1){
			out.write(buffer, 0, len);
		}
		in.close();
		out.close();
	}
}
