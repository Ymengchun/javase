package Thread_09;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * ���̵߳�ʵ�ַ�ʽ3��
 * 		1.�����̳߳صķ����кö��֣�����ѡ�����·�����
 * 			����һ���̳߳ض��󣬲�˵��Ҫ�������̶߳���ĸ�����
 * 			public static ExecutorService newFixedThreadPool(int nThreads)
 * 		2.�����ַ����������̳߳��е��߳̿���ִ�У�
 * 			Runnable�����Callable���������߳�
 * 			����һ���࣬ʵ��Runnable�ӿڡ�
 * 		3.�������·�������
 * 			Future<?> submit(Runnable task)
 *			<T> Future<T> submit(Callable<T> task)
 *		4.shutdown()�Ž��������򷵻��̳߳ء�
 */
public class CallableDemo {
	public static void main(String[] args) {
		//�����̳߳ض���
		ExecutorService pool = Executors.newFixedThreadPool(2);
		
		//����ִ��Runnable�������Callable���������߳�
		pool.submit(new MyCallable());
		pool.submit(new MyCallable());
		
		//����
		pool.shutdown();
	}
}
