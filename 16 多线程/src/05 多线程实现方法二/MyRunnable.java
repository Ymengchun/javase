package Thread_05;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		for (int x = 0; x < 100; x++) {
			//ͨ��ʵ��Runnable�ӿڴ������̵߳ķ�ʽ����ֱ��ʹ��Thread�෽���������Լ��ʹ��
			//ͨ��ʵ��Runnable�ӿڴ������̣߳������ϻ���ʹ��Thread��
			System.out.println(Thread.currentThread().getName() + ":" + x);
		}
	}

}