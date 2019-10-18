/*
	方法的注意事项：
		1.不调用不执行
		2.不同的方法低位平等，不能嵌套定义
		3.定义方法时，形式参数用逗号隔开
		4.如果方法有明确的返回值，一定要return
		5.定义和调用的区别：定义——有返回值类型，调用——没有
*/
class FunctionDemo2 {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		
		//错误，调用不应该有返回值类型
		//sum(int x,int y);
		
		//正确
		sum(10,20);
		
		
		
	}
	
	public static int sum(int a, int b){
		return a + b;
	}
}