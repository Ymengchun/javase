package IO_01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 复制文本文件
 * 
 * 分析：
 * 	复制数据，如果我们用记事本打开并能够读懂（无乱码），就用字符流，否则用字节流。
 * 	本题采用字符流更方便（记事本能识别文本文件）。
 * 	字符流有5种方式，推荐用字符缓冲流一次读写一个字符串。
 * 数据源：
 * 		c:\\a.txt -- FileReader -- BufferdReader
 * 目的地：
 * 		d:\\b.txt -- FileWriter -- BufferedWriter
 */

public class CopyFileDemo {
	public static void main(String[] args) throws IOException {
		String srcString = "c:\\a.txt";
		String destString = "d:\\b.txt";
		//method1(srcString, destString);
		//method2(srcString, destString);
		//method3(srcString, destString);
		//method4(srcString, destString);
		method5(srcString, destString);
	}

	//字符缓冲流一次读写一个字符串
	private static void method5(String srcString, String destString) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(srcString));
		BufferedWriter bw = new BufferedWriter(new FileWriter(destString));

		String line = null;
		while ((line = br.readLine()) != null) {	//一次读取一行
			bw.write(line);	//写一行
			bw.newLine();	//添加换行符
			bw.flush();		//write()和flush()成对出现
		}

		bw.close();
		br.close();
	}

	
	//字符缓冲流一次读写一个字符数组
	private static void method4(String srcString, String destString)
			throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(srcString));
		BufferedWriter bw = new BufferedWriter(new FileWriter(destString));

		char[] chs = new char[1024];
		int len = 0;
		while ((len = br.read(chs)) != -1) {
			bw.write(chs, 0, len);
		}

		bw.close();
		br.close();
	}

	
	//字符缓冲流一次读写一个字符
	private static void method3(String srcString, String destString)
			throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(srcString));
		BufferedWriter bw = new BufferedWriter(new FileWriter(destString));

		int ch = 0;
		while ((ch = br.read()) != -1) {
			bw.write(ch);
		}

		bw.close();
		br.close();
	}

	
	//基本字符流一次读写一个字符数组
	private static void method2(String srcString, String destString) throws IOException {
		FileReader fr = new FileReader(srcString);
		FileWriter fw = new FileWriter(destString);

		char[] chs = new char[1024];
		int len = 0;
		while ((len = fr.read(chs)) != -1) {
			fw.write(chs, 0, len);
		}

		fw.close();
		fr.close();
	}

	
	//基本字符流一次读写一个字符
	private static void method1(String srcString, String destString) throws IOException {
		FileReader fr = new FileReader(srcString);
		FileWriter fw = new FileWriter(destString);

		int ch = 0;
		while ((ch = fr.read()) != -1) {
			fw.write(ch);
		}

		fw.close();
		fr.close();
	}
}
