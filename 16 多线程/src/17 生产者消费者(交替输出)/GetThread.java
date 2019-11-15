package Thread_05;

//�������߳�
public class GetThread implements Runnable {
	private Student s;

	public GetThread(Student s) {
		this.s = s;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (s) {
				//û�����ݾ͵ȴ�
				if(!s.flag){
					try {
						s.wait(); 
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				System.out.println(s.name + "---" + s.age);
				//����ϼ---27
				//����---30
				
				//�޸ı��Ϊfalse����ʾû������
				s.flag = false;
				//�����߳�
				s.notify(); //����t1
			}
		}
	}
}
