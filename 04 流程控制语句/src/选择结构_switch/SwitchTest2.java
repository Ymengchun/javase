package s1_ѡ��ṹ_switch;

/*
	������ģ�ⵥ��ѡ����
	
	������
		1.��һ��ѡ���⣬Ȼ����ѡ��
		2.����¼��
		3.����ѡ����������ѡ��Ľ��ۡ�
*/
import java.util.Scanner;

class SwitchTest2 {
	public static void main(String[] args) {
		//��һ��ѡ���⣬�������ѡ��
		System.out.println("����ļ��������˭?");
		System.out.println("1 ����ϼ");
		System.out.println("2 ������");
		System.out.println("3 ���»�");
		System.out.println("4 ������");
		
		//����¼��ѡ������ݡ�
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���������ѡ��");
		int choiceNumber = sc.nextInt();
		
		//ǿ��ת��Ϊ�ַ�����
		char choice = (char) choiceNumber;
		
		switch(choice) {
			case 1:
				System.out.println("��ϲ��,ѡ����ȷ");
				break;
			case 2:
				System.out.println("������˼����ѡ������");
				break;
			case 3:
				System.out.println("������˼����ѡ������");
				break;
			case 4:
				System.out.println("������˼����ѡ������");
				break;
			default:
				System.out.println("û�и�ѡ��");
				break;
		}
	}
}