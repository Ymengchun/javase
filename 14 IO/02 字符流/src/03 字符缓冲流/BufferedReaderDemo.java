package IO_05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * BufferedReader
 * 	1.���ַ��������ж�ȡ�ı������û�����������Ч
 *  	2.����ʹ��Ĭ�ϴ�С��Ҳ����ָ����������С�����������£�Ĭ�ϻ�������С�� 
 * 
 * BufferedReader(Reader in)
 */

public class BufferedReaderDemo {
	public static void main(String[] args) throws IOException {
		//�����ַ���������������
		BufferedReader br = new BufferedReader(new FileReader("bw.txt"));

		//��ʽһ
		//int ch = 0;
		//while ((ch = br.read()) != -1) {
		//	System.out.print((char) ch);
		//}

		//��ʽ��
		char[] chs = new char[1024];
		int len = 0;
		while ((len = br.read(chs)) != -1) {
			System.out.print(new String(chs, 0, len));
		}

		//�ͷ���Դ
		br.close();
	}
}
