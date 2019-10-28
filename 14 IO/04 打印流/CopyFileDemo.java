package IO_03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * ����DataStreamDemo.java���Ƶ�Copy.java��
 * ����Դ��
 * 		DataStreamDemo.java -- ��ȡ���� -- FileReader -- BufferedReader
 * Ŀ�ĵأ�
 * 		Copy.java -- д������ -- FileWriter -- BufferedWriter -- PrintWriter
 */

public class CopyFileDemo {
	public static void main(String[] args) throws IOException {


		//����ǰ�ĳ���ʹ�ô�ӡ���Ľ�
		//��װ����Դ
		BufferedReader br = new BufferedReader(new FileReader("DataStreamDemo.java"));
		//��װĿ�ĵ�
		PrintWriter pw = new PrintWriter(new FileWriter("Copy.java"), true);
		
		String line = null;
		while((line=br.readLine())!=null){
			pw.println(line);
		}
		
		pw.close();
		br.close();
	}
}
