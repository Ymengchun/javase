package Demo_03;

import java.util.Scanner;

/*
 * ������ģ���¼�������λ��ᣬ����ʾ���м��Ρ�
 * 
 * ������
 * 		1.�����û��������롣
 * 		2.����¼���û��������롣
 * 		3.�Ƚ��û��������롣
 * 			�������ͬ�����¼�ɹ�
 * 			�����һ����ͬ�����¼ʧ��
 * 		4.�����λ��ᣬ��ѭ���Ľ��������forѭ����
 */
public class StringTest {
	public static void main(String[] args) {
		//�����û���������
		String username = "admin";
		String password = "admin";

		//�����λ��ᣬ��ѭ���Ľ��������forѭ��
		for (int x = 0; x < 3; x++) {
			//x=0,1,2
			//����¼���û��������롣
			Scanner sc = new Scanner(System.in);
			System.out.println("�������û�����");
			String name = sc.nextLine();
			System.out.println("���������룺");
			String pwd = sc.nextLine();

			//�Ƚ��û��������롣
			if (name.equals(username) && pwd.equals(password)) {
				//�������ͬ�����¼�ɹ�
				System.out.println("��¼�ɹ�");
				break;
			} else {
				//�����һ����ͬ�����¼ʧ��
				//2,1,0
				//����ǵ�0�Σ�Ӧ�û�һ����ʾ
				if ((2 - x) == 0) {
					System.out.println("�ʺű�����������೤��ϵ");
				} else {
					System.out.println("��¼ʧ�ܣ��㻹��" + (2 - x) + "�λ���");
				}
			}
		}
	}
}