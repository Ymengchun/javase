package Demo_05;

/*
 * 需求：把一个字符串的首字母转成大写，其余为小写。(只考虑英文大小写字母字符)
 * 输入：
 * 		helloWORLD
 * 输出：
 * 		Helloworld
 * 
 * 分析：
 * 		1.先获取第一个字符
 * 		2.获取除了第一个字符以外的字符
 * 		3.把A转成大写
 * 		4.把B转成小写
 * 		5.C拼接D
 */
public class StringTest {
	public static void main(String[] args) {
		//定义一个字符串
		String s = "helloWORLD";
		
		//先获取第一个字符
		String s1 = s.substring(0, 1);
		//获取除了第一个字符以外的字符
		String s2 = s.substring(1);
		//把A转成大写
		String s3 = s1.toUpperCase();
		//把B转成小写
		String s4 = s2.toLowerCase();
		//C拼接D
		String s5 = s3 + s4;
		System.out.println(s5);

		//优化后的代码
		String result = s.substring(0, 1).toUpperCase() + (s.substring(1).toLowerCase());
		System.out.println(result);
	}
}
