package Thread_04;

import java.util.Date;

public class ThreadStop extends Thread {
	@Override
	public void run() {
		System.out.println("��ʼִ�У�" + new Date());

		//����10�룬��Ȼ������3�룬ֱ���ж�
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			System.out.println("�̱߳���ֹ��");
		}

		System.out.println("����ִ�У�" + new Date());
	}
}
