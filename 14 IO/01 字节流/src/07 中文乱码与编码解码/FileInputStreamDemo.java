package IO_01;

import java.io.FileInputStream;
import java.io.IOException;

/*
 * �����ȡ����ʱ���ֽ������ȡ
 */

public class FileInputStreamDemo {
	public static void main(String[] args) throws IOException {
		//�����ֽ�����������
		FileInputStream fis = new FileInputStream("a.txt");

		//��ȡ����
		//���ÿ�ΰ��ֽڶ�ȡ���ģ���������루��Ϊһ������ռ�����ֽڣ�
		//int by = 0;
		//while ((by = fis.read()) != -1) {
		//	System.out.print((char)by);
		//}
		
		//�����ȡ����ʱ���ֽ������ȡ
		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = fis.read(bys)) != -1) {
			System.out.print(new String(bys, 0, len));
		}

		//�ͷ���Դ
		fis.close();
	}
}
