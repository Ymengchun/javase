package s9_ѡ��ṹ;

import java.util.Scanner;

/*
	����if����ʹ�������
		��ʽ1���ʺ��������ж�
		��ʽ2���ʺ��������ж�
		��ʽ3���ʺ�������ж�
		
	����
		����¼��x��ֵ�������y�Ĳ������
		
		x>=3	y = 2x + 1;
		-1<=x<3	y = 2x;
		x<=-1	y = 2x �C 1;
		
	������
		1.��������Ҫ����¼�룬����ʹ��Scanner��
		2.�����������жϣ�����ѡ��if����ʽ3��
*/

class IfTest2 {
	public static void main(String[] args) {
		//��������¼�����
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������x��ֵ��");
		int x = sc.nextInt();
		
		//����һ��y
		int y;
		
		//��if����ʽ3�����ж�
		if(x >= 3) {
			y = 2*x + 1;
		}else if(x>=-1 && x<3) {
			y = 2*x;
		}else {
			y = 2*x - 1;
		}
		
		System.out.println("y:"+y);
	}
}