package Thread_05;

/*
 * ���̵߳�ʵ�ַ�ʽ2��ʵ��Runnable�ӿ�
 * ���裺
 * 		1.ʵ��Runnable�ӿ�
 * 		2.��дrun()����
 * 		3.����MyRunnable��Ķ���
 * 		4.����Thread��Ķ��󣬲��Ѳ���3�Ķ�����Ϊ�����������
 * 
 * ʵ��Runnable�ӿڵ��ŵ�
 * 		1.Javaֻ�ܵ��̳У��̳���Thread�Ͳ����ټ̳б����
 * 		2.�ӿڿ��Զ�ʵ�֣�ʵ����Runnable�ӿڻ�����ʵ�������ӿ�
 * 
 */
public class MyRunnableDemo {
	public static void main(String[] args) {
		//����MyRunnable��Ķ���
		MyRunnable my = new MyRunnable();

		//����Thread��Ķ��󣬲��Ѳ���3�Ķ�����Ϊ�����������
		//Thread t1 = new Thread(my);
		//Thread t2 = new Thread(my);
		//t1.setName("����ϼ");
		//t2.setName("����");

		//����������Ϊһ��
		Thread t1 = new Thread(my, "����ϼ");
		Thread t2 = new Thread(my, "����");

		t1.start();
		t2.start();
	}
}