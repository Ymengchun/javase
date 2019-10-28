package IO_05;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ���󣺸��ƶ༶�ļ���
 * 
 * ����Դ��E:\JavaSE\day21\code\demos
 * Ŀ�ĵأ�E:\\
 * 
 * ������
 * 		1.��װ����ԴFile
 * 		2.��װĿ�ĵ�File
 * 		3.�жϸ�File���ļ��л����ļ�
 * 			a:���ļ���
 * 				����Ŀ�ĵ�Ŀ¼�´������ļ���
 * 				��ȡ��File�����µ������ļ������ļ���File����
 * 				�����õ�ÿһ��File����
 * 				�ص�3
 * 			b:���ļ�
 * 				�͸���(�ֽ���)
 */

public class CopyFoldersDemo {
	public static void main(String[] args) throws IOException {
		//��װ����ԴFile
		File srcFile = new File("E:\\JavaSE\\day21\\code\\demos");
		//��װĿ�ĵ�File
		File destFile = new File("E:\\");

		// �����ļ��еĹ���
		copyFolder(srcFile, destFile);
	}

	private static void copyFolder(File srcFile, File destFile)
			throws IOException {
		//�жϸ�File���ļ��л����ļ�
		if (srcFile.isDirectory()) {
			//�ļ���
			//��Ŀ�ĵ�Ŀ¼�´���һ��ͬ�������ļ���
			File newFolder = new File(destFile, srcFile.getName());
			newFolder.mkdir();

			//��ȡ��File�����µ������ļ������ļ���File����
			File[] fileArray = srcFile.listFiles();
			for (File file : fileArray) {
				copyFolder(file, newFolder);	//�ݹ�
			}
		} else {
			//�ļ�
			//ֱ�Ӹ���
			File newFile = new File(destFile, srcFile.getName());
			copyFile(srcFile, newFile);
		}
	}

	private static void copyFile(File srcFile, File newFile) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(newFile));

		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = bis.read(bys)) != -1) {
			bos.write(bys, 0, len);
		}

		bos.close();
		bis.close();
	}
}
