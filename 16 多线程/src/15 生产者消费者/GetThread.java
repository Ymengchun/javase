package Thread_03;

//消费者进程
public class GetThread implements Runnable {
	private Student s;

	public GetThread(Student s) {
		this.s = s;
	}

	@Override
	public void run() {
		System.out.println(s.name + "---" + s.age);
	}

}
