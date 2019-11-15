package Thread_04;

/*
 * java是抢占式调度模型
 * 
 * 获取线程对象的优先级
 * 		public final int getPriority():返回线程对象的优先级
 * 设置线程对象的优先级（没有设置则使用默认优先级）
 * 		public final void setPriority(int newPriority)：更改线程的优先级。 
 * 
 * 注意：
 * 		默认优先级是：5。
 * 		优先级范围：1-10。
 * 		数字越大优先级越高：只表示线程优先执行的概率高（概率高，实际不一定高）
 * 		
 * IllegalArgumentException：非法参数异常。表示向方法传递了一个不合法的参数。 
 * 
 */
public class ThreadPriorityDemo {
	public static void main(String[] args) {
		ThreadPriority tp1 = new ThreadPriority();
		ThreadPriority tp2 = new ThreadPriority();
		ThreadPriority tp3 = new ThreadPriority();
		
		//获取优先级
		//System.out.println(tp1.getPriority());
		//System.out.println(tp2.getPriority());
		//System.out.println(tp3.getPriority());
		
		//设置优先级
		tp1.setPriority(10);
		
		tp1.setName("东方不败");
		tp2.setName("岳不群");
		tp3.setName("林平之");
		
		tp1.start();
		tp2.start();
		tp3.start();
	}
}
