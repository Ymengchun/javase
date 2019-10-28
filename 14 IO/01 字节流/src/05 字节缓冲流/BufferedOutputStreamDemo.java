package IO_05;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 
 * ��������(��Ч��)
 * �ֽڻ����������BufferedOutputStream
 * �ֽڻ�����������BufferedInputStream
 * 
 * ��������Ĺ��췽��������ָ����������С����ͨ��Ĭ�ϻ�������С��
 * 
 * Ϊʲô������һ��������ļ������ļ�·�������Ǵ���һ��OutputStream������?
 * ԭ���ֽڻ������������ṩ�������������Ķ�д�������ǿ�������ʵ�֡�
 */
public class BufferedOutputStreamDemo {
	public static void main(String[] args) throws IOException {
		
		BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream("bos.txt"));

		//д����
		bos.write("hello".getBytes());

		//�ͷ���Դ
		bos.close();
	}
}
