package Thread_06;

public class SellTicket extends Thread {

	//定义100张票
	//private int tickets = 100;
	//为了让多个线程对象共享这100张票，最好用static修饰
	private static int tickets = 100;

	@Override
	public void run() {
		//不能在这里定义100张票，否则就相当于每个窗口都有100张票
		
		//模拟一直有票
		while (true) {
			if (tickets > 0) {
				System.out.println(getName() + "正在出售第" + (100-(--tickets)) + "张票");
			}
		}
	}
}
