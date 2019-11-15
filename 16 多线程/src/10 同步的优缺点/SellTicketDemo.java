package Thread_10;

/*
 * 案例：火车上厕所。
 * 		
 * 同步的特点：
 * 		1.前提：多个线程
 *		2.注意：多个线程共用同一个锁对象
 * 同步的好处 ：
 *		解决了多线程的安全问题。
 * 同步的缺点
 *		线程较多时，每个线程都会去判断锁对象是否上了锁（上了锁就不访问，没上锁才能访问），判断过程很耗费资源，降低运行效率。
 */

public class SellTicketDemo {
	public static void main(String[] args) {
		//创建资源对象
		SellTicket st = new SellTicket();

		//创建三个线程对象
		Thread t1 = new Thread(st, "窗口1");
		Thread t2 = new Thread(st, "窗口2");
		Thread t3 = new Thread(st, "窗口3");

		// 启动线程
		t1.start();
		t2.start();
		t3.start();
	}
}