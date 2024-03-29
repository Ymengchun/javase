package IO_03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * 需求：DataStreamDemo.java复制到Copy.java中
 * 数据源：
 * 		DataStreamDemo.java -- 读取数据 -- FileReader -- BufferedReader
 * 目的地：
 * 		Copy.java -- 写出数据 -- FileWriter -- BufferedWriter -- PrintWriter
 */

public class CopyFileDemo {
	public static void main(String[] args) throws IOException {


		//将以前的程序使用打印流改进
		//封装数据源
		BufferedReader br = new BufferedReader(new FileReader("DataStreamDemo.java"));
		//封装目的地
		PrintWriter pw = new PrintWriter(new FileWriter("Copy.java"), true);
		
		String line = null;
		while((line=br.readLine())!=null){
			pw.println(line);
		}
		
		pw.close();
		br.close();
	}
}
