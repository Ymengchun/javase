package Thread_08;

public class SellTicket implements Runnable {
	//��100��Ʊ
	private int tickets = 100;

/*
	@Override
	public void run() {
		while (true) {
			//t1,t2,t3�����̣߳���100��Ʊ
			if (tickets > 0) {
				//Ϊ��ģ�����ʵ�ĳ���������������Ϣ������Ʊ���õ������ӳ٣�
				try {
					Thread.sleep(100); //t1�����˲���Ϣ��t2�����˲���Ϣ��t3�����˲���Ϣ
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				System.out.println(Thread.currentThread().getName() + "���ڳ��۵�" + (tickets--) + "��Ʊ");
				//����״̬������1���ڳ��۵�100��Ʊ������2���ڳ��۵�99��Ʊ������
				//��ʵ�ʿ��ܲ�����������ΪCPUִ��һ����һ��ԭ�Ӳ�����tickets--�����β��������ȼ�¼tickets��ֵ����--
				//����һ�ּ���������߳�t1��¼��tickets��ֵ����û��--����ʱ�߳�t2����tickets�����t1��t2�õ�����ͬ��ֵ��������Υ����ʵ�����
			}
		}
	}
*/	
	
	@Override
	public void run() {
		while (true) {
			//t1,t2,t3�����̣߳���һ��Ʊ
			if (tickets > 0) {
				//Ϊ��ģ�����ʵ�ĳ���������������Ϣ������Ʊ���õ������ӳ٣�
				try {
					Thread.sleep(100); //t1�����˲���Ϣ��t2�����˲���Ϣ��t3�����˲���Ϣ
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				System.out.println(Thread.currentThread().getName() + "���ڳ��۵�"
						+ (tickets--) + "��Ʊ");
				//����1���ڳ��۵�1��Ʊ,tickets=0
				//����2���ڳ��۵�0��Ʊ,tickets=-1
				//����3���ڳ��۵�-1��Ʊ,tickets=-2
				//��������100��Ʊʱ������
			}
		}
	}
}
