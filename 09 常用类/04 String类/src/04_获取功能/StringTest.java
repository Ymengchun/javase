package Demo_04;

/*
 * ���󣺱�����ȡ�ַ����е�ÿһ���ַ�
 * 
 * ������
 * 		1.����ܹ��õ�ÿһ���ַ���?
 * 			char charAt(int index)
 * 		2.����ô֪���ַ������ж��ٸ���?
 * 			int length()
 */
public class StringTest {
	public static void main(String[] args) {
		String s = "helloworld";

		for (int x = 0; x < s.length(); x++) {
			System.out.println(s.charAt(x));
		}
	}
}
