package IO_02;

import java.io.FileInputStream;
import java.io.IOException;

/*
 * һ�ζ�ȡһ���ֽ����飺int read(byte[] b)
 * ����ֵ��ʵ�ʶ�ȡ���ֽڸ�����
 */

public class FileInputStreamDemo2 {
	public static void main(String[] args) throws IOException {
		
		//����ĳ���һ����1024����1024��������
		FileInputStream fis = new FileInputStream("FileOutputStreamDemo.java");
		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = fis.read(bys)) != -1) {
			System.out.print(new String(bys, 0, len));	//���Ϊ0���ܳ���Ϊlen
		}

		//�ͷ���Դ
		fis.close();
	}
}