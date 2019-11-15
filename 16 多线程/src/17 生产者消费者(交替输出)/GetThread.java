package Thread_05;

//消费者线程
public class GetThread implements Runnable {
	private Student s;

	public GetThread(Student s) {
		this.s = s;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (s) {
				//没有数据就等待
				if(!s.flag){
					try {
						s.wait(); 
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				System.out.println(s.name + "---" + s.age);
				//林青霞---27
				//刘意---30
				
				//修改标记为false，表示没有数据
				s.flag = false;
				//唤醒线程
				s.notify(); //唤醒t1
			}
		}
	}
}
