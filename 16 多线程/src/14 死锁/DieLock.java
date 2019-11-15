package Thread_02;

public class DieLock extends Thread {

	private boolean flag;

	public DieLock(boolean flag) {
		this.flag = flag;
	}

	@Override
	public void run() {
		//�����������̣߳�һ���߳̽���if��һ���߳̽���else��������������
		if (flag) {
			synchronized (MyLock.objA) {	//��A��
				System.out.println("if objA");
				synchronized (MyLock.objB) {	//��B��
					System.out.println("if objB");
				}
			}
		} else {
			synchronized (MyLock.objB) {	//��B��
				System.out.println("else objB");
				synchronized (MyLock.objA) {	//��A��
					System.out.println("else objA");
				}
			}
		}
	}
}
