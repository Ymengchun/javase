package Thread_04;

public class GetThread implements Runnable {
	private Student s;

	public GetThread(Student s) {
		this.s = s;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (s) {	//不同线程必须是同一把锁
				System.out.println(s.name + "---" + s.age);
			}
		}
	}
}
