package IO_05;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/*
 * 读取方式有两种：一次读一个字节、一次读一个字节数组。但是针对同一个对象时，只能使用一个。
 */
public class BufferedInputStreamDemo {
	public static void main(String[] args) throws IOException {
		// BufferedInputStream(InputStream in)
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(
				"bos.txt"));

		//读取数据
		//int by = 0;
		//while ((by = bis.read()) != -1) {
		//	System.out.print((char)by);
		//}
		//System.out.println("---------");

		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = bis.read(bys)) != -1) {
			System.out.print(new String(bys, 0, len));
		}

		//释放资源
		bis.close();
	}
}
