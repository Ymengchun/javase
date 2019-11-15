package Thread_09;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * 多线程的实现方式3：
 * 		1.创建线程池的方法有好多种，我们选用如下方法。
 * 			创建一个线程池对象，并说明要创建的线程对象的个数。
 * 			public static ExecutorService newFixedThreadPool(int nThreads)
 * 		2.用这种方法创建的线程池中的线程可以执行：
 * 			Runnable对象或Callable对象代表的线程
 * 			创建一个类，实现Runnable接口。
 * 		3.调用如下方法即可
 * 			Future<?> submit(Runnable task)
 *			<T> Future<T> submit(Callable<T> task)
 *		4.shutdown()才结束，否则返回线程池。
 */
public class CallableDemo {
	public static void main(String[] args) {
		//创建线程池对象
		ExecutorService pool = Executors.newFixedThreadPool(2);
		
		//可以执行Runnable对象或者Callable对象代表的线程
		pool.submit(new MyCallable());
		pool.submit(new MyCallable());
		
		//结束
		pool.shutdown();
	}
}
