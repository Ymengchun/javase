package s3_�Ƚ������;

/*
	�Ƚ��������
		==, !=, >, >=, <, <=
		
	�ص㣺
		�����boolean���͡�
		
	ע�����
		"=="����д��"="��
*/
class OperatorDemo {
	public static void main(String[] args) {
		int x = 3;
		int y = 4;
		int z = 3;
	
		System.out.println(x == y);
		System.out.println(x == z);
		System.out.println((x+y) == (x+z));
		System.out.println("------------");
		
		System.out.println(x != y);
		System.out.println(x > y);
		System.out.println(x >= y);
		System.out.println(x < y);
		System.out.println(x <= y);
		System.out.println("------------");
		
		int a = 10;
		int b = 20;
		int c = (a = b); 	//20
		System.out.println(c);
	}
}