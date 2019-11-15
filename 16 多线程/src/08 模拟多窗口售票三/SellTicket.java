package Thread_08;

public class SellTicket implements Runnable {
	//有100张票
	private int tickets = 100;

/*
	@Override
	public void run() {
		while (true) {
			//t1,t2,t3三个线程，卖100张票
			if (tickets > 0) {
				//为了模拟更真实的场景，我们稍作休息（从买票到拿到手有延迟）
				try {
					Thread.sleep(100); //t1进来了并休息，t2进来了并休息，t3进来了并休息
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				System.out.println(Thread.currentThread().getName() + "正在出售第" + (tickets--) + "张票");
				//理想状态：窗口1正在出售第100张票，窗口2正在出售第99张票···
				//但实际可能不是这样，因为CPU执行一次是一个原子操作，tickets--是两次操作——先记录tickets的值，再--
				//考虑一种极端情况：线程t1记录了tickets的值，还没有--，此时线程t2访问tickets，结果t1和t2得到了相同的值，这样就违背了实际情况
			}
		}
	}
*/	
	
	@Override
	public void run() {
		while (true) {
			//t1,t2,t3三个线程，卖一张票
			if (tickets > 0) {
				//为了模拟更真实的场景，我们稍作休息（从买票到拿到手有延迟）
				try {
					Thread.sleep(100); //t1进来了并休息，t2进来了并休息，t3进来了并休息
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				System.out.println(Thread.currentThread().getName() + "正在出售第"
						+ (tickets--) + "张票");
				//窗口1正在出售第1张票,tickets=0
				//窗口2正在出售第0张票,tickets=-1
				//窗口3正在出售第-1张票,tickets=-2
				//分析和有100张票时；类似
			}
		}
	}
}
