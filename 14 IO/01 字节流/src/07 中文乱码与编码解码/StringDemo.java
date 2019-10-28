package IO_01;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/*
 * String(byte[] bytes, String charsetName)��ͨ��ָ�����ַ��������ֽ�����
 * byte[] getBytes(String charsetName)��ͨ��ָ�����ַ��������ַ������ֽ�����
 * 
 * ���룺�ѿ��ö��ı�ɿ������ģ�String -- byte[]
 * ����:�ѿ������ı�ɿ��ö��ģ�byte[] -- String
 * 
 * ���롢����������ͬһ�ַ�����������������
 */

public class StringDemo {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String s = "���";

		//String �� byte[]
		byte[] bys = s.getBytes();	//[-60, -29, -70, -61]
		//byte[] bys = s.getBytes("GBK");	//[-60, -29, -70, -61]
		//byte[] bys = s.getBytes("UTF-8");	//[-28, -67, -96, -27, -91, -67]
		System.out.println(Arrays.toString(bys));

		//byte[] �� String
		String ss = new String(bys);	//���
		//String ss = new String(bys, "GBK"); //���
		//String ss = new String(bys, "UTF-8"); //???�����벻һ�»���ֱ�������
		System.out.println(ss);
	}
	
}