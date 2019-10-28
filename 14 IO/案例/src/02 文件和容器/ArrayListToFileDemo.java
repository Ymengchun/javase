package IO_02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 * 需求：把ArrayList集合中的字符串存储到文本文件
 * 
 * 分析：
 * 	1.ArrayList中存储的是字符串
 * 	2.遍历ArrayLis合，获取所有字符串
 * 	3.存储到文本文件中
 * 	4.文本文件——使用字符流
 * 
 * 数据源：
 * 	ArrayList<String> -- 遍历获取所有字符串
 * 目的地：
 * 	a.txt -- FileWriter -- BufferedWriter
 */

public class ArrayListToFileDemo {
	public static void main(String[] args) throws IOException {
		//创建集合对象（封装数据源）
		ArrayList<String> array = new ArrayList<String>();
		array.add("hello");
		array.add("world");
		array.add("java");

		//封装目的地
		BufferedWriter bw = new BufferedWriter(new FileWriter("a.txt"));

		//遍历集合
		for (String s : array) {
			//写数据
			bw.write(s);
			bw.newLine();
			bw.flush();
		}

		//释放资源
		bw.close();
	}
}
