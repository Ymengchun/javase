package Thread_11;

/*
 * 1.同步代码块的锁对象是谁?
 * 		任意对象。
 * 2.怎样将方法同步？同步方法的锁对象是谁?
 * 		把同步关键字加在方法上。同步方法的锁对象是this。
 * 3.静态方法的锁对象是谁?
 * 		类的字节码文件对象。(反射会讲)
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