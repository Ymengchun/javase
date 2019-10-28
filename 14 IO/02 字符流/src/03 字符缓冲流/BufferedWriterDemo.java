package IO_05;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
 * �ַ�������
 * BufferedWriter���ַ����������
 * BufferedReader���ַ�����������
 * 
 * BufferedWriter
 * 	1.���ı�д���ַ�����������û�����������Ч
 * 	2.����ʹ��Ĭ�ϴ�С��Ҳ����ָ����������С�����������£�Ĭ�ϻ�������С�� 
 */

public class BufferedWriterDemo {
	public static void main(String[] args) throws IOException {
		//BufferedWriter(Writer out)
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("bw.txt")));	//����ת����

		BufferedWriter bw = new BufferedWriter(new FileWriter("bw.txt"));	//�����ļ��ַ���

		bw.write("hello");
		bw.write("world");
		bw.write("java");
		
		bw.flush();
		bw.close();
	}
}
