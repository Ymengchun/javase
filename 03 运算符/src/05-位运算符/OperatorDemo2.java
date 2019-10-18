package s5_位运算符;

/*
	^的特点：A被B位异或两次，A不变。
*/
class OperatorDemo2 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.println(a ^ b ^ b); //10
		System.out.println(a ^ b ^ a); //20
	}
}