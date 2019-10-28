package IO_03;

import java.io.IOException;
import java.io.PrintWriter;

/*
 * 打印流
 * 字节打印流	PrintStream
 * 字符打印流	PrintWriter
 * 
 * 打印流的特点：
 * 		1.只能写数据，不能读数据。只能操作目的地，不能操作数据源。
 * 		2.可以操作任意类型的数据。
 * 		3.如果启动了自动刷新，能够自动刷新。
 * 		4.可以直接操作文本文件。
 * 			哪些流对象是可以直接操作文本文件的呢?
 * 			FileInputStream
 * 			FileOutputStream
 * 			FileReader
 * 			FileWriter
 * 			PrintStream
 * 			PrintWriter
 * 			可以直接操作文件的流：查API，查流对象的构造方法，看是否同时有File类型和String类型的参数
 * 
 * 			流：
 * 				基本流：能够直接读写文件
 * 				高级流：在基本流的基础上提供了其他功能
 */

public class PrintWriterDemo {
	public static void main(String[] args) throws IOException {
		//作为Writer的子类使用
		PrintWriter pw = new PrintWriter("pw.txt");

		pw.write("hello");
		pw.write("world");
		pw.write("java");
		
		pw.close();
	}
}
