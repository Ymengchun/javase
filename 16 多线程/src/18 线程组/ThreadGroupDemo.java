package Thread_06;

/*
 * �߳��飺 �Ѷ���߳������һ��
 * ���ã���һ���̷߳������Java�������ֱ�ӿ����߳��顣
 */
public class ThreadGroupDemo {
	
	private static void method2() {
		//�����߳���
		//ThreadGroup(String name)
		ThreadGroup tg = new ThreadGroup("����һ���µ���");

		MyRunnable my = new MyRunnable();

		//���̼߳����߳���
		//Thread(ThreadGroup group, Runnable target, String name)
		Thread t1 = new Thread(tg, my, "����ϼ");
		Thread t2 = new Thread(tg, my, "����");
		
		System.out.println(t1.getThreadGroup().getName());
		System.out.println(t2.getThreadGroup().getName());
		
		//�������߳�����̶߳�����Ϊ��̨�߳�
		tg.setDaemon(true);
	}

	private static void method1() {
		MyRunnable my = new MyRunnable();
		Thread t1 = new Thread(my, "����ϼ");
		Thread t2 = new Thread(my, "����");
	
		// ��ȡ�߳����ڵ��߳��飺public final ThreadGroup getThreadGroup()
		ThreadGroup tg1 = t1.getThreadGroup();
		ThreadGroup tg2 = t2.getThreadGroup();
		// ��ȡ�߳�������public final String getName()
		String name1 = tg1.getName();
		String name2 = tg2.getName();
		System.out.println(name1);
		System.out.println(name2);
		// ����������߳�Ĭ������main�߳���
		// System.out.println(Thread.currentThread().getThreadGroup().getName());	//Ĭ�����������main�߳���
	}
	
	public static void main(String[] args) {
		// method1();

		// �޸��߳����ڵ��߳��飺1.����һ���߳��飻2�����������̵߳�ʱ�򣬰������̵߳���ָ��Ϊ�����Լ��½����߳���
		method2();

	}
}
