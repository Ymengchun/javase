package s9_选择结构;

import java.util.Scanner;

/*
	键盘录入月份的值，输出对应的季节。
	
	春	3,4,5
	夏	6,7,8
	秋	9,10,11
	冬	12,1,2
	
	分析：
		1.键盘录入月份的值，使用Scanner。
		2.判断情况较多，用if语句格式3。
		
	if语句的使用场景：
		1.针对表达式是boolean类型的判断
		2.针对范围的判断
*/

class IfTest3 {
	public static void main(String[] args) {
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		
		//录入数据
		System.out.println("请你输入一个月份:");
		int month = sc.nextInt();
		
		if(month<1 || month>12) {
			System.out.println("你输入的月份有误");
		}else if(month>=3 && month<=5) {
			System.out.println("春季");
		}else if(month>=6 && month<=8) {
			System.out.println("夏季");
		}else if(month>=9 && month<=11) {
			System.out.println("秋季");
		}else {
			System.out.println("冬季");
		}
		System.out.println("--------------");
	}
}