package Demo_02;

/*
 * �ַ������ص㣺һ������ֵ���Ͳ��ܸı䡣
 * ��������s���Ƹı��ˣ���ʵ���Ϻ�һ�εĸ�ֵ��������ԭ���ַ���s��һ����������û�иı�ԭ�ȵ��ַ���s��
 */
public class StringDemo {
	public static void main(String[] args) {
		String s = "hello";
		System.out.println("s:" + s); //hello
		System.out.println(s.hashCode());	//99162322
		
		s = "world";
		System.out.println(s.hashCode());	//113318802
		System.out.println("s:" + s); //world
	}
}