package s1_ѡ��ṹ_switch;

/*
	switch����ע�����
		1.case����ֻ���ǳ����������Ǳ��������case�����ֵ������ͬ
		2.default����ʡ�ԣ���������
		3.break�﷨�Ͽ���ʡ�ԣ��������飬��Ϊ���������������Ҫ�Ĳ�һ��
		4.default��һ������󣬵����������
		5.switch���Ľ�������
			a������break����
			b��ִ�е�ĩβ����
*/
import java.util.Scanner;

class SwitchDemo2 {
	public static void main(String[] args) {
		//��������¼�����
		Scanner sc = new Scanner(System.in);
		
		//���Ƽ���¼������
		System.out.println("������һ������(1-7):");
		int week = sc.nextInt(); //3
		
		//case���治���Ǳ���
		//int number = 3;
		//Ȼ���case�����ֵ��Ϊnumber���ͻᱨ��
		
		//switch���
		switch(week) {
			case 1:
				System.out.println("����һ");
				break;
			case 2:
				System.out.println("���ڶ�");
				break;
			case 3:
				System.out.println("������");
				break;
			case 4:
				System.out.println("������");
				break;
			case 5:
				System.out.println("������");
				break;
			case 6:
				System.out.println("������");
				break;
			case 7:
				System.out.println("������");
				break;
			default:
				System.out.println("���������������");
				//break;
		}
	}
}