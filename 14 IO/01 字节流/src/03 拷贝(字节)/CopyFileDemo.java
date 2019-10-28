package IO_03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 需求：复制文本文件。
 * 
 * 数据源：从哪里读
 * 	a.txt--读数据--FileInputStream	
 * 目的地：写到哪里
 * 	FileOutputStream--写数据--b.txt
 * 
 * java.io.FileNotFoundException: a.txt (系统找不到指定文件)
 * 
 * 这一次复制中文没有出现任何问题，为什么呢?
 * 上一次我们出现问题的原因在于我们每次获取到一个字节数据，就人为的把该字节数据转换为了字符数据，然后输出到控制台。
 * 这一次读取一个字节，就写入一个字节，没有任何人为转换，而是自动转换
 * 它会自己做转换。
 */

public class CopyFileDemo {
	public static void main(String[] args) throws IOException {
		//封装数据源
		FileInputStream fis = new FileInputStream("a.txt");
		//封装目的地
		FileOutputStream fos = new FileOutputStream("b.txt");

		int by = 0;
		while ((by = fis.read()) != -1) {	//循环读取，每次读一个字节
			fos.write(by);			//写到文件，每次写一个字节
		}

		//释放资源(先关谁都行，但都得关)
		fos.close();
		fis.close();
	}
}
