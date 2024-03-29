package IO_02;

import java.io.FileInputStream;
import java.io.IOException;

/*
 * 一次读取一个字节数组：int read(byte[] b)
 * 返回值：实际读取的字节个数。
 */

public class FileInputStreamDemo2 {
	public static void main(String[] args) throws IOException {
		
		//数组的长度一般是1024或者1024的整数倍
		FileInputStream fis = new FileInputStream("FileOutputStreamDemo.java");
		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = fis.read(bys)) != -1) {
			System.out.print(new String(bys, 0, len));	//起点为0，总长度为len
		}

		//释放资源
		fis.close();
	}
}