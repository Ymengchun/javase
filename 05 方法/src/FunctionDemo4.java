/*
	案例：求和
	
	方法重载：在同一个类中，方法名相同，参数列表不同。与返回值类型无关，与变量名无关。
		参数列表不同：
			1.参数个数不同
			2.参数类型不同
	其它相同，返回值类型不同：是两个函数，不是函数重载。
	其它相同，变量名不同：是同一个函数，不是函数重载。
*/
class FunctionDemo4 {
	public static void main(String[] args) {
		//jvm会根据不同的参数去调用不同的功能
		System.out.println(sum(10,20));
		System.out.println(sum(10,20,30));
		System.out.println(sum(10,20,30,40));
		
		System.out.println(sum(10.5f,20f));
	}
	
	//需求1:求两个数的和
	public static int sum(int a,int b) {
		System.out.println("int");
		return a + b;
	}
	
	//需求2:求三数的和
	public static int sum(int a,int b,int c) {
		return a + b + c;
	}
	
	//需求3:求四个数的和
	public static int sum(int a, int b, int c, int d) {
		return a + b + c + d;
	}
	
	public static float sum(float a,float b) {
		System.out.println("float");
		return a + b;
	}
}