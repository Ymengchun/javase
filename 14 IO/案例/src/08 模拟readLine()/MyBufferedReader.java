package IO_08;

import java.io.IOException;
import java.io.Reader;

/*
 * Ҫ����Readerģ��BufferedReader��readLine()����
 * 
 * readLine()��һ�ζ�һ�У����ݻ��з��ж��Ƿ������ֻ�������ݣ������ػ��з�
 */

public class MyBufferedReader {
	private Reader r;

	public MyBufferedReader(Reader r) {
		this.r = r;
	}

	//дһ������������һ���ַ���
	public String readLine() throws IOException {
		/*
		 * ����һ�ζ�һ�У���֪��ÿһ���ַ����ĳ��ȣ��ʽ�����StringBuilder
		 */
		
		StringBuilder sb = new StringBuilder();

		//����ж϶�ȡ����������ֵΪ-1��˵����ȡ����
		
		
		int ch = 0;
		while ((ch = r.read()) != -1) { //104,101,108,108,111
			if (ch == '\r') {	//�س������У�������ȡ
				continue;
			}
			if (ch == '\n') {	//�س��ֻ��У�������ȡ
				return sb.toString(); //hello
			} else {
				sb.append((char)ch); //hello
			}
		}

		//Ϊ�˷�ֹ���ݶ�ʧ���ж�sb�ĳ��Ȳ��ܴ���0
		if (sb.length() > 0) {
			return sb.toString();
		}

		return null;
	}

	//�رշ���
	public void close() throws IOException {
		this.r.close();
	}
}
