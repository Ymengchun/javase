package IO_04;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 文件字符流
 * 	FileWriter = FileOutputStream + 编码表
 * 
 * 	FileReader = FileInputStream + 编码表
 */

public class CopyFileDemo {
	public static void main(String[] args) throws IOException {
		//封装数据源
		FileReader fr = new FileReader("a.txt");
		//封装目的地
		FileWriter fw = new FileWriter("b.txt");

		//一次一个字符
		//int ch = 0;
		//while ((ch = fr.read()) != -1) {
		//	fw.write(ch);
		//	fw.flush();
		//}

		//一次一个字符数组
		char[] chs = new char[1024];
		int len = 0;
		while ((len = fr.read(chs)) != -1) {
			fw.write(chs, 0, len);
			fw.flush();
		}

		//释放资源
		fw.close();
		fr.close();
	}
}
