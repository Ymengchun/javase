package s3_ѭ���ṹ_while;
/*
	���������1-100֮��
*/
class WhileDemo2 {
	public static void main(String[] args) {
		//���1-100֮��
		//for���汾
		int sum = 0;
		
		for(int x=1; x<=100; x++) {
			sum+=x;
		}
		
		System.out.println("sum:"+sum);
		System.out.println("--------");
		//while���汾
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