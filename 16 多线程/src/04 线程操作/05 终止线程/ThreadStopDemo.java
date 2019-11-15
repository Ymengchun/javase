package Thread_04;

/*
 * 
 * public final void stop()：终止线程。过时了但还能用。
 * public void interrupt()：终止线程。 把线程的状态终止，并抛出一个InterruptedException。
 * 两种都不建议，建立用一个flag来标志。
 */
public class ThreadStopDemo {
	public static void main(String[] args) {
		ThreadStop ts = new ThreadStop();
		ts.start();
		
		//超过3秒不醒过来，就干死你
		try{
			Thread.sleep(3000);
			//ts.stop();
			ts.interrupt();
		} catch(InterruptedException e){
			e.printStackTrace();
		}
		
		
	}
	
	
}
