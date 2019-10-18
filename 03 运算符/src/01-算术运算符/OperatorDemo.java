package s1_算术运算符;

/*
	运算符：
		就是对常量和变量进行操作的符号。
		
	分类：算术运算符，赋值运算符，比较运算符，逻辑运算符，位运算符，三目运算符

	算术运算符：+, -, *, /, %, ++, --
		
	注意：
		1.整数相除只能得到整数。如果想得到小数，必须把数据变化为浮点数类型
		2./获取的是商，%获取的是余数
*/

class OperatorDemo {
	public static void main(String[] args) {
		//定义变量
		int x = 3;  //把3赋值给int类型的变量x
		int y = 4;
		
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y); //整数相除只能得到整数
		
		//想得到浮点数，可以把任意的一个操作数变为浮点数
		System.out.println(x * 1.0 / y);
		
		//%的应用
		System.out.println(x % y); //得到的是余数
	}
}