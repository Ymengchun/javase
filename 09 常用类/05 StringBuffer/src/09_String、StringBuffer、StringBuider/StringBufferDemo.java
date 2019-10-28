package cn.itcast_08;

/*
 * �����⣺
 * 		1��String��StringBuffer��StringBuilder������
 * 			A��String�����ݲ��ɱ䣬��StringBuffer��StringBuilder�����ݿɱ䡣
 * 			B��StringBuffer��ͬ���ģ����ݰ�ȫ��Ч�ʵͣ�StringBuilder�ǲ�ͬ���ģ����ݲ���ȫ��Ч�ʸߡ�
 * 
 * 		2��StringBuffer�����������
 * 			��ͬ�㣺���߶���һ��������װ���������ݡ�
 * 			��ͬ�㣺StringBuffer����һ���ַ������ݣ�ֻ��װ�ַ�����������Է�ͬһ���͵Ķ������ݡ�
 * 
 * 		3����ʽ��������
 * 			String��Ϊ��������
 * 			StringBuffer��Ϊ�������� 
 * 
 * �βΣ�
 * 		1���������ͣ��ı��ββ���Ӱ��ʵ��
 * 		2���������ͣ��ı��βλ�Ӱ��ʵ��
 * 
 * ע�⣺
 * 		String��Ϊ�������ݣ�Ч���ͻ���������Ϊ����������һ���ġ�
 */
public class StringBufferDemo {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "world";
		System.out.println(s1 + "---" + s2);	// hello---world
		change(s1, s2);
		System.out.println(s1 + "---" + s2);	// hello---world

		StringBuffer sb1 = new StringBuffer("hello");
		StringBuffer sb2 = new StringBuffer("world");
		System.out.println(sb1 + "---" + sb2);// hello---world
		change(sb1, sb2);
		System.out.println(sb1 + "---" + sb2);// hello---worldworld

	}

	public static void change(StringBuffer sb1, StringBuffer sb2) {
		sb1 = sb2;
		sb2.append(sb1);
	}

	public static void change(String s1, String s2) {
		s1 = s2;
		s2 = s1 + s2;
	}
}
