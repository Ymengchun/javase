package Thread_12;

import java.util.Timer;
import java.util.TimerTask;

/*
 * ������ÿ��һ��ʱ��ִ������
 */
public class TimerDemo2 {
	public static void main(String[] args) {
		//������ʱ������
		Timer t = new Timer();
		//3����һ��ִ���Զ��������Ժ�ÿ��2���ִ��һ��
		t.schedule(new MyTask2(), 3000, 2000);
	}
}

//�Զ�������
class MyTask2 extends TimerTask {
	@Override
	public void run() {
		System.out.println("beng,��ը��");
		//û��t.cancle����������ظ�ִ��
	}
}