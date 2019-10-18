package Demo_06;

/*
 * 字符串的比较：String类实现了Comparable接口，重写了compareTo()方法
 */
public class StringTest {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "hel";
		System.out.println(s1.compareTo(s2)); //2
	}
}
