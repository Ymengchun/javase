package Thread_02;

/*
 * ͬ���ı׶ˣ�
 * 		1.Ч�ʵ�
 * 		2.���ײ�������
 * 
 * ������
 * 		�������������ϵ��߳���������Դ�Ĺ����У�������һ���໥�ȴ�������
 * 
 * ������ɽ�����
 */
public class DieLockDemo {
	public static void main(String[] args) {
		DieLock dl1 = new DieLock(true);
		DieLock dl2 = new DieLock(false);

		dl1.start();
		dl2.start();
	}
}
