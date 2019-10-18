package s4_逻辑运算符;

/*
	&&和&的区别?||和|的区别?
		1.结果一样。
		2.&&和||具有短路效果
			&&——左边是false右边就不检查，&——两边都要检查
			||——左边是true右边就不检查，|——两边都要检查
		
	开发中常用的逻辑运算符：
		&&, ||, !
*/
class OperatorDemo2 {
	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		int c = 5;
		
		//&&双与
		System.out.println((a > b) && (a > c)); //false && false = false
		System.out.println((a > b) && (a < c)); //false && true = false
		System.out.println((a < b) && (a > c)); //true && false = false
		System.out.println((a < b) && (a < c)); //true && true = true
		System.out.println("----------------");
		
		int x = 3;
		int y = 4;
		
		//boolean b1 = ((x++ == 3) & (y++ == 4));
		//boolean b1 = ((x++ == 3) && (y++ == 4));
		//boolean b1 = ((++x == 3) & (y++ == 4));
		boolean b1 = ((++x == 3) && (y++ == 4));
		System.out.println("x:"+x);
		System.out.println("y:"+y);
		System.out.println(b1);
	}
}