package File_04;

import java.io.File;

/*
 * ���������ܣ�public boolean renameTo(File dest)
 * 		1.���·������ͬ�����Ǹ�����
 * 		2.���·������ͬ�����Ǹ��������С�
 * 
 * ����·����·�����̷���ʼ��c:\\a.txt
 * ���·����·�������̷���ʼa.txt��Ĭ���ڵ�ǰ�ļ�����
 */
public class FileDemo {
	public static void main(String[] args) {
		// ����һ���ļ�����
        	File file = new File("����ϼ.jpg");

        	// �����޸�����ļ�������Ϊ"��������.jpg"
        	// File newFile = new File("��������.jpg");
        	// file.renameTo(newFile));

        	file.renameTo(new File("��������.jpg"));
	}
}
