package Demo_04;

/*
 * 进制转换
 * 	public static String toBinaryString(int i)
 * 	public static String toOctalString(int i)
 * 	public static String toHexString(int i)
 * 
 * 十进制到其他进制:
 * 		public static String toString(int i, int radix)
 * 由这个我们也看到了进制的范围：2-36
 * 为什么呢?0,...9,a...z
 * 
 * 其他进制到十进制
 * public static int parseInt(String s,int radix)
 */
public class IntegerDemo {
	public static void main(String[] args) {
		//十进制到二进制，八进制，十六进制
		System.out.println(Integer.toBinaryString(100));
		System.out.println(Integer.toOctalString(100));
		System.out.println(Integer.toHexString(100));
		System.out.println("-------------------------");

		//十进制到其他进制
		System.out.println(Integer.toString(100, 10));
		System.out.println(Integer.toString(100, 2));	//十进制的100到二进制是1100100
		System.out.println(Integer.toString(100, 8));
		System.out.println(Integer.toString(100, 16));
		System.out.println(Integer.toString(100, 5));
		System.out.println(Integer.toString(100, 7));
		System.out.println(Integer.toString(100, -7));
		System.out.println(Integer.toString(100, 70));
		System.out.println(Integer.toString(100, 1));
		System.out.println(Integer.toString(100, 17));
		System.out.println(Integer.toString(100, 32));
		System.out.println(Integer.toString(100, 37));
		System.out.println(Integer.toString(100, 36));
		System.out.println("-------------------------");
		
		//其他进制到十进制
		System.out.println(Integer.parseInt("100", 10));
		System.out.println(Integer.parseInt("100", 2));		//二进制的100到十进制是4
		System.out.println(Integer.parseInt("100", 8));		//八进制的100到十进制是64
		System.out.println(Integer.parseInt("100", 16));
		System.out.println(Integer.parseInt("100", 23));
		//NumberFormatException
		//System.out.println(Integer.parseInt("123", 2));	//123超出了二进制的表示范围
	}
}
