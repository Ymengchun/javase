package Thread_07;

/*
 * ������������-�����ߵ����հ汾
 * 
 * �Ľ���
 * 		��Student�ĳ�Ա������Ϊ˽�С�
 * 		�����úͻ�ȡ�Ĳ�������װ���˹��ܣ�������ͬ����
 * 		ֻ���������߻��������߳�������÷������ɡ�
 */
public class StudentDemo {
	public static void main(String[] args) {
		//������Դ
		Student s = new Student();
		
		//�������̺߳��������߳�
		SetThread st = new SetThread(s);
		GetThread gt = new GetThread(s);

		//�߳���
		Thread t1 = new Thread(st);
		Thread t2 = new Thread(gt);

		//�����߳�
		t1.start();
		t2.start();
	}
}
