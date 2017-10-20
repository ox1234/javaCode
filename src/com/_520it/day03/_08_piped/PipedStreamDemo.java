package com._520it.day03._08_piped;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

//发送数据给B线程
class AThread extends Thread {
	private PipedOutputStream out = new PipedOutputStream();

	public PipedOutputStream getOut() {
		return out;
	}

	public void run() {
		try {
			for (int i = 65; i < 65 + 26; i++) {
				out.write(i);
			}
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

//B线程接受A线程发送的数据
class BThread extends Thread {
	PipedInputStream in = null;

	public BThread(AThread aThread) throws IOException {
		in = new PipedInputStream(aThread.getOut());

	}

	public void run() {
		int len=-1;
		try {
			while((len=in.read())!=-1){
				System.out.println((char)len);
			}
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

//管道流
public class PipedStreamDemo {
	public static void main(String[] args) throws Exception{
		AThread a=new AThread();
		BThread b=new BThread(a);
		a.start();
		b.start();
	}
}
