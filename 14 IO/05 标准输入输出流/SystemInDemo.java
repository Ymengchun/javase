package IO_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * System.in ��׼���������Ӽ��̻�ȡ����
 * 
 * �����������ݵķ�����
 * 		1.main������args���ղ�����
 * 			java HelloWorld hello world java
 * 		2.Scanner(JDK5�Ժ��)
 * 			Scanner sc = new Scanner(System.in);
 * 			String s = sc.nextLine();
 * 			int x = sc.nextInt()
 * 		3.ͨ���ַ���������װ��׼������ʵ��
 * 			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 */
public class SystemInDemo {
	public static void main(String[] args) throws IOException {
		
		//BufferedReader���ַ���������ֻ�ܰ�װ�ַ�������System.in��ȡ�����ֽ�������Ӧ����ת����InputStreamReader���ֽ���ת��Ϊ�ַ���
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("������һ���ַ�����");
		String line = br.readLine();	//readLine��һ�ζ�ȡһ��
		System.out.println("��������ַ����ǣ�" + line);

		System.out.println("������һ��������");
		//readLine�ǰ��ַ�����ȡ������ת��Ϊ������
		int i = Integer.parseInt(br.readLine());
		System.out.println("������������ǣ�" + i);
	}
}
