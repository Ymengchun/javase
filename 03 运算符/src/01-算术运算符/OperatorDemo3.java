package s1_算术运算符;

/*
	+的用法：
		1.加法
		2.正号
		3.字符串连接符
*/

class OperatorDemo3 {
	public static void main(String[] args) {
		//加法
		System.out.println(3+4);
		
		//正号
		System.out.println(+4);
		
		System.out.println('a');
		System.out.println('a'+1); //加法
		
		//字符串连接符
		System.out.println("hello"+'a'+1);
		System.out.println('a'+1+"hello");
	}
}