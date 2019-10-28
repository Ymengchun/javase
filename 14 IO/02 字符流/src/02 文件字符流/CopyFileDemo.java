package IO_04;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * �ļ��ַ���
 * 	FileWriter = FileOutputStream + �����
 * 
 * 	FileReader = FileInputStream + �����
 */

public class CopyFileDemo {
	public static void main(String[] args) throws IOException {
		//��װ����Դ
		FileReader fr = new FileReader("a.txt");
		//��װĿ�ĵ�
		FileWriter fw = new FileWriter("b.txt");

		//һ��һ���ַ�
		//int ch = 0;
		//while ((ch = fr.read()) != -1) {
		//	fw.write(ch);
		//	fw.flush();
		//}

		//һ��һ���ַ�����
		char[] chs = new char[1024];
		int len = 0;
		while ((len = fr.read(chs)) != -1) {
			fw.write(chs, 0, len);
			fw.flush();
		}

		//�ͷ���Դ
		fw.close();
		fr.close();
	}
}
