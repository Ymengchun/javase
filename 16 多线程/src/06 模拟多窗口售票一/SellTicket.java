package Thread_06;

public class SellTicket extends Thread {

	//����100��Ʊ
	//private int tickets = 100;
	//Ϊ���ö���̶߳�������100��Ʊ�������static����
	private static int tickets = 100;

	@Override
	public void run() {
		//���������ﶨ��100��Ʊ��������൱��ÿ�����ڶ���100��Ʊ
		
		//ģ��һֱ��Ʊ
		while (true) {
			if (tickets > 0) {
				System.out.println(getName() + "���ڳ��۵�" + (100-(--tickets)) + "��Ʊ");
			}
		}
	}
}
