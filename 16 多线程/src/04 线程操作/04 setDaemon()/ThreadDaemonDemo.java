package Thread_04;


/*
 * 守护线程（用户线程/后台线程）:
 * 		情况1.主线程死之前，守护线程就死了；
 * 		情况2.主线程死后，守护线程不久也要死（再执行一会，但不会执行完整个线程）
 * public final void setDaemon(boolean on):将该线程标记为守护线程。
 * 当正在运行的线程都是守护线程时，JVM退出。 该方法必须在启动线程前调用。 
 * 
 */
public class ThreadDaemonDemo {
	public static void main(String[] args) {
		ThreadDaemon td1 = new ThreadDaemon();
		ThreadDaemon td2 = new ThreadDaemon();
		
		td1.setName("张飞");
		td2.setName("关羽");
		
		//设置守护线程
		td1.setDaemon(true);	//必须在启动前调用该方法
		td2.setDaemon(true);
		
		td1.start();
		td2.start();
		
		Thread.currentThread().setName("刘备");	//主线程
		
		for(int i = 0; i < 5; i++){
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
		
		
	}
}
