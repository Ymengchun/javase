
package Demo_07;

import java.util.Scanner;

/*
 * �ַ�����ת�����ű����ַ���
 * ����������¼�롰abc��		
 * ����������cba��
 * 
 * ������
 * 		1.����¼��һ���ַ���
 * 		2.����һ�����ַ���
 * 		3.���ű����ַ������õ�ÿһ���ַ�
 * 			a:length()��charAt()���
 * 			b:���ַ���ת���ַ�����
 * 		4.�����ַ�����ÿһ���ַ�ƴ������
 * 		5.������ַ���
 */
public class StringTest3 {
	public static void main(String[] args) {
		//����¼��һ���ַ���
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ�����");
		String line = sc.nextLine();
	}
	
	//���ַ�����ת�ķ���
	public static String myReverse(String s) {
		//����һ�����ַ���
		String result = "";

		//���ַ���ת���ַ�����
		char[] chs = s.toCharArray();

		//���ű����ַ������õ�ÿһ���ַ�
		for (int x = chs.length - 1; x >= 0; x--) {
			//�����ַ�����ÿһ���ַ�ƴ������
			result += chs[x];
		}
		return result;
	}
}
