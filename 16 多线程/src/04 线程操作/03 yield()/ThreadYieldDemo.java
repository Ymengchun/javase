package Thread_04;

/*
 * public static void yield():��ͣ��ǰ����ִ�е��̣߳���ִ�������̡߳� 
 * ���ã��������߳̽�����У������ܱ�֤һ��һ�ν�����С�
 */
public class ThreadYieldDemo {
	public static void main(String[] args) {
		ThreadYield ty1 = new ThreadYield();
		ThreadYield ty2 = new ThreadYield();
		
		ty1.setName("����ϼ");
		ty2.setName("������");
		
		ty1.start();
		ty2.start();
	}
}
