package IO_01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * IO流的分类：
 * 		流向：
 * 			输入流：读入数据
 * 			输出流：写出数据
 * 		数据类型：
 * 			字节流
 * 				字节输入流：InputStream
 * 				字节输出流：OutputStream
 * 			字符流
 * 				字符输入流：Reader
 * 				字符输出流：Writer
 * 
 * 		注意：探讨IO流的分类时，如果没有说明按哪种分类，默认按数据类型分类。
 * 		      读入和写出是相对于程序来说的，而不是文件。读入——将数据读入程序。写出——将数据写出程序，写入文件。
 * 
 * 案例：往文本文件中输入一句话："hello,IO"
 * 
 * 分析：
 * 		1.这个操作最好是采用字符流来做，但字符流在字节流之后再介绍，今天先讲解字节流。
 * 		2.往文件中写入（从程序写出），用字节输出流——OutPutStream
 * 		3.但OutPutStream是抽象类，要用一个子类实现——FileOutputStream
 * 
 * 注意：每种基类的子类都是以父类名作为后缀名。
 * 		XxxOutputStream
 * 		XxxInputStream
 * 		XxxReader
 * 		XxxWriter
 * 
 * FileOutputStream的构造方法：
 * 		FileOutputStream(File file) 
 *		FileOutputStream(String name)
 *
 * 字节输出流操作步骤：
 * 		1.创建字节输出流对象
 * 		2.写数据
 * 		3.释放资源
 */

public class FileOutputStreamDemo {
	public static void main(String[] args) throws IOException {
		
		// 创建字节输出流对象
		// 方法一：FileOutputStream(File file)
		// File file = new File("fos.txt");
		// FileOutputStream fos = new FileOutputStream(file);
		// 方法二（推荐）：FileOutputStream(String name)
		FileOutputStream fos = new FileOutputStream("fos.txt");	//通过new一下构造方法创建对象
		
		/*
		 * 创建字节输出流对象时发生了什么？
		 * 	1.调用系统去创建文件（系统调用）
		 * 	2.创建字节输出流对象（fos对象）
		 * 	3.把fos对象指向这个文件
		 */
		
		//写数据
		fos.write("hello,IO".getBytes());	//"hello,IO"是字符串，write()只能写字节不能写字符串，需要用getBytes()方法将字符串→字节数组。
	
		
		//释放资源：关闭输出流，释放与此流有关的所有系统资源。
		fos.close();
		/*
		 * 为什么要close()呢?
		 * 1.让流对象变成垃圾，方便GC回收
		 * 2.通知系统释放与该文件相关的资源
		 */
		
	}
}
