/*
	比较两个数据是否相等。参数类型分别为
		两个byte类型，两个short类型，两个int类型，两个long类型，
	并在main方法中进行测试
*/
class FunctionTest6 {
	public static void main(String[] args) {
		//测试
		byte b1 = 3;
		byte b2 = 4;
		System.out.println("byte:"+compare(b1,b2));
		
		//测试
		short s1 = 5;
		short s2 = 5;
		System.out.println("short:"+compare(s1,s2));
		
		//测试
		int i1 = 3;
		int i2 = 4;
		System.out.println("byte:"+compare(i1,i2));
		
		//测试
		long L1 = 3;
		long L2 = 4;
		System.out.println("byte:"+compare(L1,L2));
		
	}
	
	//byte类型
	public static boolean compare(byte a,byte b) {
		System.out.println("byte");
		return a == b;
	}
	
	//short类型
	public static boolean compare(short a,short b) {
		System.out.println("short");
		return a == b;
	}
	
	//int类型
	public static boolean compare(int a,int b) {
		System.out.println("int");
		return a == b;
	}
	
	//long类型
	public static boolean compare(long a,long b) {
		System.out.println("long");
		return a == b;
	}
}