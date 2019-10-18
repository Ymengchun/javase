package s5_循环嵌套;
/*
	需求：请输出一个4行5列的星星(*)图案。
	结果：
		*****
		*****
		*****
		*****
		
	循环嵌套：循环中还有循环.
	
	结论：
		外循环控制行数
		内循环控制列数
*/
class ForForDemo {
	public static void main(String[] args) {
		//原始做法
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("-------------");
		
		//嵌套循环改进
		for(int y=0; y<4; y++) {
			for(int x=0; x<5; x++) {
				System.out.print("*");
			}
			//我们可以通过空的输出语句实现换行：System.out.println();
			System.out.println();
		}
	}
}