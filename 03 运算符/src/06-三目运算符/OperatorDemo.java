package s6_三目运算符;

/*
	单目运算符：~3
	双目运算符：3 + 4

	三目运算符：
		格式：比较表达式 ? 表达式1 : 表达式2;
		结果：boolean类型。
		执行流程：
			根据比较结果返回一个true或false。
			如果是true，就把表达式1作为结果。
			如果是false，就把表达式2作为结果。
*/
class OperatorDemo {
	public static void main(String[] args) {
		int x = 100;
		int y = 200;
		
		int z = ((x > y)? x: y);
		//int z = ((x < y)? x: y);
		//int z = ((x == y)? x: y);
		
		System.out.println("z:"+z);
	}
}