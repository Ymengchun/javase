package s1_算术运算符;

/*
	++,--运算符：
		单独使用：
			放在操作数的前面和后面效果一样。
		参与运算使用：
			放在操作数的前面，先自增或者自减，再参与运算。
			放在操作数的后面，先参与运算，再自增或者自减。
			
	作用：对变量进行自增1或者自减1。
	注意：常量不能使用++和--
*/

class OperatorDemo2 {
		public static void main(String[] args) {
			//定义两个变量
			int x = 3;
			int y = 4;
			
			//字符串的拼接
			//System.out.println("x:"+x);
			//System.out.println("y:"+y);
			
			System.out.println("x:"+x+",y:"+y);
			
			//单独使用
			//x++;
			//y--;
			++x;
			--y;
			//System.out.println(x);
			System.out.println("x:"+x+",y:"+y);
			
			//常量是不可以这样做
			//System.out.println(10++);
			
			System.out.println("-------------------");
			//参与运算使用
			int a = 3;
			int b = 4;
			
			//int c = a++;
			//int d = b--;
			
			int c = ++a;
			int d = --b;
			
			System.out.println("a:"+a); //4, 4
			System.out.println("b:"+b); //3, 3
			System.out.println("c:"+c); //3, 4
			System.out.println("d:"+d); //4, 3
		}
}