package Demo_03;

/*
 * StringBuffer��ɾ������
 * 		1��public StringBuffer deleteCharAt(int index)��ɾ��ָ��λ�õ��ַ��������ر���
 * 		2��public StringBuffer delete(int start, int end)��ɾ����ָ��λ�ÿ�ʼָ��λ�ý��������ݣ������ر���
 */
public class StringBufferDemo {
	public static void main(String[] args) {
		//��������
		StringBuffer sb = new StringBuffer();

		//��ӹ���
		sb.append("hello").append("world").append("java");
		System.out.println("sb:" + sb);

		//����ɾ��e
		//sb.deleteCharAt(1);

		//����ɾ��world
		//sb.delete(5, 10);

		//����:ɾ�����е�����
		sb.delete(0, sb.length());

		System.out.println("sb:" + sb);
	}
}
