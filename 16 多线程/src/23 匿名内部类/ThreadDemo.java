package Thread_11;

/*
 * 匿名内部类：
 * 		new 类名或接口名() {
 * 			重写方法;
 * 		};
 * 		匿名内部类的本质：是它new的类或接口的子类对象
 */
public class ThreadDemo {
	public static void main(String[] args) {
		//通过继承Thread类来实现多线程
		new Thread() {		//new Thread(){}.start();
			@Override
			public void run() {
				for (int x = 0; x < 100; x++) {
					System.out.println(Thread.currentThread().getName() + ":" + x);
				}
			}
		}.start();	//start()在这

		
		//通过实现Runnable接口来实现多线程
		//Thread的子类对象为空，Runnable()接口重写一个run()方法
			@Override
			public void run() {	//new Thread(){}.start();
					System.out.println(Thread.currentThread().getName() + ":" + x);
				}
			}
		}) {}.start();

		
		
		//更有难度的
		//Thread的子类对象重写一个run()方法，Runnable()接口也重写一个run()方法
		//不报错，但执行的是Thread的子类对象的方法，即打印"world" 
		new Thread(new Runnable() {	//new Thread(){}.start();
			@Override
			public void run() {
				for (int x = 0; x < 100; x++) {
					System.out.println("hello" + ":" + x);
				}
			}
		}) {
			public void run() {
				for (int x = 0; x < 100; x++) {
					System.out.println("world" + ":" + x);
				}
			}
		}.start();
	}
}
