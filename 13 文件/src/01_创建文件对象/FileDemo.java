package File_01;

import java.io.File;

/*
 * 
 * File�ࣺ���ڶ��ļ����в�����
 * ���췽����
 * 		File(String pathname)������һ��·���õ�File����
 * 		File(String parent, String child)������һ��Ŀ¼��һ�����ļ�/Ŀ¼�õ�File����
 * 		File(File parent, String child)������һ����File�����һ�����ļ�/Ŀ¼�õ�File����
 * ע�⣺�������ַ���ֻ�������ļ�����·����������û�д����ļ�
 */
public class FileDemo {
	public static void main(String[] args) {
		// File(String pathname)������һ��·���õ�File����
		// �� e:\\demo\\a.txt ��װ��һ��File����
		File file = new File("E:\\demo\\a.txt");

		// File(String parent, String child)������һ��Ŀ¼��һ�����ļ�/Ŀ¼�õ�File����
		File file2 = new File("E:\\demo", "a.txt");

		// File(File parent, String child)������һ����File�����һ�����ļ�/Ŀ¼�õ�File����
		File file3 = new File("e:\\demo");
		File file4 = new File(file3, "a.txt");

		// �������ַ�ʽ��ʵЧ��һ��
	}
}
