package IO_03;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * InputStreamReader�ķ���
 * 	1.int read()��һ�ζ�ȡһ���ַ�
 * 	2.int read(char[] chs)��һ�ζ�ȡһ���ַ�����
 */

public class InputStreamReaderDemo2 {
	public static void main(String[] args) throws IOException {
		//��������
		InputStreamReader isr = new InputStreamReader(new FileInputStream("StringDemo.java"));

		//һ�ζ�ȡһ���ַ�
		//int ch = 0;
		//while ((ch = isr.read()) != -1) {
		//	System.out.print((char) ch);
		//}

		//һ�ζ�ȡһ���ַ�����
		char[] chs = new char[1024];
		int len = 0;
		while ((len = isr.read(chs)) != -1) {
			System.out.print(new String(chs, 0, len));
		}

		//�ͷ���Դ
		isr.close();
	}
}
