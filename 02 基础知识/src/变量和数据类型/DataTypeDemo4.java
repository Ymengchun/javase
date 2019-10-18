package 变量和数据类型;

/*
	强制转换：大的数据类型→小的数据类型
		
		格式：
			目标数据类型 变量 = (目标数据类型) (被转换的数据);
			
		注意：
			不要随意用强制转换，可能损失精度。
*/
class DataTypeDemo4 {
	public static void main(String[] args) {
		byte a = 3;
		int b = 4;
		
		//没有问题
		//int c = a + b;
		
		
		//有问题
		//byte c = a + b; 
		//用强制类型转换改进
		byte c = (byte) (a + b);
		System.out.println(c);
	}
}