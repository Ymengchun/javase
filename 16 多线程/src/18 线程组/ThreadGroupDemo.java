package Thread_06;

/*
 * 线程组： 把多个线程组合在一起。
 * 作用：对一批线程分类管理，Java允许程序直接控制线程组。
 */
public class ThreadGroupDemo {
	
	private static void method2() {
		//创建线程组
		//ThreadGroup(String name)
		ThreadGroup tg = new ThreadGroup("这是一个新的组");

		MyRunnable my = new MyRunnable();

		//把线程加入线程组
		//Thread(ThreadGroup group, Runnable target, String name)
		Thread t1 = new Thread(tg, my, "林青霞");
		Thread t2 = new Thread(tg, my, "刘意");
		
		System.out.println(t1.getThreadGroup().getName());
		System.out.println(t2.getThreadGroup().getName());
		
		//把整个线程组的线程都设置为后台线程
		tg.setDaemon(true);
	}

	private static void method1() {
		MyRunnable my = new MyRunnable();
		Thread t1 = new Thread(my, "林青霞");
		Thread t2 = new Thread(my, "刘意");
	
		// 获取线程所在的线程组：public final ThreadGroup getThreadGroup()
		ThreadGroup tg1 = t1.getThreadGroup();
		ThreadGroup tg2 = t2.getThreadGroup();
		// 获取线程组名：public final String getName()
		String name1 = tg1.getName();
		String name2 = tg2.getName();
		System.out.println(name1);
		System.out.println(name2);
		// 结果表明：线程默认属于main线程组
		// System.out.println(Thread.currentThread().getThreadGroup().getName());	//默认情况下属于main线程组
	}
	
	public static void main(String[] args) {
		// method1();

		// 修改线程所在的线程组：1.创建一个线程组；2，创建其他线程的时候，把其他线程的组指定为我们自己新建的线程组
		method2();

	}
}
