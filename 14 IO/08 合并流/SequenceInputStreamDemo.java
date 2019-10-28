package IO_06;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;

/*
 * ���󣺰�ByteArrayStreamDemo.java��DataStreamDemo.java�����ݸ��Ƶ�Copy.java��
 * 
 * SequenceInputStream(InputStream s1, InputStream s2)����s1��s2�����ݺ���������һ������Դ��s1��s2�������ֽ���
 *
 */
public class SequenceInputStreamDemo {
	public static void main(String[] args) throws IOException {
		
		//Ҫ���ַ��������ַ�����Ҫ���ֽ��������ֽ���
		InputStream s1 = new FileInputStream("ByteArrayStreamDemo.java");
		InputStream s2 = new FileInputStream("DataStreamDemo.java");
		SequenceInputStream sis = new SequenceInputStream(s1, s2);	//s1��s2������֮����Ϊ����Դ
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("Copy.java"));

		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = sis.read(bys)) != -1) {
			bos.write(bys, 0, len);
		}

		bos.close();
		sis.close();
	}
}
