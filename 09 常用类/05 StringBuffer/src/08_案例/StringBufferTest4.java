package Demo_07;

import java.util.Scanner;

/*
 * 案例：判断一个字符串是否是对称字符串
 * 分析：
 * 		1、比较第一个和最后一个字符换是否相等；
 * 		2、比较第二个和倒数第二个字符是否相等；
 * 			...
 * 		比较的次数是长度除以2。
 */
public class StringBufferTest4 {
	public static void main(String[] args) {
		// 创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串：");
		String s = sc.nextLine();

		// 一个一个的比较
		boolean b = isSame(s);
		System.out.println("b:" + b);
		
		// 用字符串缓冲区的反转功能
		boolean b2 = isSame2(s);
		System.out.println("b2:"+b2);
	}
	
	
	//方法1
	public static boolean isSame(String s) {
		boolean flag = true;

		// 把字符串转成字符数组
		char[] chs = s.toCharArray();

		//双指针
		for (int start = 0, end = chs.length - 1; start <= end; start++, end--) {
			if (chs[start] != chs[end]) {
				flag = false;
				break;
			}
		}

		return flag;
	}
	
	//方法二：用StringBuffer的reverse()反转后，再与原字符串比较
	public static boolean isSame2(String s) {
		// StringBuffer没有重写equals()，无法比较内容是否相同，因此必须再转化为String比较
		return new StringBuffer(s).reverse().toString().equals(s);	
	}
}
