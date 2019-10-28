package IO_03;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
 * 字符输出流OutputStreamWriter的方法
 * 	ublic void write(int c):写一个字符
 * 	public void write(char[] cbuf)：写一个字符数组
 * 	public void write(char[] cbuf, int off, int len)：写一个字符数组的一部分
 * 	public void write(String str)：写一个字符串
 * 	public void write(String str, int off, int len)：写一个字符串的一部分
 * 
 * 面试题：close()和flush()的区别？
 * 	1.close()：先刷新缓冲区，再关闭流对象。关闭后，流对象不可以使用。
 * 	2.flush()：只刷新缓冲区。刷新后，流对象还可以使用。
 */

public class OutputStreamWriterDemo2 {
	public static void main(String[] args) throws IOException {
		//创建对象
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("osw2.txt"));

		//写数据
		//public void write(int c)：写一个字符
		//osw.write('a');
		//osw.write(97);
		//执行上述两步后文件中并没有写入内容，原因是：文件存储数据的基本单位是字节，1字符=2字节
		//相当于一个门一次只能过一个人，现在同时过两个人，卡住了。解决方法：踹一脚——fulsh()方法。
		//void flush()

		//public void write(char[] cbuf)：写一个字符数组
		//char[] chs = {'a','b','c','d','e'};
		//osw.write(chs);

		//public void write(char[] cbuf, int off, int len)：写一个字符数组的一部分
		//osw.write(chs,1,3);

		//public void write(String str)：写一个字符串
		//osw.write("我爱林青霞");

		// public void write(String str,int off,int len):写一个字符串的一部分
		osw.write("我爱林青霞", 2, 3);

		//刷新缓冲区
		osw.flush();
		//osw.write("我爱林青霞", 2, 3);	//刷新后流对象还能再使用

		//释放资源
		osw.close();
		//java.io.IOException: Stream closed，关闭后流对象不能再使用
		//osw.write("我爱林青霞", 2, 3);
	}
}
