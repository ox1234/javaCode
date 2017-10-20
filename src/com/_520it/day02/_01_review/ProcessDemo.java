package com._520it.day02._01_review;

import java.io.FileOutputStream;
import java.io.OutputStream;

//案例2:获取进程数据-编译和运行java代码
public class ProcessDemo {
	public static void main(String[] args) throws Exception{
		String str = "System.out.println(\"你是天边最美的云彩\")";
		eval(str);
	}

	private static void eval(String str) throws Exception{
		//1、使用StringBuilder来拼接一个完整的HelloWorld程序
		StringBuilder sBuilder=new StringBuilder(80);
		sBuilder.append("public class Hello{");
		sBuilder.append("public static void main(String[] args)");
		sBuilder.append(str);sBuilder.append(";");
		sBuilder.append("}");
		sBuilder.append("}");
		//保存到一个名叫Hello.java的文件中
		OutputStream out=new FileOutputStream("Hello.java");
		out.write(sBuilder.toString().getBytes());
		out.close();
	}
}
