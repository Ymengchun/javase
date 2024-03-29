package Thread_09;

public class SellTicket implements Runnable {
	//定义100张票
	private int tickets = 100;
	//创建锁对象
	private Object obj = new Object();

/*
	@Override
	public void run() {
		while (true) {

			synchronized(new Object()){	//错误，多个线程必须是同一把锁，而这里来一个线程就new一个新Object对象，显然不是同一把锁；要事先创建锁对象
				if (tickets > 0) {
					try {
						Thread.sleep(100); 
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName() + "正在出售第"
							+ (tickets--) + "张票");
				}
			}
		}
	}
*/
	
	@Override
	public void run() {
		while (true) {
			//这里的写法是正确的
			synchronized (obj) {
				if (tickets > 0) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()
							+ "正在出售第" + (tickets--) + "张票");
				}
			}
		}
	}
}
