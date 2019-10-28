package IO_05;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 字符缓冲流
 * BufferedWriter：字符缓冲输出流
 * BufferedReader：字符缓冲输入流
 * 
 * BufferedWriter
 * 	1.将文本写入字符输出流，采用缓冲区，更高效
 * 	2.可以使用默认大小，也可以指定缓冲区大小。大多数情况下，默认缓冲区大小。 
 */

public class BufferedWriterDemo {
	public static void main(String[] args) throws IOException {
		//BufferedWriter(Writer out)
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("bw.txt")));	//根据转换流

		BufferedWriter bw = new BufferedWriter(new FileWriter("bw.txt"));	//根据文件字符流

		bw.write("hello");
		bw.write("world");
		bw.write("java");
		
		bw.flush();
		bw.close();
	}
}
