package s9_ѡ��ṹ;
/*
	if����ע�����
		1.�Ƚϱ��ʽ���ۼ򵥻��Ǹ��ӣ����������boolean���ͣ�
		2.if������������һ����䣬�����ſ���ʡ�ԣ�
		     ����Ƕ�����䣬�Ͳ���ʡ�ԡ�������Զ��Ҫʡ�ԡ�
	
	��������飺{����;}
*/
class IfDemo2 {
	public static void main(String[] args) {
		int x = 10;
		
		if(x == 10) {
			System.out.println("x����10");
		}
		
		if((x > 5) || (x == 10)) {
			System.out.println("x���ڻ��ߵ���10");
		}
		System.out.println("-------------------");
		
		int a = 100;
		if(a != 100) {
			System.out.println("a��ֵ����100");
			System.out.println("over");
		}
		System.out.println("-------------------");
		
		int b = 100;
		if(b != 100);  //������ʵ���������ģ�ֻ�����ǿ�����塣
		
		//���������
		{
			System.out.println("b��ֵ��100");
			System.out.println("over");
		}
	}
}