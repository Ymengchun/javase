package Thread_03;

/*
 * 
 * 案例：生产者-消费者问题
 * 分析：
 * 		资源类：Student	
 * 		设置学生数据：SetThread(生产者)
 * 		获取学生数据：GetThread(消费者)
 * 		测试类：StudentDemo
 * 
 */
public class StudentDemo {
	public static void main(String[] args) {
		//创建资源
		Student s = new Student();
		
		//设置和获取的类
		SetThread st = new SetThread(s);	//生产者进程
		GetThread gt = new GetThread(s);	//消费者进程

		//线程类
		Thread t1 = new Thread(st);
		Thread t2 = new Thread(gt);

		//启动线程
		t1.start();
		t2.start();
	}
}
