package Thread_10;

public class SellTicket implements Runnable {

	//����100��Ʊ
	private int tickets = 100;

	//����ͬһ����
	private Object obj = new Object();

	@Override
	public void run() {
		while (true) {
			//t1,t2,t3�ߵ�����
			//����t1����CPU��ִ��Ȩ��t1��Ҫ��������������
			//����t2����CPU��ִ��Ȩ��t2��Ҫ�������������ǹ��ŵģ�����ȥ�����Ծ͵��š�
			//��(��,��)
			synchronized (obj) { 
				if (tickets > 0) {
					try {
						Thread.sleep(100); // t1˯��
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()
							+ "���ڳ��۵�" + (tickets--) + "��Ʊ ");
				}
			} //t1Ҫ����������
		}
	}
}
