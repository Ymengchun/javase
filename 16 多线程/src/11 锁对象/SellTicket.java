package Thread_11;

public class SellTicket implements Runnable {

	//定义100张票
	private static int tickets = 100;

	//定义同一把锁
	private Object obj = new Object();
	private Demo d = new Demo();

	private int x = 0;

	/*
	同步代码块的锁对象：任意对象（这里用obj作为锁对象）
	@Override
	public void run() {
		while (true) {
			synchronized (obj) {
				if (tickets > 0) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()
							+ "正在出售第" + (tickets--) + "张票 ");
				}
			}
		}
	}
	*/
	
	/*
	同步代码块的锁对象：任意对象（这里用d作为锁对象）
	@Override
	public void run() {
		while (true) {
			synchronized (d) {
				if (tickets > 0) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()
							+ "正在出售第" + (tickets--) + "张票 ");
				}
			}
		}
	}
	*/
	
	
	//静态方法的锁对象：类的字节码文件对象（这里是SellTicket.class）
	@Override
	public void run() {
		while (true) {
			if(x%2==0){
				synchronized (SellTicket.class) {
					if (tickets > 0) {
						try {
							Thread.sleep(100);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						System.out.println(Thread.currentThread().getName()
								+ "正在出售第" + (tickets--) + "张票 ");
					}
				}
			} else {
//				synchronized (d) {
//					if (tickets > 0) {
//						try {
//							Thread.sleep(100);
//						} catch (InterruptedException e) {
//							e.printStackTrace();
//						}
//						System.out.println(Thread.currentThread().getName()
//								+ "正在出售第" + (tickets--) + "张票 ");
//					}
//				}
				sellTicket();
			}
			x++;
		}
	}


	/*
	if和else中的代码块相同，就不会产生安全问题
	@Override
	public void run() {
		while (true) {
			if(x%2==0){
				synchronized (d) {
					if (tickets > 0) {
						try {
							Thread.sleep(100);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						System.out.println(Thread.currentThread().getName()
								+ "正在出售第" + (tickets--) + "张票 ");
					}
				}
			} else {
				synchronized (d) {
					if (tickets > 0) {
						try {
							Thread.sleep(100);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						System.out.println(Thread.currentThread().getName()
								+ "正在出售第" + (tickets--) + "张票 ");
					}
				}
				sellTicket();
			}
			x++;
		}
	}
	*/

	
	
	
	//将方法同步：把关键字synchronized加在方法上
	private static synchronized void sellTicket() {
		if (tickets > 0) {
		try {
				Thread.sleep(100);
		} catch (InterruptedException e) {
				e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()
					+ "正在出售第" + (tickets--) + "张票 ");
		}
	}
}

class Demo {
}
