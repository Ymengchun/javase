package IO_04;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;

/*
 * ���󣺸���ָ��Ŀ¼�µ�ָ���ļ������޸ĺ�׺����
 * ָ�����ļ��ǣ�.java�ļ���
 * ָ���ĺ�׺���ǣ�.jad
 * ָ����Ŀ¼�ǣ�jad
 * 
 * ����Դ��e:\\java\\A.java
 * Ŀ�ĵأ�e:\\jad\\A.jad
 * 
 * ������
 * 	1.��װĿ¼
 * 	2.��ȡ��Ŀ¼�µ�java�ļ���File���飨��ȡjava�ļ��Ƽ�ʹ���ļ���������
 * 	3.������File���飬�õ�ÿһ��File����
 * 	4.�Ѹ�File���и���
 * 	5.��Ŀ�ĵ�Ŀ¼�¸���
 */

public class CopyFolderDemo {
	public static void main(String[] args) throws IOException {
		//��װԴĿ¼
		File srcFolder = new File("e:\\java");
		//��װĿ��Ŀ¼
		File destFolder = new File("e:\\jad");
		//���Ŀ��Ŀ¼�����ڣ��ʹ���
		if (!destFolder.exists()) {
			destFolder.mkdir();
		}

		//��ȡ��Ŀ¼�µ�java�ļ���File����
		File[] fileArray = srcFolder.listFiles(new FilenameFilter() {	//�ļ�������
			@Override
			public boolean accept(File dir, String name) {
				return new File(dir, name).isFile() && name.endsWith(".java");
			}
		});

		//������File���飬�õ�ÿһ��File����
		for (File file : fileArray) {
			//����Դ��e:\java\DataTypeDemo.java
			//Ŀ�ĵأ�e:\\jad\DataTypeDemo.java
			String name = file.getName();
			File newFile = new File(destFolder, name);
			copyFile(file, newFile);
		}

		
		//��Ŀ�ĵ�Ŀ¼�¸���
		File[] destFileArray = destFolder.listFiles();
		for (File destFile : destFileArray) {
			String name = destFile.getName(); //DataTypeDemo.java��ԭ������
			String newName = name.replace(".java", ".jad");		//DataTypeDemo.jad���ĺ����
			
			File newFile = new File(destFolder, newName);
			destFile.renameTo(newFile);	//������
		}
	}

	
	//�ļ�����
	private static void copyFile(File file, File newFile) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
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
