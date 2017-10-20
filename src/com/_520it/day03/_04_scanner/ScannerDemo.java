package com._520it.day03._04_scanner;

import java.io.File;
import java.util.Scanner;

//扫描器类
public class ScannerDemo {
	public static void main(String[] args) throws Exception{
		//扫描文件中的数据
		//Scanner sc=new Scanner(new File("file/stream.txt"),"UTF-8");
		//扫描键盘输入的数据
		//Scanner sc=new Scanner(System.in);
		//扫描字符串中的数据
		Scanner sc=new Scanner("你好帅啊,真的");
		while(sc.hasNextLine()){
			String line=sc.nextLine();
			System.out.println("ECHO："+line);
		}
		sc.close();
	}
}
