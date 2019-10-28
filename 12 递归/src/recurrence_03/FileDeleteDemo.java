package recurrence_03;

import java.io.File;

/*
 * ���󣺵ݹ�ɾ�������ݵ�Ŀ¼
 * 
 * Ŀ¼���Ѿ�������demo
 * 
 * ������
 * 		1.��װĿ¼
 * 		2.��ȡ��Ŀ¼�µ������ļ������ļ��е�File����
 * 		3.������File���飬�õ�ÿһ��File����
 * 		4.�жϸ�File�����Ƿ����ļ���
 * 			�ǣ��ص�2
 * 			�񣺾�ɾ��
 */
public class FileDeleteDemo {
	public static void main(String[] args) {
		// ��װĿ¼
		File srcFolder = new File("demo");
		
		// �ݹ�ʵ��
		deleteFolder(srcFolder);
	}

	private static void deleteFolder(File srcFolder) {
		// ��ȡ��Ŀ¼�µ������ļ������ļ��е�File����
		File[] fileArray = srcFolder.listFiles();

		if (fileArray != null) {	//��֤������ֿ�ָ���쳣������ɾ��ϵͳ�����ļ���
			// ������File���飬�õ�ÿһ��File����
			for (File file : fileArray) {
				// �жϸ�File�����Ƿ����ļ���
				if (file.isFile()) {	//�ݹ���ڣ����ļ�������ļ�����ֱ��ɾ��
					System.out.println(file.getName() + "---" + file.delete());
				}
				else {
					deleteFolder(file);	//�����Լ�
				}
			}	//forѭ�������������ļ����е��ļ�����ɾ���ˣ����ڵ��ļ��ж��ǿ��ļ���
			
			System.out.println(srcFolder.getName() + "---" + srcFolder.delete());	//ɾ�����п��ļ���
		}
	}
}
