package Thread_09;

import java.util.concurrent.Callable;

//ʵ�ֶ��̵߳ĵ�3�ַ�����ʵ��Callable�ӿڣ����ַ��������̳߳ء�
//Callable����һ�ִ����͵Ľӿڡ�
//����ָ���ķ�����ʵ��call()�����ķ���ֵ���͡�
public class MyCallable implements Callable {

	@Override
	//��дcall()����
	public Object call() throws Exception {
		for (int x = 0; x < 100; x++) {
			System.out.println(Thread.currentThread().getName() + ":" + x);
		}
		return null;
	}

}
