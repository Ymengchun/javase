package s5_位运算符;

/*
	位运算符：
		&, |, ^, ~
		<<, >> , >>>
	
	注意：
		做位运算，要先把数据换算成二进制。
		计算机中的二进制都是以补码的形式存储的
	
	3的二进制：11
		00000000 00000000 00000000 00000011
	4的二进制：100
		00000000 00000000 00000000 00000100
	
	&位与运算：有0则0。
		00000000 00000000 00000000 00000011
	   &00000000 00000000 00000000 00000100
		-----------------------------------
		00000000 00000000 00000000 00000000 (补码)
		结果是：0
		
	|位或运算：有1则1。
		00000000 00000000 00000000 00000011
	   |00000000 00000000 00000000 00000100
		-----------------------------------
		00000000 00000000 00000000 00000111 (补码)
		结果是：7
		
	^位异或运算：相同则0，不同则1。
		00000000 00000000 00000000 00000011
	   &00000000 00000000 00000000 00000100
		-----------------------------------
		00000000 00000000 00000000 00000111 (补码)
		结果是：7
		
	~按位取反运算符：0变1，1变0
		00000000 00000000 00000000 00000011
	   ~11111111 11111111 11111111 11111100 (补码)
	   
	   补码：11111111 11111111 11111111 11111100
	   反码：11111111 11111111 11111111 11111011
	   原码：10000000 00000000 00000000 00000100
		结果是：-4
	
	   正数的原码/反码/补码是一样的
*/

class OperatorDemo {
	public static void main(String[] args) {
		//&,|,^,~
		
		int a = 3;
		int b = 4;
		
		System.out.println(3 & 4);
		System.out.println(3 | 4);
		System.out.println(3 ^ 4);
		System.out.println(~3);
	}
}
/*
	
*/