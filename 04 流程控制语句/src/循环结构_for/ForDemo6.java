package s2_循环机构_for;
/*
	案例：在控制台输出所有的”水仙花数”
	
	分析：
		水仙花数：一个三位数，各位数字的立方和等于该数本身。
		举例：153就是一个水仙花数。
		153 = 1*1*1 + 5*5*5 + 3*3*3 = 1 + 125 + 27 = 153

		1.三位数其实是告诉了我们范围。
		2.通过for循环我们就可以实现获取每一个三位数
		  但是麻烦是如何获取这个三位数的个,十,百位上的数据
		  
		  我们如何获取一个数据的个,十,百呢?
			假设有个一个数据:153
			ge:	153%10 = 3
			shi: 153/10%10 = 5
			bai：153/10/10%10 = 1
			qian：x/10/10/10%10
			wan:  x/10/10/10/10%10
			...

		3.让ge*ge*ge+shi*shi*shi+bai*bai*bai和该数据比较
		4.如果相同，就把该数据在控制台输出。
*/
class ForDemo6 {
	public static void main(String[] args) {
		
		for(int x=100; x<1000; x++) {
			int ge = x%10;
			int shi = x/10%10;
			int bai = x/10/10%10;
			
			if(x == (ge*ge*ge+shi*shi*shi+bai*bai*bai)) {
				System.out.println(x);
			}
		}
	}
}