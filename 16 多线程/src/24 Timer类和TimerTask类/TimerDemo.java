package Thread_12;

import java.util.Timer;
import java.util.TimerTask;

/*
 * ��ʱ��
 * 		Ӧ��1����ָ����ʱ����ĳ���£�
 * 		Ӧ��2���ظ���ĳ���¡�
 * 
 * ������Timer��TimerTas�������ࣺ
 * 		Timer����ʱ
 * 			public Timer()����ʱ����Ĺ��췽��
 * 			public void schedule(TimerTask task, long delay)��һ��ʱ���ʼ����
 * 			public void schedule(TimerTask task, long delay, long period)��һ��ʱ���ʼ���񣬽������һ��ʱ���ٿ�ʼ����
 * 			public void cancel()��ȡ������
 * 		TimerTask������
 */
public class TimerDemo {
	public static void main(String[] args) {
		//������ʱ������
		Timer t = new Timer();
		//3���ִ������
		//t.schedule(new MyTask(), 3000);
		
		//3���ִ������
		t.schedule(new MyTask(t), 3000);
	}
}

//��һ������
class MyTask extends TimerTask {

	private Timer t;
	
	public MyTask(){
	}
	
	public MyTask(Timer t){
		this.t = t;
	}
	
	@Override
	public void run() {
		System.out.println("bang,��ը��");
		t.cancel();	//����ִ��һ�ξ�ȡ��
	}

}