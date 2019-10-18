/*
	方法：完成特定功能的代码块。其它语言中也称为函数。
	方法格式：
		修饰符 返回值类型 方法名(参数类型 参数名1,参数类型 参数名2...) {
			方法体语句;
			return 返回值; 
		}
	解释：
		修饰符：
		返回值类型：返回数据的类型。
		方法名：驼峰原则；见名知意
		参数：
			实际参数：实际参与运算。
			形式参数；小括号里面的。用于定义函数，接收实际参数。
		参数类型：参数的数据类型
		参数名：变量名
		方法体语句：完成功能的代码。
		return：方法结束的标志。
		返回值：就是功能的结果，由return带给调用者。
			
	调用函数
		1.单独调用：没有意义，不推荐。
		2.输出调用：不够好，有时需要对结果进一步操作。
		3.赋值调用：推荐。
				
	需求：求两个数据之和
		
		
*/
class FunctionDemo {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		
		//方式1：单独调用
		//sum(x,y);
	
		//方式2：输出调用
		//System.out.println(sum(x,y));
		//System.out.println(30);
	
		//方式3：赋值调用
		int result = sum(x,y);
		System.out.println(result);
	}
	
	
	//求两个数据之和
	public static int sum(int a,int b) {
			return a + b;
	}
	
}