package s1_���������;

/*
	�������
		���ǶԳ����ͱ������в����ķ��š�
		
	���ࣺ�������������ֵ��������Ƚ���������߼��������λ���������Ŀ�����

	�����������+, -, *, /, %, ++, --
		
	ע�⣺
		1.�������ֻ�ܵõ������������õ�С������������ݱ仯Ϊ����������
		2./��ȡ�����̣�%��ȡ��������
*/

class OperatorDemo {
	public static void main(String[] args) {
		//�������
		int x = 3;  //��3��ֵ��int���͵ı���x
		int y = 4;
		
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y); //�������ֻ�ܵõ�����
		
		//��õ������������԰������һ����������Ϊ������
		System.out.println(x * 1.0 / y);
		
		//%��Ӧ��
		System.out.println(x % y); //�õ���������
	}
}