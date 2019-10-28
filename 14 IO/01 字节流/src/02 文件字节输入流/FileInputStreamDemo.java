package IO_02;

import java.io.FileInputStream;
import java.io.IOException;

/*
 * 字节输入流操作步骤：
 * 	1.创建字节输入流对象
 * 	2.调用read()方法读取数据，并把数据显示在控制台
 * 	3.释放资源
 * 
 * 读取数据的方式：
 * 	1.int read()：一次读一个字节
 * 	2.int read(byte[] b)：一次读一个字节数组
 */
public class FileInputStreamDemo {
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("FileOutputStreamDemo.java");
		int by = 0;
		//读取，赋值，判断
		while ((by = fis.read()) != -1) {
			System.out.print((char)by);
		}

		//释放资源
		fis.close();
	}
}
