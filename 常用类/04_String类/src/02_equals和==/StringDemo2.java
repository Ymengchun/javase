package Demo_02;

/*
 * String s = new String(“hello”); 和 String s = “hello”; 的区别？
 * 		前者——创建2个对象，后者——创建1个对象。
 * 
 * ==：比较地址值是否相同
 * equals：默认情况——比较地址值是否相同，等效于==。而String类重写了equals()方法——比较字符串内容是否相同。
 */
public class StringDemo2 {
	public static void main(String[] args) {
		String s1 = new String("hello");
		String s2 = "hello";

		System.out.println(s1 == s2);//false
		System.out.println(s1.equals(s2));//true
	}
}