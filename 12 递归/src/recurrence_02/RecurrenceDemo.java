package recurrence_02;

/*
 * 需求：请用代码实现求5的阶乘。
 * 预备知识：
 * 		5! = 1*2*3*4*5
 * 		5! = 5*4!
 * 
 * 方法
 * 		方法一:循环
 * 		方法二:递归
 * 			a：递归方法
 * 			b：递归出口
 * 			c：递推公式
 */
public class RecurrenceDemo {
	public static void main(String[] args) {
		int jc = 1;
		
		//循环实现
		for (int x = 2; x <= 5; x++) {
			jc *= x;
		}
		System.out.println("5的阶乘是：" + jc);

		//递归实现
		System.out.println("5的阶乘是：" + 	factorial(5));
	}


	public static int factorial(int n) {		//递归方法
		if (n == 1) {	//递归出口
			return 1;
		} else {
			return n * factorial(n - 1);		//递推公式
		}
	}
}
