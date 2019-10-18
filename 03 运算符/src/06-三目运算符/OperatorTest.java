package s6_三目运算符;

/*
	练习：
		获取两个整数中的最大值
		获取三个整数中的最大值
		比较两个整数是否相同
*/
class OperatorTest {
	public static void main(String[] args) {
		//获取两个整数中的最大值
		int x = 100;
		int y = 200;
		
		int max = (x > y? x: y);
		System.out.println("max:"+max);
		System.out.println("--------");
		
		//获取三个整数中的最大值
		int a = 10;
		int b = 30;
		int c = 20;
		
		//分两步：
		//1.先比较a, b的最大值
		//2.a, b的最大值和c比较
		int temp = ((a > b)? a: b);
		int max1 = (temp > c? temp: c);
		System.out.println("max1:"+max1);
		System.out.println("--------");
		
		//比较两个整数是否相同
		int m = 100;
		int n = 200;
		System.out.println(m==n);
	}
}