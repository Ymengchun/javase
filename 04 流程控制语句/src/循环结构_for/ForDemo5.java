package s2_循环机构_for;

/*
	案例：求5的阶乘。
*/
class ForDemo5 {
	public static void main(String[] args) {
		//定义最终结果变量
		int jc = 1;
		
		for(int x=2; x<=5; x++) {
			jc *=x;
		}
		
		System.out.println("1-5的阶乘是："+jc);
	}
}