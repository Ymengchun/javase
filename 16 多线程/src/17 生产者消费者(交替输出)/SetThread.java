package Thread_05;

//生产者线程
public class SetThread implements Runnable {

	private Student s;
	private int x = 0;	//控制奇偶

	public SetThread(Student s) {
		this.s = s;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (s) {
				//判断有没有数据，初始情况是没有
				if(s.flag){	//有数据，生产者线程就等待
					try {
						s.wait(); 
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				//没有数据，生产者线程就生产数据
				if (x % 2 == 0) {
					s.name = "林青霞";
					s.age = 27;
				} else {
					s.name = "刘意";
					s.age = 30;
				}
				x++; //x=1
				
				//修改标记为true，表示有数据
				s.flag = true;
				//唤醒消费者线程
				s.notify(); //唤醒t2并不表示t2可以立刻执行，必须还得抢CPU的执行权。
			}
			//t1有，或者t2有
		}
	}
}
