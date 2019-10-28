package IO_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * System.in 标准输入流，从键盘获取数据
 * 
 * 键盘输入数据的方法：
 * 		1.main方法的args接收参数。
 * 			java HelloWorld hello world java
 * 		2.Scanner(JDK5以后的)
 * 			Scanner sc = new Scanner(System.in);
 * 			String s = sc.nextLine();
 * 			int x = sc.nextInt()
 * 		3.通过字符缓冲流包装标准输入流实现
 * 			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 */
public class SystemInDemo {
	public static void main(String[] args) throws IOException {
		
		//BufferedReader是字符缓冲流，只能包装字符流，而System.in获取的是字节流，故应当用转换流InputStreamReader将字节流转化为字符流
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("请输入一个字符串：");
		String line = br.readLine();	//readLine：一次读取一行
		System.out.println("你输入的字符串是：" + line);

		System.out.println("请输入一个整数：");
		//readLine是按字符串读取，必须转化为整型数
		int i = Integer.parseInt(br.readLine());
		System.out.println("你输入的整数是：" + i);
	}
}
