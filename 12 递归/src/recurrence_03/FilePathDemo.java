package recurrence_03;

import java.io.File;

/*
 * ���󣺰�E:\JavaSEĿ¼�����е�.java�ļ��ľ���·��������ڿ���̨��
 * 
 * ������
 * 		1.��װĿ¼
 * 		2.��ȡ��Ŀ¼�����е��ļ������ļ��е�File����
 * 		3.������File���飬�õ�ÿһ��File����
 * 		4.�жϸ�File�����Ƿ����ļ���
 * 			�ǣ����ص�2��
 * 			���Ƿ���.java��β
 * 				�ǣ���������ļ��ľ���·��
 * 				�񣺲�������
 */

public class FilePathDemo {
	public static void main(String[] args) {
		// ��װĿ¼
		File srcFolder = new File("E:\\JavaSE");

		// �ݹ鹦��ʵ��
		getAllJavaFilePaths(srcFolder);
	}

	private static void getAllJavaFilePaths(File srcFolder) {
		// ��ȡ��Ŀ¼�����е��ļ������ļ��е�File����
		File[] fileArray = srcFolder.listFiles();

		// ������File���飬�õ�ÿһ��File����
		for (File file : fileArray) {
			// �жϸ�File�����Ƿ����ļ���
			if (file.isDirectory()) {
				getAllJavaFilePaths(file);
			} else {
				// �����ж��Ƿ���.java��β
				if (file.getName().endsWith(".java")) {
					// ��������ļ��ľ���·��
					System.out.println(file.getAbsolutePath());
				}
			}
		}
	}
}
