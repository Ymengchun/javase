package File_08;

import java.io.File;

/*
 * �ж�E��Ŀ¼���Ƿ��к�׺��Ϊ.jpg���ļ�������У���������ļ�����
 * 
 * ������
 * 		1.��װe��Ŀ¼
 * 		2.��ȡ��Ŀ¼�������ļ������ļ��е�File����
 * 		3.������File���飬�õ�ÿһ��File����Ȼ���ж�
 * 		4.�Ƿ����ļ�
 * 			�ǣ������ж��Ƿ���.jpg��β
 * 				�ǣ�������ļ�����
 * 				�񣺲�������
 * 			�񣺲�������
 * 
 * endsWith()���Ƿ���ĳ���ַ�����β
 */

public class FileDemo {
	public static void main(String[] args) {
		// ��װe��Ŀ¼
		File file = new File("e:\\");

		// ��ȡ��Ŀ¼�������ļ������ļ��е�File����
		File[] fileArray = file.listFiles();

		// ������File���飬�õ�ÿһ��File����Ȼ���ж�
		for (File f : fileArray) {
			// �Ƿ����ļ�
			if (f.isFile()) {
				// �����ж��Ƿ���.jpg��β
				if (f.getName().endsWith(".jpg")) {		
					// ��������ļ�����
					System.out.println(f.getName());
				}
			}
		}
	}
}
