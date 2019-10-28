package IO_01;

import java.io.FileInputStream;
import java.io.IOException;

/*
 * 建议读取中文时按字节数组读取
 */

public class FileInputStreamDemo {
	public static void main(String[] args) throws IOException {
		//创建字节输入流对象
		FileInputStream fis = new FileInputStream("a.txt");

		//读取数据
		//如果每次按字节读取中文，会出现乱码（因为一个中文占两个字节）
		//int by = 0;
		//while ((by = fis.read()) != -1) {
		//	System.out.print((char)by);
		//}
		
		//建议读取中文时按字节数组读取
		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = fis.read(bys)) != -1) {
			System.out.print(new String(bys, 0, len));
		}

		//释放资源
		fis.close();
	}
}
