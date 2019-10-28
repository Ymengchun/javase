package IO_02;

import java.io.FileInputStream;
import java.io.IOException;

/*
 * �ֽ��������������裺
 * 	1.�����ֽ�����������
 * 	2.����read()������ȡ���ݣ�����������ʾ�ڿ���̨
 * 	3.�ͷ���Դ
 * 
 * ��ȡ���ݵķ�ʽ��
 * 	1.int read()��һ�ζ�һ���ֽ�
 * 	2.int read(byte[] b)��һ�ζ�һ���ֽ�����
 */
public class FileInputStreamDemo {
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("FileOutputStreamDemo.java");
		int by = 0;
		//��ȡ����ֵ���ж�
		while ((by = fis.read()) != -1) {
			System.out.print((char)by);
		}

		//�ͷ���Դ
		fis.close();
	}
}
