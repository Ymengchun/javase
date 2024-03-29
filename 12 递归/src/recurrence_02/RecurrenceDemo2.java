package recurrence_02;

/*
 * 有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问第二十个月的兔子对数为多少？
 * 分析：我们要想办法找规律
 * 			兔子对数
 * 第一个月： 	1
 * 第二个月：	1
 * 第三个月：	2
 * 第四个月：	3	
 * 第五个月：	5
 * 第六个月：	8
 * ...
 * 
 * 由此可见兔子对象的数据是：斐波那契数列
 * 		1,1,2,3,5,8...
 * 规则：
 * 		A：从第三项开始，每一项是前两项之和
 * 		B：而且说明前两项是已知的
 * 
 * 如何实现这个程序呢?
 * 		A：数组实现
 * 		B：变量的变化实现
 * 		C：递归实现
 * 
 */
public class RecurrenceDemo2 {
	public static void main(String[] args) {
		
		//方法一：数组实现
		int[] arr = new int[20];
		arr[0] = 1;
		arr[1] = 1;
		for (int x = 2; x < arr.length; x++) {
			arr[x] = arr[x - 2] + arr[x - 1];
		}
		System.out.println(arr[19]);// 6765
		System.out.println("----------------");

		//方法二：变量实现
		int a = 1;
		int b = 1;
		for (int x = 0; x < 18; x++) {
			// 临时变量存储上一次的a
			int temp = a;
			a = b;
			b = temp + b;
		}
		System.out.println(b);
		System.out.println("----------------");

		//方法三：递归实现
		System.out.println(fib(20));
	}

		
	public static int fib(int n) {
		if (n == 1 || n == 2) {
			return 1;
		} else {
			return fib(n - 1) + fib(n - 2);
		}
	}
}