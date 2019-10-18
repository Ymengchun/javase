package 变量和数据类型;

class DataTypeDemo5 {
	public static void main(String[] args) {
		//把double赋值给float，要用强制转换
		double d = 12.345;
		float f = (float)d;
		
		//下面两个定义没有区别
		float f1 = (float)12.345;
		float f2 = 12.345F;
		System.out.println(f1);
		System.out.println(f2);
	}
}