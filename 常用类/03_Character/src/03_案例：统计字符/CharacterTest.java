package Demo_03;

import java.util.Scanner;

/*
 * ������ͳ��һ���ַ����д�д��ĸ�ַ���Сд��ĸ�ַ��������ַ����ֵĴ���(�����������ַ�)��
 * 
 * ������
 * 		1.��������ͳ�Ʊ�����
 * 			int bigCont=0;
 * 			int smalCount=0;
 * 			int numberCount=0;
 * 		2.����¼��һ���ַ�����
 * 		3.���ַ���ת��Ϊ�ַ����顣
 * 		4.�����ַ������ȡ��ÿһ���ַ�
 * 		5.�жϸ��ַ���
 * 			��д	bigCount++;
 * 			Сд	smalCount++;
 * 			����	numberCount++;
 * 		6.����������
 */
public class CharacterTest {
	public static void main(String[] args) {
		//��������ͳ�Ʊ�����
		int bigCount = 0;
		int smallCount = 0;
		int numberCount = 0;

		//����¼��һ���ַ�����
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ�����");
		String line = sc.nextLine();

		// ���ַ���ת��Ϊ�ַ����顣
		char[] chs = line.toCharArray();

		//���ַ������ȡ��ÿһ���ַ�
		for (char ch : chs) {

			//�жϸ��ַ�
			if (Character.isUpperCase(ch)) {
				bigCount++;
			} else if (Character.isLowerCase(ch)) {
				smallCount++;
			} else if (Character.isDigit(ch)) {
				numberCount++;
			}
		}

		//����������
		System.out.println("��д��ĸ��" + bigCount + "��");
		System.out.println("Сд��ĸ��" + smallCount + "��");
		System.out.println("�����ַ���" + numberCount + "��");
	}
}
