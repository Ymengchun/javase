
package Demo_07;

import java.util.Scanner;

/*
 * 字符串反转：倒着遍历字符串
 * 举例：键盘录入“abc”		
 * 输出结果：“cba”
 * 
 * 分析：
 * 		1.键盘录入一个字符串
 * 		2.定义一个新字符串
 * 		3.倒着遍历字符串，得到每一个字符
 * 			a:length()和charAt()结合
 * 			b:把字符串转成字符数组
 * 		4.用新字符串把每一个字符拼接起来
 * 		5.输出新字符串
 */
public class StringTest3 {
	public static void main(String[] args) {
		//键盘录入一个字符串
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串：");
		String line = sc.nextLine();
	}
	
	//将字符串反转的方法
	public static String myReverse(String s) {
		//定义一个新字符串
		String result = "";

		//把字符串转成字符数组
		char[] chs = s.toCharArray();

		//倒着遍历字符串，得到每一个字符
		for (int x = chs.length - 1; x >= 0; x--) {
			//用新字符串把每一个字符拼接起来
			result += chs[x];
		}
		return result;
	}
}
