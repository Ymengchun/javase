package s4_循环结构_dowhile;
/*
	注意死循环：
		1.控制条件语句的变量的不要弄丢了，否则就容易死循环。
		2.两种最简单的死循环格式
			while(true){...}
			for(;;){...}
			
*/
class DoWhileDemo3 {
	public static void main(String[] args) {
		int x = 0;
		while(x < 10) {
			System.out.println(x);
			x++;
		}
		System.out.println("--------------");
		
		/*
		死循环
		while(true) {
			System.out.println("今天我很高兴，学习了死循环");
		}
		*/
		
		/*
		死循环
		for(;;){
			System.out.println("今天我很高兴，学习了死循环");
		}
		*/
		
	}
}