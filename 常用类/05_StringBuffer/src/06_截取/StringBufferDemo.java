package Demo_06;

/*
 * StringBuffer�Ľ�ȡ���ܣ�ע�ⷵ��ֵ���Ͳ�����StringBuffer����
 * 		public String substring(int start)
 * 		public String substring(int start, int end)
 */
public class StringBufferDemo {
	public static void main(String[] args) {
		//�����ַ�������������
		StringBuffer sb = new StringBuffer();

		//���Ԫ��
		sb.append("hello").append("world").append("java");
		System.out.println("sb:" + sb);

		//��ȡ����
		//public String substring(int start)
		String s = sb.substring(5);		//�ӵ�5λ��ʼ����ȡ��ĩβ
		System.out.println("s:" + s);
		System.out.println("sb:" + sb);

		//public String substring(int start, int end)
		String ss = sb.substring(5, 10);	//�ӵ�5λ��ʼ����ȡ����10λ
		System.out.println("ss:" + ss);
		System.out.println("sb:" + sb);
	}
}
