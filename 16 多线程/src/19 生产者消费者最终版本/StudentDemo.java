package Thread_07;

/*
 * 案例：生产者-消费者的最终版本
 * 
 * 改进：
 * 		把Student的成员变量设为私有。
 * 		把设置和获取的操作给封装成了功能，并加了同步。
 * 		只需在生产者或消费者线程里面调用方法即可。
 */
public class StudentDemo {
	public static void main(String[] args) {
		//创建资源
		Student s = new Student();
		
		//生产者线程和消费者线程
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
