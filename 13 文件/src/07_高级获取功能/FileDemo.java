package File_07;

import java.io.File;

/*
 * �߼���ȡ���ܣ�
 * public String[] list()����ȡָ��Ŀ¼�£������ļ����ļ��е���������
 * public File[] listFiles()����ȡָ��Ŀ¼�£������ļ����ļ��е�File����
 * 
 * 1.���ֻ��ȡ�ļ�/�ļ������ƣ������ַ����������á�
 * 2.�����Ҫ��ȡ�ļ�/�ļ��еĳ��ȡ�·�������ԣ�������listFiles����Ϊ���ص����ļ����󣬿���ֱ�ӵ���File��������
 */
public class FileDemo {
	public static void main(String[] args) {
		// ָ��һ��Ŀ¼
		File file = new File("e:\\");

		// public String[] list()����ȡָ��Ŀ¼�£������ļ����ļ��е���������
		String[] strArray = file.list();
		for (String s : strArray) {
			System.out.println(s);
		}
		System.out.println("------------");

		// public File[] listFiles()����ȡָ��Ŀ¼�£������ļ����ļ��е�File����
		File[] fileArray = file.listFiles();
		for (File f : fileArray) {
			System.out.println(f.getName());
		}
	}
}
