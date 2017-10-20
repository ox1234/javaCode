package com._520it.day03._05_properties;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

//记载properties文件
public class LoadResourceDemo {
	public static void main(String[] args) throws Exception{
		Properties p=new Properties();
		InputStream inStream=new FileInputStream("/Users/zhz/javaworkplace/eslipce工程/IO/bin/db.properties");
		//加载输入流中的数据，加载之后都在p对象中
		p.load(inStream);
		
		System.out.println(p);
		System.out.println(p.getProperty("username"));
		System.out.println(p.getProperty("password"));
	}
}
