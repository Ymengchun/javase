package Thread_03;

/*
 * ��ȡ�̶߳��������
 * public final String getName():��ȡ�̵߳����ơ�
 * �����̶߳��������
 * public final void setName(String name):�����̵߳�����
 * 
 * ��Բ���Thread������࣬��ȡ�߳�����
 * public static Thread currentThread():���ص�ǰ����ִ�е��̶߳���
 * Thread.currentThread().getName()
 */

public class MyThreadDemo {
	public static void main(String[] args) {
		//�޲ι��췽��
		//�����̶߳���
		//MyThread my1 = new MyThread();
		//MyThread my2 = new MyThread();
		//����setName()�����߳�����
		//my1.setName("����ϼ");
		//my2.setName("����");
		//my1.start();
		//my2.start();
		
		//���ô��ι��췽�����߳�������
		//MyThread my1 = new MyThread("����ϼ");
		//MyThread my2 = new MyThread("����");
		//my1.start();
		//my2.start();
		
		//��ȡmain�������ڵ��̶߳��������
		//public static Thread currentThread()�����ص�ǰ����ִ�е��̶߳���
		System.out.println(Thread.currentThread().getName());
	}
}
