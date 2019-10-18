package 变量和数据类型;

/*
	字符串+整数：输出字符串
	这里的+不是加号，是字符连接符
	字符连接符的两端，只要有一端是字符串，结果就自动转化为字符串
*/
class DataTypeDemo9 {
	public static void main(String[] args) {
		System.out.println("hello" + 'a'+1);   //helloa1
		System.out.println('a' + 1 + "hello"); //98hello
		
		System.out.println("5+5=" + 5 + 5); //5+5=55
		System.out.println(5+5 + "=5+5"); 	//10=5+5
	}
}