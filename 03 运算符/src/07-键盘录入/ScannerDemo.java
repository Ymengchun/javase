package s7_键盘录入;

import java.util.Scanner;
/*
		1.导包
			格式：
				import java.util.Scanner; 
			位置：
				在class上面。
		2.创建键盘录入对象
			格式：
				Scanner sc = new Scanner(System.in);
		3.通过对象获取数据	
			格式：
				int x = sc.nextInt();
				
		注意：
			nextInt()：获取一个整数
			nextLine()：获取一个字符串
*/


class ScannerDemo {
	public static void main(String[] args) {
		//创建键盘录入数据对象
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请你输入一个数据：");
		int x = sc.nextInt();
		
		System.out.println("你输入的数据是："+x);
	}
}