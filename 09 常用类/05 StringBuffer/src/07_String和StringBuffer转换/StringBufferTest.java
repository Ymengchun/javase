package Demo_07;

/*
 * 为什么我们要讲解类之间的转换：
 * 		A -- B的转换：我们把A转换为B，是为了使用B的方法。
 * 		B -- A的转换：可能我们要的结果还是A类型，所以还得转回来。
 * 
 * 案例：String、StringBuffer的相互转换
 * 		1、String -- StringBuffer：①通过构造方法；②通过append()方法
 * 		2、StringBuffer -- String：①通过构造方法；②通过toString()方法
 * 不能把String类型的值直接赋值给StringBuffer，反之也不行
 */
public class StringBufferTest {
	public static void main(String[] args) {
		// String -> StringBuffer
		String s = "hello";
		
		// 注意：不能把String类型的值直接赋值给StringBuffer
		//StringBuffer sb = "hello"; //错误
		//StringBuffer sb = s;	//错误
		
		// 方式1：通过构造方法
		StringBuffer sb = new StringBuffer(s);
		// 方式2：通过append()方法
		StringBuffer sb2 = new StringBuffer();
		sb2.append(s);
		System.out.println("sb:" + sb);
		System.out.println("sb2:" + sb2);
		System.out.println("---------------");

		// StringBuffer -> String
		StringBuffer buffer = new StringBuffer("java");
		// 方式1:通过构造方法
		String str = new String(buffer);
		// 方式2：通过toString()方法
		String str2 = buffer.toString();
		System.out.println("str:" + str);
		System.out.println("str2:" + str2);
	}
}
