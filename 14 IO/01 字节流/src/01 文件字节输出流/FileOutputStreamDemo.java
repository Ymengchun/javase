package IO_01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * IO���ķ��ࣺ
 * 		����
 * 			����������������
 * 			�������д������
 * 		�������ͣ�
 * 			�ֽ���
 * 				�ֽ���������InputStream
 * 				�ֽ��������OutputStream
 * 			�ַ���
 * 				�ַ���������Reader
 * 				�ַ��������Writer
 * 
 * 		ע�⣺̽��IO���ķ���ʱ�����û��˵�������ַ��࣬Ĭ�ϰ��������ͷ��ࡣ
 * 		      �����д��������ڳ�����˵�ģ��������ļ������롪�������ݶ������д������������д������д���ļ���
 * 
 * ���������ı��ļ�������һ�仰��"hello,IO"
 * 
 * ������
 * 		1.�����������ǲ����ַ������������ַ������ֽ���֮���ٽ��ܣ������Ƚ����ֽ�����
 * 		2.���ļ���д�루�ӳ���д���������ֽ����������OutPutStream
 * 		3.��OutPutStream�ǳ����࣬Ҫ��һ������ʵ�֡���FileOutputStream
 * 
 * ע�⣺ÿ�ֻ�������඼���Ը�������Ϊ��׺����
 * 		XxxOutputStream
 * 		XxxInputStream
 * 		XxxReader
 * 		XxxWriter
 * 
 * FileOutputStream�Ĺ��췽����
 * 		FileOutputStream(File file) 
 *		FileOutputStream(String name)
 *
 * �ֽ�������������裺
 * 		1.�����ֽ����������
 * 		2.д����
 * 		3.�ͷ���Դ
 */

public class FileOutputStreamDemo {
	public static void main(String[] args) throws IOException {
		
		// �����ֽ����������
		// ����һ��FileOutputStream(File file)
		// File file = new File("fos.txt");
		// FileOutputStream fos = new FileOutputStream(file);
		// ���������Ƽ�����FileOutputStream(String name)
		FileOutputStream fos = new FileOutputStream("fos.txt");	//ͨ��newһ�¹��췽����������
		
		/*
		 * �����ֽ����������ʱ������ʲô��
		 * 	1.����ϵͳȥ�����ļ���ϵͳ���ã�
		 * 	2.�����ֽ����������fos����
		 * 	3.��fos����ָ������ļ�
		 */
		
		//д����
		fos.write("hello,IO".getBytes());	//"hello,IO"���ַ�����write()ֻ��д�ֽڲ���д�ַ�������Ҫ��getBytes()�������ַ������ֽ����顣
	
		
		//�ͷ���Դ���ر���������ͷ�������йص�����ϵͳ��Դ��
		fos.close();
		/*
		 * ΪʲôҪclose()��?
		 * 1.��������������������GC����
		 * 2.֪ͨϵͳ�ͷ�����ļ���ص���Դ
		 */
		
	}
}
