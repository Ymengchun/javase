package Thread_02;

/*
 * ������ʵ�ֶ��̡߳�
 * 
 * ���ʵ�֣�
 * 		�߳��������̶����ڣ���Ӧ���ȴ���һ�����̡�
 * 		������ϵͳ��������Ӧ�õ���ϵͳ���ܴ���һ�����̡�
 * 		Java����ֱ�ӵ���ϵͳ���ܵģ��ʲ���ֱ��ʵ�ֶ��̡߳�
 * 		��Java���Ե���C/C++д�õĳ�����ʵ�ֶ��߳�
 * 		��C/C++ȥ����ϵͳ���ܴ������̣�Ȼ����Javaȥ���������Ķ�����
 * 		Ȼ���ṩһЩ�๩����ʹ�á����ǾͿ���ʵ�ֶ��̳߳����ˡ�
 * 
 * 
 * ��ʽ1���̳�Thread�ࡣ
 * 		1.�̳�Thread��
 * 		2.��дrun()������run()�ķ�����ָ������Ҫִ�еĴ���
 * 		3.��������:MyThread my = new MyThread();
 * 		4.�����߳�:my.run();
 * 
 * 
 * run()��start()������?
 * 		run():ֻ��ֱ�ӵ��ã�����ͨ����������run()�ǵ��̵߳ġ�
 * 		start():�������̣߳�����jvmȥ����run()������start()�Ƕ��̵߳�
 * 
 * 
 * IllegalThreadStateException���Ƿ����߳�״̬�쳣
 */
public class MyThreadDemo {
	public static void main(String[] args) {
		MyThread my1 = new MyThread();
		MyThread my2 = new MyThread();
		
		my1.start();
		
		//����IllegalThreadStateException
		//���൱����my1�̱߳����������Σ����������������߳�
		//my1.start();
		my2.start();
	}
}

