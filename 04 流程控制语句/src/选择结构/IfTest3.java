package s9_ѡ��ṹ;

import java.util.Scanner;

/*
	����¼���·ݵ�ֵ�������Ӧ�ļ��ڡ�
	
	��	3,4,5
	��	6,7,8
	��	9,10,11
	��	12,1,2
	
	������
		1.����¼���·ݵ�ֵ��ʹ��Scanner��
		2.�ж�����϶࣬��if����ʽ3��
		
	if����ʹ�ó�����
		1.��Ա��ʽ��boolean���͵��ж�
		2.��Է�Χ���ж�
*/

class IfTest3 {
	public static void main(String[] args) {
		//��������¼�����
		Scanner sc = new Scanner(System.in);
		
		//¼������
		System.out.println("��������һ���·�:");
		int month = sc.nextInt();
		
		if(month<1 || month>12) {
			System.out.println("��������·�����");
		}else if(month>=3 && month<=5) {
			System.out.println("����");
		}else if(month>=6 && month<=8) {
			System.out.println("�ļ�");
		}else if(month>=9 && month<=11) {
			System.out.println("�＾");
		}else {
			System.out.println("����");
		}
		System.out.println("--------------");
	}
}