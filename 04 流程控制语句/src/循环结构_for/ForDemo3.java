package s2_循环机构_for;
/*
	需求：求出1-10之间数据之和
	
	分析：
		0+1=1
			1+2=3
				3+3=6
					6+4=10
						10+5=15
							 ...
							 
	
*/
class ForDemo3 {
	public static void main(String[] args) {
		//原始做法
		System.out.println(1+2+3+4+5+6+7+8+9+10);
		
		//用循环改进
		int sum = 0;
		
		for(int x=1; x<=10; x++) {
			sum = sum + x;
		}
		
		System.out.println("sum:"+sum);
	}
}