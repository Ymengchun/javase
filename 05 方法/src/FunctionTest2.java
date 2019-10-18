/*
	需求：键盘录入两个数据，比较是否相等
	
	分析：
		比较两个数是否相等结果是一个boolean类型。
*/
import java.util.Scanner;

class FunctionTest2 {
	public static void main(String[] args) {
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入第一个数据:");
		int a = sc.nextInt();
		
		System.out.println("请输入第二个数据:");
		int b = sc.nextInt();
		
		boolean flag = compare(a,b);
		System.out.println(flag);
	}
	
	/*
		需求：比较两个数是否相等
		两个明确：
			返回值类型：boolean
			参数列表：int a, int b
	*/
	public static boolean compare(int a,int b) {
		return a == b;
	}
}