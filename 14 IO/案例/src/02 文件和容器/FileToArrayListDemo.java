package IO_02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
 * 需求：从文本文件中读取数据(每行为一个字符串)到集合中，并遍历集合
 * 
 * 分析
 * 	1.数据源是一个文本文件——使用字符流
 * 	2.目的地是一个集合
 * 	3.元素是字符串
 * 
 * 数据源：
 * 	b.txt -- FileReader -- BufferedReader
 * 目的地：
 * 	ArrayList<String>
 */

public class FileToArrayListDemo {
	public static void main(String[] args) throws IOException {
		//封装数据源
		BufferedReader br = new BufferedReader(new FileReader("b.txt"));
		//封装目的地(创建集合对象)
		ArrayList<String> array = new ArrayList<String>();

		//读取数据存储到集合中
		String line = null;
		while ((line = br.readLine()) != null) {
			array.add(line);
		}

		//释放资源
		br.close();

		//遍历集合
		for (String s : array) {
			System.out.println(s);
		}
	}
}
