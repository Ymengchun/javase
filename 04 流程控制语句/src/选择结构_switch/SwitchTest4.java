package s1_ѡ��ṹ_switch;

/*
	��switch���ʵ�ּ���¼���·ݣ������Ӧ�ļ���
	
	������
		1.����¼��һ���·ݣ���Scannerʵ��
		2.��switch���ʵ��
		
	if����switch��������
		if��䣺
			1.��Խ����boolean���͵��ж�
			2.���һ����Χ���ж�
			3.��Լ�������ֵ���ж�
		
		switch��䣺
			��Լ�������ֵ���ж�
			
			
	case��͸������case����һ���������
*/
import java.util.Scanner;

class SwitchTest4 {
	public static void main(String[] args) {
		//��������¼�����
		Scanner sc = new Scanner(System.in);
		
		//¼������
		System.out.println("�������·�(1-12)��");
		int month = sc.nextInt();
		
		/*
		switch(month) {
			case 1:
				System.out.println("����");
				break;
			case 2:
				System.out.println("����");
				break;
			case 3:
				System.out.println("����");
				break;
			case 4:
				System.out.println("����");
				break;
			case 5:
				System.out.println("����");
				break;
			case 6:
				System.out.println("�ļ�");
				break;
			case 7:
				System.out.println("�ļ�");
				break;
			case 8:
				System.out.println("�ļ�");
				break;
			case 9:
				System.out.println("�＾");
				break;
			case 10:
				System.out.println("�＾");
				break;
			case 11:
				System.out.println("�＾");
				break;
			case 12:
				System.out.println("����");
				break;
			default:
				System.out.println("��������·�����");
		}
		*/
		
		//����д̫�鷳�ˣ���case��͸
		switch(month) {
			case 1:
			case 2:
			case 12:
				System.out.println("����");
				break;
			case 3:
			case 4:
			case 5:
				System.out.println("����");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("�ļ�");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("�＾");
				break;
			default:
				System.out.println("��������·�����");
		}
	}
}