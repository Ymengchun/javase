package recurrence_02;

/*
 * �������ô���ʵ����5�Ľ׳ˡ�
 * Ԥ��֪ʶ��
 * 		5! = 1*2*3*4*5
 * 		5! = 5*4!
 * 
 * ����
 * 		����һ:ѭ��
 * 		������:�ݹ�
 * 			a���ݹ鷽��
 * 			b���ݹ����
 * 			c�����ƹ�ʽ
 */
public class RecurrenceDemo {
	public static void main(String[] args) {
		int jc = 1;
		
		//ѭ��ʵ��
		for (int x = 2; x <= 5; x++) {
			jc *= x;
		}
		System.out.println("5�Ľ׳��ǣ�" + jc);

		//�ݹ�ʵ��
		System.out.println("5�Ľ׳��ǣ�" + 	factorial(5));
	}


	public static int factorial(int n) {		//�ݹ鷽��
		if (n == 1) {	//�ݹ����
			return 1;
		} else {
			return n * factorial(n - 1);		//���ƹ�ʽ
		}
	}
}
