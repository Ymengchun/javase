package Demo_03;

import java.util.Scanner;

/*
 * 常用的两个方法：
 * 		public int nextInt()：获取一个int类型的值
 * 		public String nextLine()：获取一个String类型的值
 * 
 * 
 * 注意：先获取一个int再获取一个String，会出现问题：从控制台输入第一个数据，回车，还未输入第二个数据就直接停止输入，输出结果只显示数字的问题！
 * 原因：输入数回车，则自动识别赋值给int变量，而回车则为\n\r，识别为字符串，则自动赋值给String变量，而车在控制台上不显示，给我们的感觉是，只输入了一个就直接停止输入了
 * 解决：
 * 		方法1：先获取一个数值后，再创建一个新的键盘录入对象获取字符串。
 * 		方法2：把所有的数据都先按照字符串获取，然后要什么，你就对应的转换为什么（推荐）
 */
public class ScannerDemo3 {
	public static void main(String[] args) {
		//创建对象
		Scanner sc = new Scanner(System.in);

		//获取两个int类型的值：没有问题
		//int a = sc.nextInt();
		//int b = sc.nextInt();
		//System.out.println("a:" + a + ",b:" + b);
		//System.out.println("-------------------");

		//获取两个String类型的值：没有问题
		//String s1 = sc.nextLine();
		//String s2 = sc.nextLine();
		//System.out.println("s1:" + s1 + ",s2:" + s2);
		//System.out.println("-------------------");

		//先获取一个字符串，再获取一个int值：没有问题
		//String s1 = sc.nextLine();
		//int b = sc.nextInt();
		//System.out.println("s1:" + s1 + ",b:" + b);
		//System.out.println("-------------------");

		//先获取一个int值，再获取一个字符串：有问题
		//int a = sc.nextInt();
		//String s2 = sc.nextLine();
		//System.out.println("a:" + a + ",s2:" + s2);
		//System.out.println("-------------------");

		int a = sc.nextInt();
		Scanner sc2 = new Scanner(System.in);
		String s = sc2.nextLine();
		System.out.println("a:" + a + ",s:" + s);
	}
}
