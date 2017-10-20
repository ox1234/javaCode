package com._520it.day01._02_file_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

//使用字节流完成文件的拷贝操作
public class StringCopyDemo {
	public static void main(String[] args) throws Exception {
		File outf = new File("file/String.txt");
		File inf = new File("file/String1.txt");
		FileInputStream in = new FileInputStream(outf);
		FileOutputStream out = new FileOutputStream(inf, true);
		byte[] buffer = new byte[10];
		int len = -1;
		while ((in.read(buffer)) != -1) {
			out.write(buffer, 0, buffer.length);
		}
		//关闭资源
		in.close();
		out.close();
	}
}
