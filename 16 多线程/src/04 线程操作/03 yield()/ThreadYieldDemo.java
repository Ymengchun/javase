package Thread_04;

/*
 * public static void yield():暂停当前正在执行的线程，并执行其他线程。 
 * 作用：尽量让线程交替进行，但不能保证一人一次交替进行。
 */
public class ThreadYieldDemo {
	public static void main(String[] args) {
		ThreadYield ty1 = new ThreadYield();
		ThreadYield ty2 = new ThreadYield();
		
		ty1.setName("林青霞");
		ty2.setName("张曼玉");
		
		ty1.start();
		ty2.start();
	}
}
