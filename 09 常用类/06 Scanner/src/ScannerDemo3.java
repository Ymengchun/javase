package Demo_03;

import java.util.Scanner;

/*
 * ���õ�����������
 * 		public int nextInt()����ȡһ��int���͵�ֵ
 * 		public String nextLine()����ȡһ��String���͵�ֵ
 * 
 * 
 * ע�⣺�Ȼ�ȡһ��int�ٻ�ȡһ��String����������⣺�ӿ���̨�����һ�����ݣ��س�����δ����ڶ������ݾ�ֱ��ֹͣ���룬������ֻ��ʾ���ֵ����⣡
 * ԭ���������س������Զ�ʶ��ֵ��int���������س���Ϊ\n\r��ʶ��Ϊ�ַ��������Զ���ֵ��String�����������ڿ���̨�ϲ���ʾ�������ǵĸо��ǣ�ֻ������һ����ֱ��ֹͣ������
 * �����
 * 		����1���Ȼ�ȡһ����ֵ���ٴ���һ���µļ���¼������ȡ�ַ�����
 * 		����2�������е����ݶ��Ȱ����ַ�����ȡ��Ȼ��Ҫʲô����Ͷ�Ӧ��ת��Ϊʲô���Ƽ���
 */
public class ScannerDemo3 {
	public static void main(String[] args) {
		//��������
		Scanner sc = new Scanner(System.in);

		//��ȡ����int���͵�ֵ��û������
		//int a = sc.nextInt();
		//int b = sc.nextInt();
		//System.out.println("a:" + a + ",b:" + b);
		//System.out.println("-------------------");

		//��ȡ����String���͵�ֵ��û������
		//String s1 = sc.nextLine();
		//String s2 = sc.nextLine();
		//System.out.println("s1:" + s1 + ",s2:" + s2);
		//System.out.println("-------------------");

		//�Ȼ�ȡһ���ַ������ٻ�ȡһ��intֵ��û������
		//String s1 = sc.nextLine();
		//int b = sc.nextInt();
		//System.out.println("s1:" + s1 + ",b:" + b);
		//System.out.println("-------------------");

		//�Ȼ�ȡһ��intֵ���ٻ�ȡһ���ַ�����������
		//int a = sc.nextInt();
		//String s2 = sc.nextLine();
		//System.out.println("a:" + a + ",s2:" + s2);
		//System.out.println("-------------------");

		int a = sc.nextInt();
		Scanner sc2 = new Scanner(System.in);
		String s = sc2.nextLine();
		System.out.println("a:" + a + ",s:" + s);
	}
}
