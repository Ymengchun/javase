package Thread_04;

/*
 * java����ռʽ����ģ��
 * 
 * ��ȡ�̶߳�������ȼ�
 * 		public final int getPriority():�����̶߳�������ȼ�
 * �����̶߳�������ȼ���û��������ʹ��Ĭ�����ȼ���
 * 		public final void setPriority(int newPriority)�������̵߳����ȼ��� 
 * 
 * ע�⣺
 * 		Ĭ�����ȼ��ǣ�5��
 * 		���ȼ���Χ��1-10��
 * 		����Խ�����ȼ�Խ�ߣ�ֻ��ʾ�߳�����ִ�еĸ��ʸߣ����ʸߣ�ʵ�ʲ�һ���ߣ�
 * 		
 * IllegalArgumentException���Ƿ������쳣����ʾ�򷽷�������һ�����Ϸ��Ĳ����� 
 * 
 */
public class ThreadPriorityDemo {
	public static void main(String[] args) {
		ThreadPriority tp1 = new ThreadPriority();
		ThreadPriority tp2 = new ThreadPriority();
		ThreadPriority tp3 = new ThreadPriority();
		
		//��ȡ���ȼ�
		//System.out.println(tp1.getPriority());
		//System.out.println(tp2.getPriority());
		//System.out.println(tp3.getPriority());
		
		//�������ȼ�
		tp1.setPriority(10);
		
		tp1.setName("��������");
		tp2.setName("����Ⱥ");
		tp3.setName("��ƽ֮");
		
		tp1.start();
		tp2.start();
		tp3.start();
	}
}
