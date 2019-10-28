package IO_01;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 * �ֽ�������������裺
 * 	1.�����ֽ����������
 * 	2.����write()����
 * 	3.�ͷ���Դ
 * 
 * public void write(int b)��дһ���ֽ�
 * public void write(byte[] b)��дһ���ֽ�����
 * public void write(byte[] b, int off, int len)��дһ���ֽ������һ����
 * д��������ǰ�ASCII��д���
 */

public class FileOutputStreamDemo2 {
	public static void main(String[] args) throws IOException {
		
		// �����ֽ����������
		// OutputStream os = new FileOutputStream("fos2.txt"); // ��̬�����ã�д���棩
		FileOutputStream fos = new FileOutputStream("fos2.txt");

		//public void write(int b)��дһ���ֽ�
		//fos.write(97); 	//�ļ�����ʾ'a'��97--�ײ����������--ͨ�����±���--��97��Ӧ���ַ�ֵ--a
		//fos.write(57);	//�ļ�����ʾ'9'
		//fos.write(55);	//�ļ�����ʾ'7'
		
		//public void write(byte[] b)��дһ���ֽ�����
		byte[] bys = {97, 98, 99, 100, 101};	//abcde
		fos.write(bys);
		
		//public void write(byte[] b,int off,int len)��дһ���ֽ������һ����
		fos.write(bys, 1, 3);	//������Ϊ1���ֽڿ�ʼд��д3������2λ~��4λ��
		
		//�ͷ���Դ
		fos.close();
	}
}
