package IO_04;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 需求：把c:\\a.txt内容复制到d:\\b.txt中
 * 
 * 数据源：
 * 		c:\\a.txt--读取数据--FileInputStream
 * 目的地：
 * 		FileOutputStream--写出数据--d:\\b.txt
 */

public class CopyFileDemo {
	public static void main(String[] args) throws IOException {
		//封装数据源
		FileInputStream fis = new FileInputStream("c:\\a.txt");
		FileOutputStream fos = new FileOutputStream("d:\\b.txt");

		//复制数据
		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = fis.read(bys)) != -1) {
			fos.write(bys, 0, len);	//这里与之前不同，没有用new String()
		}

		//释放资源
		fos.close();
		fis.close();
	}
}
