package Thread_02;

/*
 * 同步的弊端：
 * 		1.效率低
 * 		2.容易产生死锁
 * 
 * 死锁：
 * 		两个或两个以上的线程在争夺资源的过程中，发生的一种相互等待的现象。
 * 
 * 举例：山羊过桥
 */
public class DieLockDemo {
	public static void main(String[] args) {
		DieLock dl1 = new DieLock(true);
		DieLock dl2 = new DieLock(false);

		dl1.start();
		dl2.start();
	}
}
