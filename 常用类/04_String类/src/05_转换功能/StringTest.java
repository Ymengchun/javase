package Demo_05;

/*
 * ���󣺰�һ���ַ���������ĸת�ɴ�д������ΪСд��(ֻ����Ӣ�Ĵ�Сд��ĸ�ַ�)
 * ���룺
 * 		helloWORLD
 * �����
 * 		Helloworld
 * 
 * ������
 * 		1.�Ȼ�ȡ��һ���ַ�
 * 		2.��ȡ���˵�һ���ַ�������ַ�
 * 		3.��Aת�ɴ�д
 * 		4.��Bת��Сд
 * 		5.Cƴ��D
 */
public class StringTest {
	public static void main(String[] args) {
		//����һ���ַ���
		String s = "helloWORLD";
		
		//�Ȼ�ȡ��һ���ַ�
		String s1 = s.substring(0, 1);
		//��ȡ���˵�һ���ַ�������ַ�
		String s2 = s.substring(1);
		//��Aת�ɴ�д
		String s3 = s1.toUpperCase();
		//��Bת��Сд
		String s4 = s2.toLowerCase();
		//Cƴ��D
		String s5 = s3 + s4;
		System.out.println(s5);

		//�Ż���Ĵ���
		String result = s.substring(0, 1).toUpperCase() + (s.substring(1).toLowerCase());
		System.out.println(result);
	}
}
