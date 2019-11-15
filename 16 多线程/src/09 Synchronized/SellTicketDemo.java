package Thread_09;

/*
 * 如何解决线程安全问题呢?
 * 
 * 导致线程不安全的原因：(判断是否会发生线程安全问题)
 * 	1.是否是多线程环境
 * 	2.是否有共享数据
 * 	3.是否有多条语句操作共享数据
 * 
 * SellTickets.java是否满足以上条件？
 * 	1.是否是多线程环境：是
 * 	2.是否有共享数据：是
 * 	3.是否有多条语句操作共享数据：是
 * 问题1和问题2我们改变不了，我们只能通过问题3来解决安全问题。
 * 
 * 思想：
 * 		把多条语句操作共享数据的代码包装成一个整体，让某个线程在执行时，其它不能执行——临界区
 * 
 * 同步代码块：
 * 		synchronized(对象){
 * 			需要同步的代码;
 * 		}
 * 
 * 
 * 		注意：
 * 			1.需要同步的代码是：多条语句操作共享数据的代码
 * 			2.synchronized就像为对象加了一把锁，且多个线程必须共用同一把锁
 * 			
 */

public class SellTicketDemo {
	public static void main(String[] args) {
		//创建资源对象
		SellTicket st = new SellTicket();

		//创建三个线程对象
		Thread t1 = new Thread(st, "窗口1");
		Thread t2 = new Thread(st, "窗口2");
		Thread t3 = new Thread(st, "窗口3");

		//启动线程
		t1.start();
		t2.start();
		t3.start();
	}
}