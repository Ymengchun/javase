package Thread_05;

//�������߳�
public class SetThread implements Runnable {

	private Student s;
	private int x = 0;	//������ż

	public SetThread(Student s) {
		this.s = s;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (s) {
				//�ж���û�����ݣ���ʼ�����û��
				if(s.flag){	//�����ݣ��������߳̾͵ȴ�
					try {
						s.wait(); 
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				//û�����ݣ��������߳̾���������
				if (x % 2 == 0) {
					s.name = "����ϼ";
					s.age = 27;
				} else {
					s.name = "����";
					s.age = 30;
				}
				x++; //x=1
				
				//�޸ı��Ϊtrue����ʾ������
				s.flag = true;
				//�����������߳�
				s.notify(); //����t2������ʾt2��������ִ�У����뻹����CPU��ִ��Ȩ��
			}
			//t1�У�����t2��
		}
	}
}
