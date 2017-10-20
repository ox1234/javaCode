package com._520it.day01._01_file;

import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class SystemPropertiesDemo {
	public static void main(String[] args) {
		Properties pro = System.getProperties();
		Set<Entry<Object, Object>> entrySet = pro.entrySet();
		for (Entry<Object, Object> entry : entrySet) {
			System.out.println(entry.getKey() + "=" + entry.getValue());
		}
		System.out.println("-------------------------------------------");
		String value=System.getProperty("user.dir");
		System.out.println(value);
	}
}
