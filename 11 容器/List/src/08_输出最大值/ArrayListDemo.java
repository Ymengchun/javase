package Demo_08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/*
 * 案例：键盘录入多个数据，输入0结束，要求在控制台输出所有数据中的最大值
 *
 * 分析：
 * 		1.创建键盘录入数据对象
 * 		2.用集合存储数据
 * 		3.以0结束：如果键盘录入0，就停止接收数据
 * 		4.对集合排序
 * 		5.获取集合中的最大索引的值
 */
public class ArrayListDemo {
	public static void main(String[] args) {
		//创建键盘录入数据对象
		Scanner sc = new Scanner(System.in);

		//键盘录入多个数据，以0结束
		ArrayList<Integer> array = new ArrayList<Integer>();
		while (true) {
			System.out.println("请输入数据：");
			int number = sc.nextInt();
			if (number != 0) {
				array.add(number);
			} else {
				break;
			}
		}
		
		Collections.sort(array);
		System.out.println("最大值为：" + array.get(array.size()-1));
	}
}


