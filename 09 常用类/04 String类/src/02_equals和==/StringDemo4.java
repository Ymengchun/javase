package Demo_02;

/*
 * 字符串变量相加：先创建一个新对象，再把拼接的值给新对象。
 * 字符串常量相加：先拼接，再在常量池中找，找到了就返回，找不到就根据拼接的值创建一个新对象。
 */
public class StringDemo4 {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "world";
		String s3 = "helloworld";
		System.out.println(s3 == s1 + s2);	//false，地址不相等
		System.out.println(s3.equals((s1 + s2)));	//true，内容相等

		System.out.println(s3 == "hello" + "world");	//true
		System.out.println(s3.equals("hello" + "world"));	// true

		// 通过反编译看源码，我们知道这里已经做好了处理。
		// System.out.println(s3 == "helloworld");
		// System.out.println(s3.equals("helloworld"));
	}
}
