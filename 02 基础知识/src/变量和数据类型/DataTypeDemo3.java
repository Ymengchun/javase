package 变量和数据类型;

/*
	+：加法运算符/字符串连接符
	
	注意：
		boolean类型不能转换为其他的数据类型

	默认转换（小→大）
		1.byte, short, char → int, long, float, double
		2.byte, short, char之间不能转换，他们之间运算时先转换为int类型
		
	大→小时可能损失精度
*/

class DataTypeDemo3 {
	public static void main(String[] args) {
		//加法
		//System.out.println(3 + 4);
	
		//两个int类型做加法
		int x = 3;
		int y = 4;
		int z = x + y;
		System.out.println(z);
		
		//定义一个byte类型，一个int类型，做加法
		byte a = 3;
		int b = 4;
		System.out.println(a + b);
		
		//可能损失精度
		//byte c =  a + b;
		int c = a + b;
		System.out.println(c);
	}
}