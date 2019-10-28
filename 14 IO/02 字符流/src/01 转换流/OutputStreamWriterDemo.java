package IO_02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
 * ת���������ֽ���ת��Ϊ�ַ������ַ��� = �ֽ��� + �����
 * OutputStreamWriter(OutputStream out)������Ĭ�ϱ��룬���ֽ���ת��Ϊ�ַ���
 * OutputStreamWriter(OutputStream out, String charsetName)������ָ��������ֽ���ת��Ϊ�ַ���
 * 
 */
public class OutputStreamWriterDemo {
	public static void main(String[] args) throws IOException {
		//��������
		//OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("osw.txt")); //Ĭ��GBK
		//OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("osw.txt"), "GBK"); //ָ��GBK
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("osw.txt"), "UTF-8");  //ָ��UTF-8
		
		//д����
		osw.write("�й�");

		//�ͷ���Դ
		osw.close();
	}
}
