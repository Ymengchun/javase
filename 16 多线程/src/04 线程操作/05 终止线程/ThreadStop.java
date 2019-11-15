package Thread_04;

import java.util.Date;

public class ThreadStop extends Thread {
	@Override
	public void run() {
		System.out.println("开始执行：" + new Date());

		//休眠10秒，显然超过了3秒，直接中断
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			System.out.println("线程被终止了");
		}

		System.out.println("结束执行：" + new Date());
	}
}
