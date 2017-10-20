package com._520it.day01._02_file_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

//正确关闭资源
public class CloseResourceDemo {
	public static void main(String[] args) {
		test1();
		test2();
	}

	private static void test2() {
		File outf = new File("file/String.txt");
		File inf = new File("file/String1.txt");
		try (
				//打开资源的代码
				FileInputStream in = new FileInputStream(outf);
				FileOutputStream out = new FileOutputStream(inf, true);) {
			//可能出现异常的代码
			byte[] buffer = new byte[10];
			int len = -1;
			while ((in.read(buffer)) != -1) {
				out.write(buffer, 0, buffer.length);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void test1() {
		FileInputStream in = null;
		FileOutputStream out = null;
		//申明资源对象
		try {
			File outf = new File("file/String.txt");
			File inf = new File("file/String1.txt");
			in = new FileInputStream(outf);
			out = new FileOutputStream(inf, true);
			byte[] buffer = new byte[10];
			int len = -1;
			while ((in.read(buffer)) != -1) {
				out.write(buffer, 0, buffer.length);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//关闭资源
			try {
				if (in != null) {
					in.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				if (out != null) {
					out.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
