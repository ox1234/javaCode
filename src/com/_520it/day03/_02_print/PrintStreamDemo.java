package com._520it.day03._02_print;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

//字节打印流
public class PrintStreamDemo {
	public static void main(String[] args) throws Exception{
		PrintStream ps=new PrintStream(new FileOutputStream(new File("file/out")),true);
		ps.write("ABC".getBytes());
		ps.print(true);
		ps.print(17);
		ps.println("will");
		ps.println();
	}
}
