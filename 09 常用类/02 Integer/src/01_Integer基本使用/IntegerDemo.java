package Demo_01;

/*
 * 需求1：把100的二进制，八进制，十六进制计算出来
 * 需求2：判断一个数据是否是int范围内的。
 * 		 首先你的知道int的范围是多大?
 * 
 * 为了对基本数据类型进行更多的操作，java提供了包装类
 * 		byte 			Byte
 * 		short			Short
 * 		int			Integer
 * 		long			Long
 * 		float			Float
 * 		double			Double
 * 		char			Character
 * 		boolean			Boolean
 * 
 * 适用于：基本数据类型与字符串之间的转换。
 */
public class IntegerDemo {
	public static void main(String[] args) {
		//二进制：public static String toBinaryString(int i)
		System.out.println(Integer.toBinaryString(100));
		
		//八进制：public static String toOctalString(int i)
		System.out.println(Integer.toOctalString(100));
		
		//十六进制：public static String toHexString(int i)
		System.out.println(Integer.toHexString(100));

		
		//public static final int MAX_VALUE：int类型的最小范围
		System.out.println(Integer.MAX_VALUE);
		
		//public static final int MIN_VALUE：int类型的最大范围
		System.out.println(Integer.MIN_VALUE);
	}
}