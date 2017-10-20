package com._520it.day03._02_print;

//java的格式化输出
public class PrintfDemo {
	public static void main(String[] args) {
		//打印一句话，效果风格：姓名：Will，年龄：17
		String name="龙哥";
		int age=18;
		//传统做法
		String str="姓名:"+name+",年龄:"+17;
		System.out.println(str);
		//格式化输出
		String format="姓名:%s,年龄:%d";
		Object[] data={"龙哥",17};
		System.out.printf(format, data);
		System.out.println();
		//简化格式化输出
		System.out.printf("姓名：%s,年龄：%d","will",18);
	}
}
