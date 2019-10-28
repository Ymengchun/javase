package Demo_03;

/*
 * int、String的转换
 * 		1、int -- String
 * 			String.valueOf(number)
 * 		2、String -- int
 * 			Integer.parseInt(s)
 */
public class IntegerDemo {
	public static void main(String[] args) {
		//int -- String
		int number = 100;
		
		//方式1：字符串拼接
		String s1 = "" + number;
		System.out.println("s1:" + s1);
		
		//方式2
		String s2 = String.valueOf(number);
		System.out.println("s2:" + s2);
		
		//方式3
		//public static String toString(int i)
		String s4 = Integer.toString(number);
		System.out.println("s4:" + s4);
		System.out.println("-----------------");

		

		//String -- int
		String s = "100";
		int y = Integer.parseInt(s);
		System.out.println("y:"+ y);
	}
}
