package Demo_04;

/*
 * 需求：遍历获取字符串中的每一个字符
 * 
 * 分析：
 * 		1.如何能够拿到每一个字符呢?
 * 			char charAt(int index)
 * 		2.我怎么知道字符到底有多少个呢?
 * 			int length()
 */
public class StringTest {
	public static void main(String[] args) {
		String s = "helloworld";

		for (int x = 0; x < s.length(); x++) {
			System.out.println(s.charAt(x));
		}
	}
}
