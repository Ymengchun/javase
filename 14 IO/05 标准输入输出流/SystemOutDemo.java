package IO_04;

import java.io.PrintStream;

/*
 * ��׼���������
 * System���������Ա������
 *		public static final InputStream in ����׼����������
 * 		public static final PrintStream out ����׼���������
 * 
 * 		InputStream is = System.in;
 * 		PrintStream ps = System.out;
 */
public class SystemOutDemo {
	public static void main(String[] args) {
		System.out.println("helloworld");

		//��ȡ��׼���������
		PrintStream ps = System.out;
		ps.println("helloworld");
		
		ps.println();
		//ps.print();//�������������
		
		//System.out.println();
		//System.out.print();
	}
}
