package Thread_04;

/*
 * 
 * public final void stop()����ֹ�̡߳���ʱ�˵������á�
 * public void interrupt()����ֹ�̡߳� ���̵߳�״̬��ֹ�����׳�һ��InterruptedException��
 * ���ֶ������飬������һ��flag����־��
 */
public class ThreadStopDemo {
	public static void main(String[] args) {
		ThreadStop ts = new ThreadStop();
		ts.start();
		
		//����3�벻�ѹ������͸�����
		try{
			Thread.sleep(3000);
			//ts.stop();
			ts.interrupt();
		} catch(InterruptedException e){
			e.printStackTrace();
		}
		
		
	}
	
	
}
