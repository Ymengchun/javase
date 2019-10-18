package Demo_07;

import java.util.ArrayList;
import java.util.Random;

/*
 * 案例：获取10个1-20之间的随机数，要求不能重复
 * 		1.由于长度不好确定，故不能用数组实现，因为数组的长度是固定的。
 *		2.采用集合。
 * 
 * 分析：
 * 		1.创建产生随机数的对象
 * 		2.创建一个存储随机数的集合。
 * 		3.定义一个统计变量。从0开始。
 * 		4.判断统计量是否小于10
 * 			是：产生一个随机数，判断该随机数在集合中是否存在。
 * 					不存在：就添加，统计变量++。
 * 					存在：跳过，产生下一个随机数
 * 			否：退出循环
 * 		5.遍历集合
 */
public class RandomDemo {
	public static void main(String[] args) {
		//创建产生随机数的对象
		Random r = new Random();

		//创建一个存储随机数的集合。
		ArrayList<Integer> array = new ArrayList<Integer>();

		//定义一个统计变量，从0开始。
		int count = 0;

		//判断统计遍量是否小于10
		while (count < 10) {
			//产生一个随机数
			int number = r.nextInt(20) + 1;	//r.nextInt(20)产生0~19的随机数
			
			//判断该随机数在集合中是否存在
			if(!array.contains(number)){
				//不存在：就添加，统计变量++。
				array.add(number);
				count++;
			}
		}
		
		//遍历集合
		for(Integer i : array){
			System.out.println(i);
		}
	}
}
