package IO_01;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ���ʵ�����ݵĻ���?
 * 		windows:\r\n
 * 		linux:\n
 * 		Mac:\r
 * 		һЩ�߼����±�������ʶ�����⻻�з��ţ���Notepad++��
 * 
 * ���ʵ�����ݵ�׷��д��?
 * 		�ù��췽�����ڶ���������true���������
 */

public class FileOutputStreamDemo3 {
	public static void main(String[] args) throws IOException {
		//�����ֽ����������
		//FileOutputStream fos = new FileOutputStream("fos3.txt");
		
		//�����ֽ��������������ڶ�������Ϊ true�����ֽ�׷��д���ļ�ĩβ�����������ļ���ͷ��
		FileOutputStream fos = new FileOutputStream("fos3.txt", true);

		//д����
		for (int x = 0; x < 10; x++) {
			fos.write(("hello" + x).getBytes());
			fos.write("\r\n".getBytes());
		}

		//�ͷ���Դ
		fos.close();
	}
}
