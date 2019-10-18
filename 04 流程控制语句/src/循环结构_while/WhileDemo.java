package s3_循环结构_while;
/*
	while循环的基本格式：
		while(判断条件语句) {
			循环体语句;
		}
		
		
*/
class WhileDemo {
	public static void main(String[] args) {
		//输出10次"HelloWorld"
		//for语句版
		for(int x=0; x<10; x++) {
			System.out.println("HelloWorld");
		}
		System.out.println("--------------");
		//while语句版
		int x=0;
		while(x<10) {
			System.out.println("HelloWorld");
			x++;
		}
		
	}
}