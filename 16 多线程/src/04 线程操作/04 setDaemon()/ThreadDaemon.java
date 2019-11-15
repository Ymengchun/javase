package Thread_04;

public class ThreadDaemon extends Thread {
	@Override
	public void run() {
		for (int x = 0; x < 1000; x++) {
			System.out.println(getName() + ":" + x);
		}
	}
}
