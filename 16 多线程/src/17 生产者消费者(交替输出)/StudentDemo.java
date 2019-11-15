package Thread_05;

/*
 * 案例：生产者-消费者问题
 * 改进：让两个线程一对一次交替输出
 * 
 * 解决：等待唤醒机制
 *  
 * 等待唤醒：
 * 		Object类中提供了三个方法：
 * 			wait()：等待
 * 			notify()：唤醒单个线程
 * 			notifyAll()：唤醒所有线程
 * 		为什么这些方法不定义在Thread类中?
 * 			这些方法要通过锁对象调用，我们刚才使用的锁对象是任意锁对象。
 * 			因此这些方法必须定义在Object类中。
 */
public class StudentDemo {
	public static void main(String[] args) {
		//创建资源
		Student s = new Student();
		
		//设置和获取的类
		SetThread st = new SetThread(s);
		GetThread gt = new GetThread(s);

		//线程类
		Thread t1 = new Thread(st);
		Thread t2 = new Thread(gt);

		//启动线程
		t1.start();
		t2.start();
	}
}
