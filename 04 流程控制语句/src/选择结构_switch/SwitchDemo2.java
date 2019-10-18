package s1_选择结构_switch;

/*
	switch语句的注意事项：
		1.case后面只能是常量，不能是变量，多个case后面的值不能相同
		2.default可以省略，但不建议
		3.break语法上可以省略，但不建议，因为结果可能与我们想要的不一样
		4.default不一定在最后，但建议在最后
		5.switch语句的结束条件
			a：遇到break结束
			b：执行到末尾结束
*/
import java.util.Scanner;

class SwitchDemo2 {
	public static void main(String[] args) {
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		
		//控制键盘录入数据
		System.out.println("请输入一个数据(1-7):");
		int week = sc.nextInt(); //3
		
		//case后面不能是变量
		//int number = 3;
		//然后把case后面的值改为number，就会报错
		
		//switch语句
		switch(week) {
			case 1:
				System.out.println("星期一");
				break;
			case 2:
				System.out.println("星期二");
				break;
			case 3:
				System.out.println("星期三");
				break;
			case 4:
				System.out.println("星期四");
				break;
			case 5:
				System.out.println("星期五");
				break;
			case 6:
				System.out.println("星期六");
				break;
			case 7:
				System.out.println("星期日");
				break;
			default:
				System.out.println("你输入的数据有误");
				//break;
		}
	}
}