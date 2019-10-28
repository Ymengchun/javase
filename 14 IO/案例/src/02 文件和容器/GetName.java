package IO_02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/*
 * �����ı��ļ��д洢�˼���������һ��һ�����������ȡһ���˵����֡�
 * 
 * ������
 * 	1.���ı��ļ��е����ݴ洢��������
 * 	2.�������һ������
 * 	3.����������ȡ��Ӧ��ֵ
 */

public class GetName {
	public static void main(String[] args) throws IOException {
		//���ı��ļ��е����ݴ洢��������
		BufferedReader br = new BufferedReader(new FileReader("b.txt"));
		ArrayList<String> array = new ArrayList<String>();
		String line = null;
		while ((line = br.readLine()) != null) {
			array.add(line);
		}
		br.close();

		//�������һ������
		Random r = new Random();	//�������
		int index = r.nextInt(array.size());	//����0~array.size()�������

		//���ݸ�������ȡһ��ֵ
		String name = array.get(index);
		System.out.println("���������ǣ�" + name);
	}
}