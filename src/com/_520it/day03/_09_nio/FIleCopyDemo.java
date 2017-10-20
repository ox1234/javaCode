package com._520it.day03._09_nio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FIleCopyDemo {
	public static void main(String[] args) throws Exception{
		Files.copy(Paths.get("file/stream.txt"), new FileOutputStream("xx.txt"));
		Files.copy(new FileInputStream("file/stream.txt") ,Paths.get("file/xx.txt"));
	}
}
