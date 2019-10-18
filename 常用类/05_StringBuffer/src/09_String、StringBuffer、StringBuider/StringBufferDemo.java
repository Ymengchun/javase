package cn.itcast_08;

/*
 * 面试题：
 * 		1：String、StringBuffer、StringBuilder的区别？
 * 			A：String的内容不可变，而StringBuffer、StringBuilder的内容可变。
 * 			B：StringBuffer是同步的，数据安全，效率低；StringBuilder是不同步的，数据不安全，效率高。
 * 
 * 		2：StringBuffer、数组的区别？
 * 			相同点：二者都是一个容器，装其他的数据。
 * 			不同点：StringBuffer的是一个字符串数据，只能装字符串；数组可以放同一类型的多种数据。
 * 
 * 		3：形式参数问题
 * 			String作为参数传递
 * 			StringBuffer作为参数传递 
 * 
 * 形参：
 * 		1、基本类型：改变形参不会影响实参
 * 		2、引用类型：改变形参会影响实参
 * 
 * 注意：
 * 		String作为参数传递，效果和基本类型作为参数传递是一样的。
 */
public class StringBufferDemo {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "world";
		System.out.println(s1 + "---" + s2);	// hello---world
		change(s1, s2);
		System.out.println(s1 + "---" + s2);	// hello---world

		StringBuffer sb1 = new StringBuffer("hello");
		StringBuffer sb2 = new StringBuffer("world");
		System.out.println(sb1 + "---" + sb2);// hello---world
		change(sb1, sb2);
		System.out.println(sb1 + "---" + sb2);// hello---worldworld

	}

	public static void change(StringBuffer sb1, StringBuffer sb2) {
		sb1 = sb2;
		sb2.append(sb1);
	}

	public static void change(String s1, String s2) {
		s1 = s2;
		s2 = s1 + s2;
	}
}
