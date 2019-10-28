package cn.itcast_03;

import java.util.Scanner;

/*
 * 分割功能
 *		String类的public String[] split(String regex)
 *		
 *
 * 举例：
 * 		百合网，世纪佳缘,珍爱网,QQ
 * 		搜索好友
 * 			性别：女
 * 			范围："18-24"
 * 
 * 		age>=18 && age<=24
 */
public class RegexDemo {
	public static void main(String[] args) {
		//定义一个年龄搜索范围
		String ages = "18-24";
		
		
		//调用方法
		String[] strArray = ages.split("-");
		
		
		//如何得到int类型的呢?
		int startAge = Integer.parseInt(strArray[0]);
		int endAge = Integer.parseInt(strArray[1]);
		
		//键盘录入年龄
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你的年龄：");
		int age = sc.nextInt();
		
		if(age>=startAge && age<=endAge) {
			System.out.println("你就是我想找的");
		}else {
			System.out.println("不符合我的要求，gun");
		}
	}
}
