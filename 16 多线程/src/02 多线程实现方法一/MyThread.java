package Thread_02;

/*
 * ΪʲôҪ��дrun()������hread���еĴ��벻��ȫ��ִ�У�run()�ķ�����ָ������Ҫִ�еĴ��루�����ִ�����ݣ�
 */

public class MyThread extends Thread{
	@Override
	public void run(){
		for(int i = 0; i < 500; i++){	//���û�ж��߳�Ч�����������i����һЩ
			System.out.println(i);
		}
	}
}
