package Demo_02;

/*
 * StringBuffer����ӹ��ܣ�
 * 		1��public StringBuffer append(String str)�����԰���������������ӵ��ַ������������棬�����ַ�������������
 * 		2��public StringBuffer insert(int offset, String str)����ָ��λ�ð��������͵����ݲ��뵽�ַ������������棬�����ַ�������������
 */
public class StringBufferDemo {
	public static void main(String[] args) {
		//�����ַ�������������
		StringBuffer sb = new StringBuffer();

		//��ʽ���
		sb.append("hello").append(true).append(12).append(34.56);
		System.out.println("sb:" + sb);

		//�ڵ�5���ַ��������"world"
		sb.insert(5, "world");
		System.out.println("sb:" + sb);
	}
}
