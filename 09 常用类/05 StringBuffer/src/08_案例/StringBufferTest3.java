package Demo_07;

import java.util.Scanner;

/*
 * 案例：字符串反转
 */
public class StringBufferTest3 {
	public static void main(String[] args) {
		// 键盘录入数据
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入数据：");
		String s = sc.nextLine();

		// 方式1：用String做拼接
		String s1 = myReverse(s);
		System.out.println("s1:" + s1);
		// 方式2：用StringBuffer的reverse()功能
		String s2 = myReverse2(s);
		System.out.println("s2:" + s2);
	}

	
	// 方法一：用String做拼接
		public static String myReverse(String s) {
			String result = "";

			char[] chs = s.toCharArray();
			for (int x = chs.length - 1; x >= 0; x--) {
				// char ch = chs[x];
				// result += ch;
				result += chs[x];
			}

			return result;
		}
	
	
		
	// 方法二：用StringBuffer的reverse()功能
	public static String myReverse2(String s) {
		return new StringBuffer(s).reverse().toString();
	}

	
}
