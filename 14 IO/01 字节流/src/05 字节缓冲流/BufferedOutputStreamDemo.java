package IO_05;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 
 * 缓冲区类(高效类)
 * 字节缓冲输出流：BufferedOutputStream
 * 字节缓冲输入流：BufferedInputStream
 * 
 * 缓冲区类的构造方法：可以指定缓冲区大小，但通常默认缓冲区大小。
 * 
 * 为什么不传递一个具体的文件或者文件路径，而是传递一个OutputStream对象呢?
 * 原因：字节缓冲区流仅仅提供缓冲区，真正的读写操作还是靠流对象实现。
 */
public class BufferedOutputStreamDemo {
	public static void main(String[] args) throws IOException {
		
		BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream("bos.txt"));

		//写数据
		bos.write("hello".getBytes());

		//释放资源
		bos.close();
	}
}
