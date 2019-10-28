package IO_02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
 * ���󣺴��ı��ļ��ж�ȡ����(ÿ��Ϊһ���ַ���)�������У�����������
 * 
 * ����
 * 	1.����Դ��һ���ı��ļ�����ʹ���ַ���
 * 	2.Ŀ�ĵ���һ������
 * 	3.Ԫ�����ַ���
 * 
 * ����Դ��
 * 	b.txt -- FileReader -- BufferedReader
 * Ŀ�ĵأ�
 * 	ArrayList<String>
 */

public class FileToArrayListDemo {
	public static void main(String[] args) throws IOException {
		//��װ����Դ
		BufferedReader br = new BufferedReader(new FileReader("b.txt"));
		//��װĿ�ĵ�(�������϶���)
		ArrayList<String> array = new ArrayList<String>();

		//��ȡ���ݴ洢��������
		String line = null;
		while ((line = br.readLine()) != null) {
			array.add(line);
		}

		//�ͷ���Դ
		br.close();

		//��������
		for (String s : array) {
			System.out.println(s);
		}
	}
}
