package Thread_04;

/*
 * 案例：生产者-消费者问题（加入循环改进）
 * 注意：1.不同的线程都要加锁；2.必须是同一把锁
 */
public class StudentDemo {
	public static void main(String[] args) {
		//创建资源
		Student s = new Student();
		
		//设置和获取的类
		SetThread st = new SetThread(s);
		GetThread gt = new GetThread(s);

		//线程类
		Thread t1 = new Thread(st);
		Thread t2 = new Thread(gt);

		//启动线程
		t1.start();
		t2.start();
	}
}
