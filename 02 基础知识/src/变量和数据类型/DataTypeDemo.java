package ��������������;

/*
	�������ͣ�Java��һ��ǿ�������ԣ����ÿһ�����ݶ��������������͡�
	
	�������ͷ��ࣺ
		1.������������
		2.������������(��,�ӿ�,��ֵ)
		
	������������:4��8��
		1.����			ռ���ֽ���
		  byte			    1
		  short			    2
		  int				4
		  long				8
			
		2.������
		  float 			4
		  double 			8
			
		3.�ַ�
		  char				2
		4.����
		  boolean			1
		
		ע�⣺
			����Ĭ����int����
			������Ĭ����double����
			
			�����ͺ�׺��L����l��ǣ�����ʹ��L��
			�����ȸ�������F����f��ǣ�����ʹ��F��
*/

class DataTypeDemo {
	public static void main(String[] args) {
		//��������ĸ�ʽ��
		//�������� ������ = ��ʼ��ֵ;
		
		//����һ���ֽڱ���
		byte b = 10;
		System.out.println(10);
		System.out.println(b);
		
		//����һ�������ͱ���
		short s = 100;
		System.out.println(s);
		
		//����һ�����ͱ���
		int i = 1000;
		System.out.println(i);
		
		//������int�ķ�Χ
		//int j = 1000000000000;
		long j = 1000000000000L;
		//long j = 100L;
		System.out.println(j);
		
		//���帡�����ݱ���
		float f = 12.345F;
		System.out.println(f);
		
		double d = 12.345;
		System.out.println(d);
		
		//�����ַ�����
		char ch = 'a';
		System.out.println(ch);
		
		//���岼������
		boolean flag = true;
		System.out.println(flag);
	}
}
