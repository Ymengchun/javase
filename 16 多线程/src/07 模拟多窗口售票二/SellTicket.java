package Thread_07;

public class SellTicket implements Runnable {
	//定义100张票
	private int tickets = 100;

	@Override
	public void run() {
		while (true) {
			if (tickets > 0) {
				System.out.println(Thread.currentThread().getName() + "正在出售第"
						+ (100-(--tickets)) + "张票");
			}
		}
	}
}
