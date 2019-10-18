package Demo_04;

/*
 * 需求：统计一个字符串中大写字母字符，小写字母字符，数字字符出现的次数。(不考虑其他字符)
 * 举例：
 * 		"Hello123World"
 * 结果：
 * 		大写字符：2个
 * 		小写字符：8个
 * 		数字字符：3个
 * 
 * 分析：
 * 		前提：字符串要存在
 * 		1.定义三个统计变量
 * 			bigCount=0
 * 			smallCount=0
 * 			numberCount=0
 * 		2.遍历字符串，得到每一个字符。
 * 			length()和charAt()结合
 * 		3.判断该字符到底是属于那种类型的
 * 			大：bigCount++
 * 			小：smallCount++
 * 			数字：numberCount++
 * 
 * 		  方法一：
 * 			ASCII码表：
 * 				0	48
 * 				A	65
 * 				a	97
 * 		 方法二：
 * 			char ch = s.charAt(x);
 * 			if(ch>='0' && ch<='9') numberCount++
 * 			if(ch>='a' && ch<='z') smallCount++
 * 			if(ch>='A' && ch<='Z') bigCount++
 *		
 *		4.输出结果
 *
 * 练习：把给定字符串的方式，改进为键盘录入字符串的方式。
 */
public class StringTest2 {
	public static void main(String[] args) {
		//定义一个字符串
		String s = "Hello123World";
		
		//定义三个统计变量
		int bigCount = 0;
		int smallCount = 0;
		int numberCount = 0;
		
		//遍历字符串，得到每一个字符。
		for(int x=0; x<s.length(); x++){
			char ch = s.charAt(x);
			
			//判断该字符到底是属于那种类型的
			if(ch>='a' && ch<='z'){
				smallCount++;
			}else if(ch>='A' && ch<='Z'){
				bigCount++;
			}else if(ch>='0' && ch<='9'){
				numberCount++;
			}
		}
		
		//输出结果。
		System.out.println("大写字母"+bigCount+"个");
		System.out.println("小写字母"+smallCount+"个");
		System.out.println("数字"+numberCount+"个");
	}
}