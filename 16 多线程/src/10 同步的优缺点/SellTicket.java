package Thread_10;

public class SellTicket implements Runnable {

	//定义100张票
	private int tickets = 100;

	//定义同一把锁
	private Object obj = new Object();

	@Override
	public void run() {
		while (true) {
			//t1,t2,t3走到这里
			//假设t1抢到CPU的执行权，t1就要进来，把门上锁
			//假设t2抢到CPU的执行权，t2就要进来，发现门是关着的，进不去。所以就等着。
			//门(开,关)
			synchronized (obj) { 
				if (tickets > 0) {
					try {
						Thread.sleep(100); // t1睡眠
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()
							+ "正在出售第" + (tickets--) + "张票 ");
				}
			} //t1要出来，开锁
		}
	}
}
