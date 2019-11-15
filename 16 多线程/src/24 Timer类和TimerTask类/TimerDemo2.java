package Thread_12;

import java.util.Timer;
import java.util.TimerTask;

/*
 * 案例：每隔一段时间执行任务
 */
public class TimerDemo2 {
	public static void main(String[] args) {
		//创建定时器对象
		Timer t = new Timer();
		//3秒后第一次执行自定义任务，以后每隔2秒就执行一次
		t.schedule(new MyTask2(), 3000, 2000);
	}
}

//自定义任务
class MyTask2 extends TimerTask {
	@Override
	public void run() {
		System.out.println("beng,爆炸了");
		//没有t.cancle，任务可以重复执行
	}
}