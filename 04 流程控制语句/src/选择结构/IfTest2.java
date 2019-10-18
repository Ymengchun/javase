package s9_选择结构;

import java.util.Scanner;

/*
	三种if语句的使用情况：
		格式1：适合做单个判断
		格式2：适合做两个判断
		格式3：适合做多个判断
		
	需求：
		键盘录入x的值，计算出y的并输出。
		
		x>=3	y = 2x + 1;
		-1<=x<3	y = 2x;
		x<=-1	y = 2x – 1;
		
	分析：
		1.由于数据要键盘录入，所以使用Scanner。
		2.由于是三种判断，所以选择if语句格式3。
*/

class IfTest2 {
	public static void main(String[] args) {
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入x的值：");
		int x = sc.nextInt();
		
		//定义一个y
		int y;
		
		//用if语句格式3进行判断
		if(x >= 3) {
			y = 2*x + 1;
		}else if(x>=-1 && x<3) {
			y = 2*x;
		}else {
			y = 2*x - 1;
		}
		
		System.out.println("y:"+y);
	}
}