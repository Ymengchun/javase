package Demo_01;

/*
 * �̰߳�ȫ(���߳̽���)
 * 		1����ȫ -- ͬ�� -- �����ǰ�ȫ�ģ�Ч�ʵ�һЩ
 * 		2������ȫ -- ��ͬ�� -- Ч�ʸ�һЩ
 * 		��ȫ��Ч����ì�ܵģ���ȫ��������ҽԺ����վ��������վ��Ч�ʡ�������������վ����̳��
 * 
 * StringBuffer���̰߳�ȫ�Ŀɱ��ַ�����
 * StringBuffer��String������
 * 		1��StringBuffer���Ⱥ����ݿɱ䣬String���ɱ䡣
 * 		2��ʹ��StringBufferƴ���ַ����������˷�̫�����Դ��
 * 
 * StringBuffer�Ĺ��췽����
 * 		public StringBuffer()���޲ι��췽��
 *		public StringBuffer(int capacity)��ָ���������ַ�������������
 *		public StringBuffer(String str)��ָ���ַ������ݵ��ַ�������������
 *
 * StringBuffer�ķ�����
 *		public int capacity()�����ص�ǰ����������ֵ����ʼ��16
 *		public int length()�����س��ȣ��ַ�������ʵ��ֵ
 */
public class StringBufferDemo {
	public static void main(String[] args) {
		//public StringBuffer()���޲ι��췽��
		StringBuffer sb = new StringBuffer();
		System.out.println("sb:" + sb);
		System.out.println("sb.capacity():" + sb.capacity());	//����
		System.out.println("sb.length():" + sb.length());		//���ȣ��ַ����������ֽ���
		System.out.println("--------------------------");

		//public StringBuffer(int capacity)��ָ���������ַ�������������
		StringBuffer sb2 = new StringBuffer(50);
		System.out.println("sb2:" + sb2);
		System.out.println("sb2.capacity():" + sb2.capacity());
		System.out.println("sb2.length():" + sb2.length());
		System.out.println("--------------------------");

		//public StringBuffer(String str)��ָ���ַ������ݵ��ַ�������������
		StringBuffer sb3 = new StringBuffer("hello");
		System.out.println("sb3:" + sb3);
		System.out.println("sb3.capacity():" + sb3.capacity());
		System.out.println("sb3.length():" + sb3.length());
	}
}
