package s7_����¼��;

import java.util.Scanner;
/*
	��ϰ��
		����¼���������ݣ�����������������ͣ��������
*/

class ScannerTest {
	public static void main(String[] args) {
		//��������¼�����
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ�����ݣ�");
		int x = sc.nextInt();
		
		System.out.println("������ڶ������ݣ�");
		int y = sc.nextInt();
		
		//�Ѽ���¼������ݽ�����Ӽ���
		int sum = (x + y);
		System.out.println("sum:"+sum);
	}
}