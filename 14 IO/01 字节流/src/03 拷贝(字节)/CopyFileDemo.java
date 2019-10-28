package IO_03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ���󣺸����ı��ļ���
 * 
 * ����Դ���������
 * 	a.txt--������--FileInputStream	
 * Ŀ�ĵأ�д������
 * 	FileOutputStream--д����--b.txt
 * 
 * java.io.FileNotFoundException: a.txt (ϵͳ�Ҳ���ָ���ļ�)
 * 
 * ��һ�θ�������û�г����κ����⣬Ϊʲô��?
 * ��һ�����ǳ��������ԭ����������ÿ�λ�ȡ��һ���ֽ����ݣ�����Ϊ�İѸ��ֽ�����ת��Ϊ���ַ����ݣ�Ȼ�����������̨��
 * ��һ�ζ�ȡһ���ֽڣ���д��һ���ֽڣ�û���κ���Ϊת���������Զ�ת��
 * �����Լ���ת����
 */

public class CopyFileDemo {
	public static void main(String[] args) throws IOException {
		//��װ����Դ
		FileInputStream fis = new FileInputStream("a.txt");
		//��װĿ�ĵ�
		FileOutputStream fos = new FileOutputStream("b.txt");

		int by = 0;
		while ((by = fis.read()) != -1) {	//ѭ����ȡ��ÿ�ζ�һ���ֽ�
			fos.write(by);			//д���ļ���ÿ��дһ���ֽ�
		}

		//�ͷ���Դ(�ȹ�˭���У������ù�)
		fos.close();
		fis.close();
	}
}
