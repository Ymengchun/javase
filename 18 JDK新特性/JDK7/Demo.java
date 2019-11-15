package cn.itcast_03;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Demo {
	public static void main(String[] args) {
		// 1.二进制字面量：使用二进制表示整数（byte,short,int,long），加前缀0b或0B
		int x = 0b100101;
		System.out.println(x);

		// 2. 数字字面量可以出现下划线（方便划分数位）
		// int y = 1_1123_1000;
		// 不能出现在进制标识和数值之间
		// int b = 0x_1122;
		// 不能出现在数值开头和结尾
		// int a1 = _11;
		// int a2 = 11_;
		// 不能出现在小数点旁边
		// double d1 = 12._34;
		// double d1 = 12_.34;
		

		// 3.switch 语句可以用字符串

		// 4.泛型简化
		ArrayList<String> array = new ArrayList<>();

		// 5.异常的多个catch合并

	}

	// 6.try-with-resources 语句
	private static void method() {
		// 原先的
		try {
			FileReader fr = new FileReader("a.txt");
			FileWriter fw = new FileWriter("b.txt");
			int ch = 0;
			while ((ch = fr.read()) != -1) {
				fw.write(ch);
			}
			fw.close();
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// 改进版：用try-with-resources 语句改进
		// 作用：把需要close()的资源放在try()中，省略后序的close()
		// try(必须是java.lang.AutoClosable的子类对象)
		try (FileReader fr = new FileReader("a.txt");
				FileWriter fw = new FileWriter("b.txt");) {
			int ch = 0;
			while ((ch = fr.read()) != -1) {
				fw.write(ch);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
