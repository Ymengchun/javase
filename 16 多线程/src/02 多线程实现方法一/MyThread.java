package Thread_02;

/*
 * 为什么要重写run()方法：hread类中的代码不必全部执行，run()的方法体指明了需要执行的代码（具体的执行内容）
 */

public class MyThread extends Thread{
	@Override
	public void run(){
		for(int i = 0; i < 500; i++){	//如果没有多线程效果，把这里的i调大一些
			System.out.println(i);
		}
	}
}
