package Demo_08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/*
 * ����������¼�������ݣ�����0������Ҫ���ڿ���̨������������е����ֵ
 *
 * ������
 * 		1.��������¼�����ݶ���
 * 		2.�ü��ϴ洢����
 * 		3.��0�������������¼��0����ֹͣ��������
 * 		4.�Լ�������
 * 		5.��ȡ�����е����������ֵ
 */
public class ArrayListDemo {
	public static void main(String[] args) {
		//��������¼�����ݶ���
		Scanner sc = new Scanner(System.in);

		//����¼�������ݣ���0����
		ArrayList<Integer> array = new ArrayList<Integer>();
		while (true) {
			System.out.println("���������ݣ�");
			int number = sc.nextInt();
			if (number != 0) {
				array.add(number);
			} else {
				break;
			}
		}
		
		Collections.sort(array);
		System.out.println("���ֵΪ��" + array.get(array.size()-1));
	}
}


