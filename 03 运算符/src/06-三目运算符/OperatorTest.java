package s6_��Ŀ�����;

/*
	��ϰ��
		��ȡ���������е����ֵ
		��ȡ���������е����ֵ
		�Ƚ����������Ƿ���ͬ
*/
class OperatorTest {
	public static void main(String[] args) {
		//��ȡ���������е����ֵ
		int x = 100;
		int y = 200;
		
		int max = (x > y? x: y);
		System.out.println("max:"+max);
		System.out.println("--------");
		
		//��ȡ���������е����ֵ
		int a = 10;
		int b = 30;
		int c = 20;
		
		//��������
		//1.�ȱȽ�a, b�����ֵ
		//2.a, b�����ֵ��c�Ƚ�
		int temp = ((a > b)? a: b);
		int max1 = (temp > c? temp: c);
		System.out.println("max1:"+max1);
		System.out.println("--------");
		
		//�Ƚ����������Ƿ���ͬ
		int m = 100;
		int n = 200;
		System.out.println(m==n);
	}
}