package ��������������;

/*
	+���ӷ������/�ַ������ӷ�
	
	ע�⣺
		boolean���Ͳ���ת��Ϊ��������������

	Ĭ��ת����С����
		1.byte, short, char �� int, long, float, double
		2.byte, short, char֮�䲻��ת��������֮������ʱ��ת��Ϊint����
		
	���Сʱ������ʧ����
*/

class DataTypeDemo3 {
	public static void main(String[] args) {
		//�ӷ�
		//System.out.println(3 + 4);
	
		//����int�������ӷ�
		int x = 3;
		int y = 4;
		int z = x + y;
		System.out.println(z);
		
		//����һ��byte���ͣ�һ��int���ͣ����ӷ�
		byte a = 3;
		int b = 4;
		System.out.println(a + b);
		
		//������ʧ����
		//byte c =  a + b;
		int c = a + b;
		System.out.println(c);
	}
}