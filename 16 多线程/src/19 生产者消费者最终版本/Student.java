package Thread_07;

public class Student {
	private String name;
	private int age;
	private boolean flag; //默认情况是没有数据，如果是true，说明有数据

	//模拟生产者线程的生产过程
	public synchronized void set(String name, int age) {	
		//如果有数据，就等待
		if (this.flag) {	//方法的同步对象是this
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		//设置数据
		this.name = name;
		this.age = age;

		//修改标记
		this.flag = true;
		this.notify();
	}

	
	//模拟消费者线程的消费过程
	public synchronized void get() {
		//如果没有数据，就等待
		if (!this.flag) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		//获取数据
		System.out.println(this.name + "---" + this.age);

		//修改标记
		this.flag = false;
		this.notify();
	}
}
