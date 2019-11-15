package Thread_02;

/*
 * 案例：实现多线程。
 * 
 * 如何实现？
 * 		线程依赖进程而存在，故应该先创建一个进程。
 * 		进程由系统创建，故应该调用系统功能创建一个进程。
 * 		Java不能直接调用系统功能的，故不能直接实现多线程。
 * 		但Java可以调用C/C++写好的程序来实现多线程
 * 		由C/C++去调用系统功能创建进程，然后由Java去调用这样的东西，
 * 		然后提供一些类供我们使用。我们就可以实现多线程程序了。
 * 
 * 
 * 方式1：继承Thread类。
 * 		1.继承Thread类
 * 		2.重写run()方法：run()的方法体指明了需要执行的代码
 * 		3.创建对象:MyThread my = new MyThread();
 * 		4.启动线程:my.run();
 * 
 * 
 * run()和start()的区别?
 * 		run():只是直接调用，是普通方法。调用run()是单线程的。
 * 		start():先启动线程，再由jvm去调用run()。调用start()是多线程的
 * 
 * 
 * IllegalThreadStateException：非法的线程状态异常
 */
public class MyThreadDemo {
	public static void main(String[] args) {
		MyThread my1 = new MyThread();
		MyThread my2 = new MyThread();
		
		my1.start();
		
		//报错：IllegalThreadStateException
		//这相当于是my1线程被调用了两次，而不是启动两个线程
		//my1.start();
		my2.start();
	}
}

