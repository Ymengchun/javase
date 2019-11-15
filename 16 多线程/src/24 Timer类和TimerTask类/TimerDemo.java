package Thread_12;

import java.util.Timer;
import java.util.TimerTask;

/*
 * 定时器
 * 		应用1：在指定的时间做某件事；
 * 		应用2：重复做某件事。
 * 
 * 依赖于Timer和TimerTas这两个类：
 * 		Timer：定时
 * 			public Timer()：定时器类的构造方法
 * 			public void schedule(TimerTask task, long delay)：一段时间后开始任务
 * 			public void schedule(TimerTask task, long delay, long period)：一段时间后开始任务，结束后隔一段时间再开始任务
 * 			public void cancel()：取消任务
 * 		TimerTask：任务
 */
public class TimerDemo {
	public static void main(String[] args) {
		//创建定时器对象
		Timer t = new Timer();
		//3秒后执行任务
		//t.schedule(new MyTask(), 3000);
		
		//3秒后执行任务
		t.schedule(new MyTask(t), 3000);
	}
}

//做一个任务
class MyTask extends TimerTask {

	private Timer t;
	
	public MyTask(){
	}
	
	public MyTask(Timer t){
		this.t = t;
	}
	
	@Override
	public void run() {
		System.out.println("bang,爆炸了");
		t.cancel();	//任务执行一次就取消
	}

}