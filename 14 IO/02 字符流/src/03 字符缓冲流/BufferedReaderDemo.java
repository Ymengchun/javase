package IO_05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * BufferedReader
 * 	1.从字符输入流中读取文本，采用缓冲区，更高效
 *  	2.可以使用默认大小，也可以指定缓冲区大小。大多数情况下，默认缓冲区大小。 
 * 
 * BufferedReader(Reader in)
 */

public class BufferedReaderDemo {
	public static void main(String[] args) throws IOException {
		//创建字符缓冲输入流对象
		BufferedReader br = new BufferedReader(new FileReader("bw.txt"));

		//方式一
		//int ch = 0;
		//while ((ch = br.read()) != -1) {
		//	System.out.print((char) ch);
		//}

		//方式二
		char[] chs = new char[1024];
		int len = 0;
		while ((len = br.read(chs)) != -1) {
			System.out.print(new String(chs, 0, len));
		}

		//释放资源
		br.close();
	}
}
