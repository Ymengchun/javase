package Thread_08;

/*
 * 案例：还是卖票问题，以实现Runnable接口的方式
 * 
 * 加入延迟（sleep）后，可能产生的问题：
 * 		1.相同的票卖了多次：CPU的一次操作必须是原子性的
 * 		2.出现了负数票：随机性和延迟导致的
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