package Demo_07;

/*
 * ͳ�ƴ���С�����ֵĴ���
 * ������ͳ���ַ���"woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun"��"Java"���ֵĴ�����
 * ������
 *		1.����һ��ͳ�Ʊ���count����ʼ��Ϊ0
 * 		2.���ڴ��в���С����һ�γ��ֵ�λ��
 * 			a��������-1��˵���������ˣ��ͷ���ͳ�Ʊ���
 * 			b����������-1��˵�����ڣ�ͳ�Ʊ���++
 * 		3.�Ѹղŵ�����+С���ĳ�����Ϊ��ʼλ�ý�ȡ��һ�εĴ󴮣�����һ���µ��ַ��������Ѹ��ַ�����ֵ���¸�ֵ����
 * 		4.�ص���2��
 */
public class StringTest5 {
	public static void main(String[] args) {
		//�����
		String maxString = "woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun";
		//����С��
		String minString = "java";

		//д����ʵ��
		int count = getCount(maxString, minString);
		System.out.println("Java�ڴ��г����ˣ�" + count + "��");
	}

	/*
	 * ������ȷ�� ����ֵ���ͣ�int �����б������ַ���
	 */
	public static int getCount(String maxString, String minString) {
		//����һ��ͳ�Ʊ�������ʼ��ֵ��0
		int count = 0;
		int index;
		
		//�Ȳ飬��ֵ���ж�
		while((index = maxString.indexOf(minString)) != -1){
			count++;
			maxString = maxString.substring(index + minString.length());	//��ʽ���
		}

		return count;
	}
}
