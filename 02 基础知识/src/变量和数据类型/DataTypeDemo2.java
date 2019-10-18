package 变量和数据类型;

/*
	使用变量的注意事项：
		1.作用域
			变量定义在哪个大括号内，就在那个大括号内有效。
			同一个大括号内不能定义同名的变量。
			
		2.初始化值
			没有初始化值的变量不能使用。
			定义变量的格式：
				a：数据类型 变量名 = 初始化值;
				b：数据类型 变量名;
				      变量名 = 初始化值;
				      
		3.建议一行只定义一个变量
*/

class DataTypeDemo2 {
	public static void main(String[] args) {
		//定义变量
		int x = 100;
		
		//错误，不能同名
		//int x = 200;
		
		//错误：定义变量必须初始化值
		//int y;
		//System.out.println(y);
		
		int z;
		z = 100;
		System.out.println(z);
		
		//不建议一行定义多个变量
		//int a = 10; int b = 20; int c  = 30;
		int a = 10; 
		int b = 20; 
		int c  = 30;
		
		//int d, e;
		//d = 40;
		//e = 50;
		
		//int f, int g; //错误
		//int h; int i; //正确
	}
}