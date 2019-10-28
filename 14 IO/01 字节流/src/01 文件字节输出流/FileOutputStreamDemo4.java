package IO_01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ���쳣������ֽ����������
 */

public class FileOutputStreamDemo4 {
	public static void main(String[] args) {
	
		//Ϊ����finally�����ܹ������ļ���������󣬾ͱ������쳣����֮ǰ�����ö���Ϊ�˷��ʲ������⣬�����뽫���ʼ��Ϊnull
		FileOutputStream fos = null;
		try {
			// fos = new FileOutputStream("z:\\fos4.txt");
			fos = new FileOutputStream("fos4.txt");
			fos.write("java".getBytes());
		} catch (FileNotFoundException e) {	//FileNotFoundException��IOException�����쳣������IOExceptionǰ��
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//���fos����null������Ҫclose()
			if (fos != null) {
				//Ϊ�˱�֤close()һ����ִ�У��ͷŵ�������
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
