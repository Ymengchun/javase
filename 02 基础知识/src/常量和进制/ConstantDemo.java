package 常量和进制;

/*
	常量：
		在程序执行过程中，其值不发生改变的量。
		
	分类：
		1.字面值常量
		2.自定义常量(后面讲)
		
	字面值常量
		1.字符串常量	用双引号括起来
			举例："hello", "world", "HelloWorld"
		2.整数常量	所有的整数
			举例：100, 200
		3.小数常量	所有的小数
			举例：10.23, 110.11
		4.字符常量	用单引号括起来
			举例：'a', 'A', '0'
			错误的：'ab'
		5.布尔常量	比较特殊
			只有两个：true, false
		6.空常量	
			只有一个：null
*/

class ConstantDemo {
	public static void main(String[] args) {
		//字符串常量
		System.out.println("hello");
		
		//整数常量
		System.out.println(100);
		
		//小数常量
		System.out.println(100.10);
		
		//字符常量
		System.out.println('a');
		System.out.println('A');
		System.out.println('0');
		//这个是有问题的
		//System.out.println('ab');
		
		//布尔常量
		System.out.println(true);
		System.out.println(false);
	}
}
