package Demo_03;

import java.util.Scanner;

/*
 * 案例：统计一个字符串中大写字母字符，小写字母字符，数字字符出现的次数(不考虑其他字符)。
 * 
 * 分析：
 * 		1.定义三个统计变量。
 * 			int bigCont=0;
 * 			int smalCount=0;
 * 			int numberCount=0;
 * 		2.键盘录入一个字符串。
 * 		3.把字符串转换为字符数组。
 * 		4.遍历字符数组获取到每一个字符
 * 		5.判断该字符是
 * 			大写	bigCount++;
 * 			小写	smalCount++;
 * 			数字	numberCount++;
 * 		6.输出结果即可
 */
public class CharacterTest {
	public static void main(String[] args) {
		//定义三个统计变量。
		int bigCount = 0;
		int smallCount = 0;
		int numberCount = 0;

		//键盘录入一个字符串。
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串：");
		String line = sc.nextLine();

		// 把字符串转换为字符数组。
		char[] chs = line.toCharArray();

		//历字符数组获取到每一个字符
		for (char ch : chs) {

			//判断该字符
			if (Character.isUpperCase(ch)) {
				bigCount++;
			} else if (Character.isLowerCase(ch)) {
				smallCount++;
			} else if (Character.isDigit(ch)) {
				numberCount++;
			}
		}

		//输出结果即可
		System.out.println("大写字母：" + bigCount + "个");
		System.out.println("小写字母：" + smallCount + "个");
		System.out.println("数字字符：" + numberCount + "个");
	}
}
