package IO_01;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 字节输出流操作步骤：
 * 	1.创建字节输出流对象
 * 	2.调用write()方法
 * 	3.释放资源
 * 
 * public void write(int b)：写一个字节
 * public void write(byte[] b)：写一个字节数组
 * public void write(byte[] b, int off, int len)：写一个字节数组的一部分
 * 写入的数据是按ASCII码写入的
 */

public class FileOutputStreamDemo2 {
	public static void main(String[] args) throws IOException {
		
		// 创建字节输出流对象
		// OutputStream os = new FileOutputStream("fos2.txt"); // 多态（不用，写着玩）
		FileOutputStream fos = new FileOutputStream("fos2.txt");

		//public void write(int b)：写一个字节
		//fos.write(97); 	//文件中显示'a'：97--底层二进制数据--通过记事本打开--找97对应的字符值--a
		//fos.write(57);	//文件中显示'9'
		//fos.write(55);	//文件中显示'7'
		
		//public void write(byte[] b)：写一个字节数组
		byte[] bys = {97, 98, 99, 100, 101};	//abcde
		fos.write(bys);
		
		//public void write(byte[] b,int off,int len)：写一个字节数组的一部分
		fos.write(bys, 1, 3);	//从索引为1的字节开始写，写3个（第2位~第4位）
		
		//释放资源
		fos.close();
	}
}
