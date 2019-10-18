package s3_循环结构_while;
/*
 	案例：
	我国最高山峰是珠穆朗玛峰：8848m，我现在有一张足够大的纸张，厚度为：0.01m。
	请问，我折叠多少次，就可以保证厚度不低于珠穆朗玛峰的高度?

	分析：
		1.定义一个统计变量，默认值是0
		2.最高山峰是珠穆朗玛峰：8848m这是最终的厚度
		     我现在有一张足够大的纸张，厚度为：0.01m这是初始厚度
		3.折叠一次，厚度是上一次的2倍。
		4.只要每次变化的厚度没有超过珠穆朗玛峰的高度，就折叠，统计变量++
		5.输出统计变量。
*/

class WhileDemo5 {
	public static void main(String[] args) {
		//定义一个统计变量，默认值是0
		int count = 0;
		
		int end = 884800;
		int start = 1;
		
		while(start<end) {
			//只要每次变化的厚度没有超过珠穆朗玛峰的高度，就折叠，统计变量++
			count++;
			
			//折叠一次，厚度是以前的2倍
			start *= 2;
			
			System.out.println("第"+count+"次厚度是"+start);
		}
		
		//输出统计变量
		System.out.println("要叠"+count+"次");
	}
}