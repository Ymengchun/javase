/*
	���������
	
	�������أ���ͬһ�����У���������ͬ�������б�ͬ���뷵��ֵ�����޹أ���������޹ء�
		�����б�ͬ��
			1.����������ͬ
			2.�������Ͳ�ͬ
	������ͬ������ֵ���Ͳ�ͬ�����������������Ǻ������ء�
	������ͬ����������ͬ����ͬһ�����������Ǻ������ء�
*/
class FunctionDemo4 {
	public static void main(String[] args) {
		//jvm����ݲ�ͬ�Ĳ���ȥ���ò�ͬ�Ĺ���
		System.out.println(sum(10,20));
		System.out.println(sum(10,20,30));
		System.out.println(sum(10,20,30,40));
		
		System.out.println(sum(10.5f,20f));
	}
	
	//����1:���������ĺ�
	public static int sum(int a,int b) {
		System.out.println("int");
		return a + b;
	}
	
	//����2:�������ĺ�
	public static int sum(int a,int b,int c) {
		return a + b + c;
	}
	
	//����3:���ĸ����ĺ�
	public static int sum(int a, int b, int c, int d) {
		return a + b + c + d;
	}
	
	public static float sum(float a,float b) {
		System.out.println("float");
		return a + b;
	}
}