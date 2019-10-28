package IO_03;

import java.io.IOException;
import java.io.PrintWriter;

/*
 * ��ӡ��
 * �ֽڴ�ӡ��	PrintStream
 * �ַ���ӡ��	PrintWriter
 * 
 * ��ӡ�����ص㣺
 * 		1.ֻ��д���ݣ����ܶ����ݡ�ֻ�ܲ���Ŀ�ĵأ����ܲ�������Դ��
 * 		2.���Բ����������͵����ݡ�
 * 		3.����������Զ�ˢ�£��ܹ��Զ�ˢ�¡�
 * 		4.����ֱ�Ӳ����ı��ļ���
 * 			��Щ�������ǿ���ֱ�Ӳ����ı��ļ�����?
 * 			FileInputStream
 * 			FileOutputStream
 * 			FileReader
 * 			FileWriter
 * 			PrintStream
 * 			PrintWriter
 * 			����ֱ�Ӳ����ļ���������API����������Ĺ��췽�������Ƿ�ͬʱ��File���ͺ�String���͵Ĳ���
 * 
 * 			����
 * 				���������ܹ�ֱ�Ӷ�д�ļ�
 * 				�߼������ڻ������Ļ������ṩ����������
 */

public class PrintWriterDemo {
	public static void main(String[] args) throws IOException {
		//��ΪWriter������ʹ��
		PrintWriter pw = new PrintWriter("pw.txt");

		pw.write("hello");
		pw.write("world");
		pw.write("java");
		
		pw.close();
	}
}
