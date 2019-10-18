package s4_循环结构_dowhile;
/*
	do...while循环的基本格式：
		do {
			循环体语句;
		}while(判断条件语句);
*/
class DoWhileDemo {
	public static void main(String[] args) {
		//输出10次HelloWorld。
		int x = 0;
		do {
			System.out.println("HelloWorld");
			x++;
		}while(x<10);
		
		System.out.println("--------------");
		
		//求和1-100
		int sum = 0;
		int a = 1;
		do {
			sum += a;
			a++;
		}while(a<=100);
		
		System.out.println(sum);
	}
}