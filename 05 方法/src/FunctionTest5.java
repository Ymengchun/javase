/*
	键盘录入一个数据n(1~9)，输出对应的乘法表
*/
import java.util.Scanner;

class FunctionTest5 {
	public static void main(String[] args) {
		//创建对象
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入n的值(1~9)：");
		int n = sc.nextInt();
		
		//调用
		printNN(n);
	}
	
	/*
		需求：输出对应的nn乘法表
		两个明确：
			返回值类型：void
			参数列表：int n
	*/
	public static void printNN(int n) {
		for(int x=1; x<=n; x++) {	//外循环控制行
			for(int y=1; y<=x; y++) {	//内循环控制列
				System.out.print(y + "*" + x + "=" + y*x + "\t");
			}
			System.out.println();
		}
	}
}