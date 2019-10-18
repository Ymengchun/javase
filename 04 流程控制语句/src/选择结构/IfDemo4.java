package s9_选择结构;
/*
	三元运算符和if语句的区别：
		三元运算符实现的，都可以采用if语句实现。反之不成立。
		
		什么时候if语句不能用三元运算符实现呢?
			当if语句控制的操作是一个输出语句的时候就不行。
			因为三元运算符的计算结果是boolean类型，而不是一个输出。
*/
class IfDemo4 {
	public static void main(String[] args) {
		//获取两个数据的最大值
		int a = 10;
		int b = 20;
		
		//用if语句实现
		int max1;
		if(a > b) {
			max1 = a;
		}else {
			max1 = b;
		}
		System.out.println("max1:"+max1);
		
		//用三元运算符改进
		int max2 = (a > b)? a: b;
		System.out.println("max2:"+max2);
		System.out.println("----------");
		
		//判断一个数据是奇数还是偶数,并输出是奇数还是偶数
		int x = 100;
		
		if(x%2 == 0) {
			System.out.println("100是一个偶数");
		}else {
			System.out.println("100是一个奇数");
		} 
		
		//用三元改进
		//这种改进是错误的。
		//String s = (x%2 == 0)?System.out.println("100是一个偶数");:System.out.println("100是一个奇数");;
	}
}