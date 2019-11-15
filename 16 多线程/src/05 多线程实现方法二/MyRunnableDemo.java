package Thread_05;

/*
 * 多线程的实现方式2：实现Runnable接口
 * 步骤：
 * 		1.实现Runnable接口
 * 		2.重写run()方法
 * 		3.创建MyRunnable类的对象
 * 		4.创建Thread类的对象，并把步骤3的对象作为构造参数传递
 * 
 * 实现Runnable接口的优点
 * 		1.Java只能单继承，继承了Thread就不能再继承别的类
 * 		2.接口可以多实现，实现了Runnable接口还可以实现其它接口
 * 
 */
public class MyRunnableDemo {
	public static void main(String[] args) {
		//创建MyRunnable类的对象
		MyRunnable my = new MyRunnable();

		//创建Thread类的对象，并把步骤3的对象作为构造参数传递
		//Thread t1 = new Thread(my);
		//Thread t2 = new Thread(my);
		//t1.setName("林青霞");
		//t2.setName("刘意");

		//以上两步合为一步
		Thread t1 = new Thread(my, "林青霞");
		Thread t2 = new Thread(my, "刘意");

		t1.start();
		t2.start();
	}
}