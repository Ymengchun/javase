package IO_06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * ���󣺰ѵ�ǰ��ĿĿ¼�µ�a.txt���ݸ��Ƶ���ǰ��ĿĿ¼�µ�b.txt��
 * ʹ��ReadLine()
 * 
 * ����Դ��
 * 		a.txt -- ��ȡ���� -- �ַ�ת���� -- InputStreamReader -- FileReader -- BufferedReader
 * Ŀ�ĵأ�
 * 		b.txt -- д������ -- �ַ�ת���� -- OutputStreamWriter -- FileWriter -- BufferedWriter
 */
public class CopyFileDemo2 {
	public static void main(String[] args) throws IOException {
		//��װ����Դ
		BufferedReader br = new BufferedReader(new FileReader("a.txt"));
		//��װĿ�ĵ�
		BufferedWriter bw = new BufferedWriter(new FileWriter("b.txt"));

		//��д����
		String line = null;
		while ((line = br.readLine()) != null) {
			bw.write(line);	//дһ������
			bw.newLine();	//дһ�����з�
			bw.flush();
		}

		//�ͷ���Դ
		bw.close();
		br.close();
	}
}
