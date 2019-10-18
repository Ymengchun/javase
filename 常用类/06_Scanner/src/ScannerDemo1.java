package Demo_01;

/*
 * Scanner类：用于接收键盘输入的数据
 */
import java.util.Scanner;

public class ScannerDemo1 {
	public static void main(String[] args) {
		//创建对象
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println("x:" + x);
	}
}
