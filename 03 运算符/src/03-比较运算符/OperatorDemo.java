package s3_比较运算符;

/*
	比较运算符：
		==, !=, >, >=, <, <=
		
	特点：
		结果是boolean类型。
		
	注意事项：
		"=="不能写成"="。
*/
class OperatorDemo {
	public static void main(String[] args) {
		int x = 3;
		int y = 4;
		int z = 3;
	
		System.out.println(x == y);
		System.out.println(x == z);
		System.out.println((x+y) == (x+z));
		System.out.println("------------");
		
		System.out.println(x != y);
		System.out.println(x > y);
		System.out.println(x >= y);
		System.out.println(x < y);
		System.out.println(x <= y);
		System.out.println("------------");
		
		int a = 10;
		int b = 20;
		int c = (a = b); 	//20
		System.out.println(c);
	}
}