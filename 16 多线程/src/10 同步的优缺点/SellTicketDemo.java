package Thread_10;

/*
 * ���������ϲ�����
 * 		
 * ͬ�����ص㣺
 * 		1.ǰ�᣺����߳�
 *		2.ע�⣺����̹߳���ͬһ��������
 * ͬ���ĺô� ��
 *		����˶��̵߳İ�ȫ���⡣
 * ͬ����ȱ��
 *		�߳̽϶�ʱ��ÿ���̶߳���ȥ�ж��������Ƿ����������������Ͳ����ʣ�û�������ܷ��ʣ����жϹ��̺ܺķ���Դ����������Ч�ʡ�
 */

public class SellTicketDemo {
	public static void main(String[] args) {
		//������Դ����
		SellTicket st = new SellTicket();

		//���������̶߳���
		Thread t1 = new Thread(st, "����1");
		Thread t2 = new Thread(st, "����2");
		Thread t3 = new Thread(st, "����3");

		// �����߳�
		t1.start();
		t2.start();
		t3.start();
	}
}