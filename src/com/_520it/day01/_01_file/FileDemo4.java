package com._520it.day01._01_file;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//列出文件的分层结构
public class FileDemo4 {
	public static void main(String[] args) {
		String file="/Users/zhz/javaworkplace/eslipce工程/day-11-Eclipse";
		
		File f=new File(file);
		
		//父级目录
//		System.out.println(f.getParentFile().getName());
		List<String> parentNames=new ArrayList<>();
		listAllParent(parentNames,f);
		
		System.out.println(parentNames);
		Collections.reverse(parentNames);
		StringBuilder sb=new StringBuilder(40);
		for(String name:parentNames){
			sb.append(name).append(">");
		}
		sb.delete(sb.length()-1, sb.length());
		System.out.println(sb);
	}

	private static void listAllParent(List<String> parentNames,File f) {
		if(!"".equals(f.getParentFile().getName())){
			parentNames.add(f.getParentFile().getName());
		}
		if(f.getParentFile().getParentFile()!=null){
			listAllParent(parentNames,f.getParentFile());
		}
	}
}
