package s7_����¼��;

import java.util.Scanner;
/*
		1.����
			��ʽ��
				import java.util.Scanner; 
			λ�ã�
				��class���档
		2.��������¼�����
			��ʽ��
				Scanner sc = new Scanner(System.in);
		3.ͨ�������ȡ����	
			��ʽ��
				int x = sc.nextInt();
				
		ע�⣺
			nextInt()����ȡһ������
			nextLine()����ȡһ���ַ���
*/


class ScannerDemo {
	public static void main(String[] args) {
		//��������¼�����ݶ���
		Scanner sc = new Scanner(System.in);
		
		System.out.println("��������һ�����ݣ�");
		int x = sc.nextInt();
		
		System.out.println("������������ǣ�"+x);
	}
}