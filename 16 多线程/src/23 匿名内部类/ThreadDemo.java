package Thread_11;

/*
 * �����ڲ��ࣺ
 * 		new ������ӿ���() {
 * 			��д����;
 * 		};
 * 		�����ڲ���ı��ʣ�����new�����ӿڵ��������
 */
public class ThreadDemo {
	public static void main(String[] args) {
		//ͨ���̳�Thread����ʵ�ֶ��߳�
		new Thread() {		//new Thread(){}.start();
			@Override
			public void run() {
				for (int x = 0; x < 100; x++) {
					System.out.println(Thread.currentThread().getName() + ":" + x);
				}
			}
		}.start();	//start()����

		
		//ͨ��ʵ��Runnable�ӿ���ʵ�ֶ��߳�
		//Thread���������Ϊ�գ�Runnable()�ӿ���дһ��run()����
			@Override
			public void run() {	//new Thread(){}.start();
					System.out.println(Thread.currentThread().getName() + ":" + x);
				}
			}
		}) {}.start();

		
		
		//�����Ѷȵ�
		//Thread�����������дһ��run()������Runnable()�ӿ�Ҳ��дһ��run()����
		//��������ִ�е���Thread���������ķ���������ӡ"world" 
		new Thread(new Runnable() {	//new Thread(){}.start();
			@Override
			public void run() {
				for (int x = 0; x < 100; x++) {
					System.out.println("hello" + ":" + x);
				}
			}
		}) {
			public void run() {
				for (int x = 0; x < 100; x++) {
					System.out.println("world" + ":" + x);
				}
			}
		}.start();
	}
}
