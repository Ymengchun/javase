package IO_02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/*
 * 需求：文本文件中存储了几个人名（一行一个），随机获取一个人的名字。
 * 
 * 分析：
 * 	1.把文本文件中的数据存储到集合中
 * 	2.随机产生一个索引
 * 	3.根据索引获取相应的值
 */

public class GetName {
	public static void main(String[] args) throws IOException {
		//把文本文件中的数据存储到集合中
		BufferedReader br = new BufferedReader(new FileReader("b.txt"));
		ArrayList<String> array = new ArrayList<String>();
		String line = null;
		while ((line = br.readLine()) != null) {
			array.add(line);
		}
		br.close();

		//随机产生一个索引
		Random r = new Random();	//随机对象
		int index = r.nextInt(array.size());	//产生0~array.size()的随机数

		//根据该索引获取一个值
		String name = array.get(index);
		System.out.println("该幸运者是：" + name);
	}
}