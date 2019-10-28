package Demo_03;

import java.util.Scanner;

/*
 * ������С��Ϸ
 * ����һ��1~100���������int number = (int) (Math.random() * 100) + 1;
 */
public class GuessNumberGame {
	private GuessNumberGame() {
	}

	public static void start() {
		//����һ��1~100�������
		int number = (int) (Math.random() * 100) + 1;

		while (true) {
			//����¼������
			Scanner sc = new Scanner(System.in);
			System.out.println("��������Ҫ�µ�����(1-100)��");
			int guessNumber = sc.nextInt();

			//�ж�
			if (guessNumber > number) {
				System.out.println("��µ�����" + guessNumber + "����");
			} else if (guessNumber < number) {
				System.out.println("��µ�����" + guessNumber + "С��");
			} else {
				System.out.println("��ϲ�㣬������");
				break;
			}
		}
	}
}
