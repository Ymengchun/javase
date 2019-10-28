package cn.itcast_05;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 获取功能
 *		Pattern和Matcher类的使用
 *		
 *		模式和匹配器的基本使用顺序
 */
public class RegexDemo {
	public static void main(String[] args) {
	
		// 1.把正则表达式编译成模式对象
		Pattern p = Pattern.compile("a*b");
		// 2.通过模式对象得到匹配器对象，这个时候需要的是被匹配的字符串
		Matcher m = p.matcher("aaaaab");
		// 3.调用匹配器对象的功能
		boolean b = m.matches();
		System.out.println(b);
		
		//以上采用模式对象和匹配器对象进行正则表达式匹配，有些麻烦
		//可以直接使用字符串匹配
		boolean bb = "aaaab".matches("a.b");
		System.out.println(bb);
	}
}
