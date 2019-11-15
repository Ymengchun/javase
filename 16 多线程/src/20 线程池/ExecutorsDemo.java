package Thread_08;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * ΪʲôҪ�����̳߳أ�
 * 	�������̵߳ĳɱ��ߣ����߳�Ҫ��OS������
 * 	���̳߳��е��߳������н����󣬲��������������ٴλص��̳߳��г�Ϊ����״̬���ȴ���һ��������á�
 * 
 * ʵ���̳߳�
 * 		1.�����̳߳صķ����кö��֣�����ѡ�����·�����
 * 			����һ���̳߳ض��󣬲�˵��Ҫ�������̶߳���ĸ�����public static ExecutorService newFixedThreadPool(int nThreads)
 * 		2.�����ַ����������̳߳��е��߳̿���ִ�У�
 * 			Runnable�����Callable���������߳�
 * 			����һ���࣬ʵ��Runnable�ӿڡ�
 * 		3.�������·�������
 * 			Future<?> submit(Runnable task)
 *			<T> Future<T> submit(Callable<T> task)
 *		4.shutdown()�Ž��������򷵻��̳߳ء�
 */
public class ExecutorsDemo {
	public static void main(String[] args) {
		//�����̳߳ض���˵��Ҫ����2���̶߳���
		ExecutorService pool = Executors.newFixedThreadPool(2);

		//����ִ��Runnable�����Callable���������߳�
		pool.submit(new MyRunnable());
		pool.submit(new MyRunnable());

		//�����̳߳أ�û����һ�����̷߳����̳߳ز��������
		pool.shutdown();
	}
}
