package Thread_04;


/*
 * �ػ��̣߳��û��߳�/��̨�̣߳�:
 * 		���1.���߳���֮ǰ���ػ��߳̾����ˣ�
 * 		���2.���߳������ػ��̲߳���ҲҪ������ִ��һ�ᣬ������ִ���������̣߳�
 * public final void setDaemon(boolean on):�����̱߳��Ϊ�ػ��̡߳�
 * ���������е��̶߳����ػ��߳�ʱ��JVM�˳��� �÷��������������߳�ǰ���á� 
 * 
 */
public class ThreadDaemonDemo {
	public static void main(String[] args) {
		ThreadDaemon td1 = new ThreadDaemon();
		ThreadDaemon td2 = new ThreadDaemon();
		
		td1.setName("�ŷ�");
		td2.setName("����");
		
		//�����ػ��߳�
		td1.setDaemon(true);	//����������ǰ���ø÷���
		td2.setDaemon(true);
		
		td1.start();
		td2.start();
		
		Thread.currentThread().setName("����");	//���߳�
		
		for(int i = 0; i < 5; i++){
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
		
		
	}
}
