package s3_循环结构_while;
/*
	案例：求出1-100之和
*/
class WhileDemo2 {
	public static void main(String[] args) {
		//求出1-100之和
		//for语句版本
		int sum = 0;
		
		for(int x=1; x<=100; x++) {
			sum+=x;
		}
		
		System.out.println("sum:"+sum);
		System.out.println("--------");
		//while语句版本
		int sum2 = 0;
		
		int y=1;
		while(y<=100) {
			sum2+=y;
			y++;
		}
		
		System.out.println("sum2:"+sum2);
		System.out.println("--------");
	}
}