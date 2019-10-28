package recurrence_02;

/*
 * ��һ�����ӣ��ӳ������3������ÿ���¶���һ�����ӣ�С���ӳ����������º�ÿ��������һ�����ӣ��������Ӷ��������ʵڶ�ʮ���µ����Ӷ���Ϊ���٣�
 * ����������Ҫ��취�ҹ���
 * 			���Ӷ���
 * ��һ���£� 	1
 * �ڶ����£�	1
 * �������£�	2
 * ���ĸ��£�	3	
 * ������£�	5
 * �������£�	8
 * ...
 * 
 * �ɴ˿ɼ����Ӷ���������ǣ�쳲���������
 * 		1,1,2,3,5,8...
 * ����
 * 		A���ӵ����ʼ��ÿһ����ǰ����֮��
 * 		B������˵��ǰ��������֪��
 * 
 * ���ʵ�����������?
 * 		A������ʵ��
 * 		B�������ı仯ʵ��
 * 		C���ݹ�ʵ��
 * 
 */
public class RecurrenceDemo2 {
	public static void main(String[] args) {
		
		//����һ������ʵ��
		int[] arr = new int[20];
		arr[0] = 1;
		arr[1] = 1;
		for (int x = 2; x < arr.length; x++) {
			arr[x] = arr[x - 2] + arr[x - 1];
		}
		System.out.println(arr[19]);// 6765
		System.out.println("----------------");

		//������������ʵ��
		int a = 1;
		int b = 1;
		for (int x = 0; x < 18; x++) {
			// ��ʱ�����洢��һ�ε�a
			int temp = a;
			a = b;
			b = temp + b;
		}
		System.out.println(b);
		System.out.println("----------------");

		//���������ݹ�ʵ��
		System.out.println(fib(20));
	}

		
	public static int fib(int n) {
		if (n == 1 || n == 2) {
			return 1;
		} else {
			return fib(n - 1) + fib(n - 2);
		}
	}
}