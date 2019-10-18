package 注释;

/*
	需求：写一个java程序，把"HelloWorld"输出在控制台
	
	分析：
		1.定义类
		2.定义main方法
		3.使用输出语句
		
	实现：
		1.定义类——class关键字
		2.main方法的格式是固定的：
			public static void main(String[] args) {
			
			}
		3.输出语句的格式是固定的：
			System.out.println("HelloWorld");
*/			


class HelloWorld {
	/*
		定义main方法
		main方法是程序入口，被jvm自动调用
	*/
	public static void main(String[] args) {
		//为了把数据显示在控制台，我们就使用了输出语句
		System.out.println("HelloWorld");
	}
}