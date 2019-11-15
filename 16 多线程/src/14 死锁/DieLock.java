package Thread_02;

public class DieLock extends Thread {

	private boolean flag;

	public DieLock(boolean flag) {
		this.flag = flag;
	}

	@Override
	public void run() {
		//假设有两个线程，一个线程进入if，一个线程进入else，可能引起死锁
		if (flag) {
			synchronized (MyLock.objA) {	//用A锁
				System.out.println("if objA");
				synchronized (MyLock.objB) {	//用B锁
					System.out.println("if objB");
				}
			}
		} else {
			synchronized (MyLock.objB) {	//用B锁
				System.out.println("else objB");
				synchronized (MyLock.objA) {	//用A锁
					System.out.println("else objA");
				}
			}
		}
	}
}
