package IO_02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 * ���󣺰�ArrayList�����е��ַ����洢���ı��ļ�
 * 
 * ������
 * 	1.ArrayList�д洢�����ַ���
 * 	2.����ArrayLis�ϣ���ȡ�����ַ���
 * 	3.�洢���ı��ļ���
 * 	4.�ı��ļ�����ʹ���ַ���
 * 
 * ����Դ��
 * 	ArrayList<String> -- ������ȡ�����ַ���
 * Ŀ�ĵأ�
 * 	a.txt -- FileWriter -- BufferedWriter
 */

public class ArrayListToFileDemo {
	public static void main(String[] args) throws IOException {
		//�������϶��󣨷�װ����Դ��
		ArrayList<String> array = new ArrayList<String>();
		array.add("hello");
		array.add("world");
		array.add("java");

		//��װĿ�ĵ�
		BufferedWriter bw = new BufferedWriter(new FileWriter("a.txt"));

		//��������
		for (String s : array) {
			//д����
			bw.write(s);
			bw.newLine();
			bw.flush();
		}

		//�ͷ���Դ
		bw.close();
	}
}
