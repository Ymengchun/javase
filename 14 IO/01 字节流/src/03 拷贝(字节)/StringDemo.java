package IO_03;

import java.util.Arrays;

/*
 * ����������֪��ʲôʱ��ð������ֽ�ת��Ϊһ��������?
 * ���ĵĴ洢�������ֽڣ�
 * 		��һ���ֽڣ�������
 * 		�ڶ����ֽڣ��������Ǹ���������������������ûӰ�졣
 * 
 * ���ۣ�����Ǹ������Ͱ������ֽ�ת��Ϊһ�����ģ�����������Ͳ��ܡ�
 */

public class StringDemo {
	public static void main(String[] args) {
		//String s = "abcde";
		//���[97, 98, 99, 100, 101]

		String s = "�Ұ����й�";
		//���[-50, -46, -80, -82, -60, -29, -42, -48, -71, -6]

		byte[] bys = s.getBytes();
		System.out.println(Arrays.toString(bys));	//toString()����һ���߼�ֵת��Ϊ�ַ���
	}
}