package s2_循环机构_for;
/*
	需求：统计”水仙花数”共有多少个
	
	分析：
		1.水仙花数：一个三位数，其各位数字的立方和等于该数本身。
			举例：153就是一个水仙花数。
			153 = 1*1*1 + 5*5*5 + 3*3*3 = 1 + 125 + 27 = 153
		2.定义统计变量，初始化值是0
		3.三位数告诉了我们范围，用for循环
		4.获取每一个三位数的个，十，百位的数据
		5.按照要求进行判断
		6.如果满足要求就计数
*/
class ForDemo8 {
	public static void main(String[] args) {
		//定义统计变量，初始化值是0
		int count = 0;
		
		//三位数告诉了我们范围，用for循环就可以搞定
		for(int x=100; x<1000; x++) {
			//获取每一个三位数的个，十，百的数据
			int ge = x%10;
			int shi = x/10%10;
			int bai = x/10/10%10;
			
			//按照要求进行判断
			if(x == (ge*ge*ge+shi*shi*shi+bai*bai*bai)) {
				//如果满足要求就计数。
				count++;
			}
		}
		
		System.out.println("水仙花数共有"+count+"个");
	}
}