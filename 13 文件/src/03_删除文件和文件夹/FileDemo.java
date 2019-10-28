package File_03;

import java.io.File;
import java.io.IOException;

/*
 * ɾ�����ܣ�public boolean delete()
 * ע�⣺
 * 	1.��������ļ����ļ���ʱ����д�̷�·������Ĭ���ڵ�ǰ��Ŀ·���´�����
 * 	2.Java�е�ɾ�����߻���վ��
 * 	3.Ҫɾ��һ���ļ��У����ļ����ڲ��ܰ����ļ����ļ��С�
 */
public class FileDemo {
	public static void main(String[] args) throws IOException {
		// �����ļ�
		// File file = new File("e:\\a.txt");
		// System.out.println("createNewFile:" + file.createNewFile());

		// û��д�̷�·������Ĭ���ڵ�ǰ��Ŀ·���´���
		File file = new File("a.txt");
		System.out.println("createNewFile:" + file.createNewFile());

		
		File file2 = new File("aaa\\bbb\\ccc");
		System.out.println("mkdirs:" + file2.mkdirs());

		// ɾ���ļ���ɾ��a.txt�ļ�
		File file3 = new File("a.txt");
		System.out.println("delete:" + file3.delete());

		// ɾ���ļ��У�ɾ��ccc����ļ���
		File file4 = new File("aaa\\bbb\\ccc");
		System.out.println("delete:" + file4.delete());

		// ����Ҫɾ��aaa�ļ��У���Ҫɾbbb�ļ���
		// File file5 = new File("aaa");
		// System.out.println("delete:" + file5.delete());

		// ��ȷ��Ҫɾ��aaa�ļ��У���Ҫɾbbb�ļ���
		File file6 = new File("aaa\\bbb");
		File file7 = new File("aaa");	
		System.out.println("delete:" + file6.delete());
		System.out.println("delete:" + file7.delete());
	}
}