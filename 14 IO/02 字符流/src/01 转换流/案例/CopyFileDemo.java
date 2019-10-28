package IO_04;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * Ҫ�󣺰ѵ�ǰĿ¼�µ�a.txt���ݸ��Ƶ���ǰĿ¼�µ�b.txt��
 * 
 * ����Դ��
 * 		a.txt -- ��ȡ���� -- �ַ�ת���� -- InputStreamReader
 * Ŀ�ĵأ�
 * 		OutputStreamWriter -- д������ -- �ַ�ת���� -- b.txt
 */

public class CopyFileDemo {
	public static void main(String[] args) throws IOException {
		//��װ����Դ
		InputStreamReader isr = new InputStreamReader(new FileInputStream("a.txt"));
		//��װĿ�ĵ�
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("b.txt"));

		//��д����
		//��ʽһ
		//int ch = 0;
		//while ((ch = isr.read()) != -1) {
		//	osw.write(ch);
		//}

		//��ʽ��
		char[] chs = new char[1024];
		int len = 0;
		while ((len = isr.read(chs)) != -1) {
			osw.write(chs, 0, len);
			osw.flush();
		}

		//�ͷ���Դ
		osw.close();
		isr.close();
	}
}
