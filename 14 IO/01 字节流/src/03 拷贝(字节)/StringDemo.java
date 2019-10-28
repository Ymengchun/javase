package IO_03;

import java.util.Arrays;

/*
 * 计算机是如何知道什么时候该把两个字节转换为一个中文呢?
 * 中文的存储分两个字节：
 * 		第一个字节：负数。
 * 		第二个字节：常见的是负数，可能有正数。但是没影响。
 * 
 * 结论：如果是负数，就把两个字节转换为一个中文；如果是正数就不管。
 */

public class StringDemo {
	public static void main(String[] args) {
		//String s = "abcde";
		//输出[97, 98, 99, 100, 101]

		String s = "我爱你中国";
		//输出[-50, -46, -80, -82, -60, -29, -42, -48, -71, -6]

		byte[] bys = s.getBytes();
		System.out.println(Arrays.toString(bys));	//toString()：将一个逻辑值转化为字符串
	}
}