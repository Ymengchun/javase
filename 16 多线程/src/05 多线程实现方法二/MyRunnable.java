package Thread_05;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		for (int x = 0; x < 100; x++) {
			//通过实现Runnable接口创建多线程的方式不能直接使用Thread类方法，但可以间接使用
			//通过实现Runnable接口创建多线程，本质上还是使用Thread类
			System.out.println(Thread.currentThread().getName() + ":" + x);
		}
	}

}