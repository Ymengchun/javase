package File_08;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.logging.Filter;
import java.util.logging.LogRecord;

/*
 * Ҫ���ж�E��Ŀ¼���Ƿ��к�׺��Ϊ.java���ļ�������У���������ļ�����
 * 	����1���Ȼ�ȡ�����ļ������ŵ��������棬Ȼ���ٱ����������жϣ����������������
 * 	����2���߻�ȡ���жϣ�ֻ�������������ļ��ŵ������У�Ȼ����������
 * 
 * Ҫʵ�ַ���2��Ч��������ʹ���ļ����ƹ�������filter��
 * 	1.public String[] list(FilenameFilter filter)����list()������Ӧ��
 * 	2.public File[] listFiles(FilenameFilter filter)����listFiles()������Ӧ��
 */

public class FileDemo2 {
	public static void main(String[] args) {
		//��װe��Ŀ¼
		File file = new File("e:\\");
		
		//�����ļ�����������
		File[] fileArray = file.listFiles(new FilenameFilter() {	
			@Override
			public boolean accept(File dir, String name) {
				return new File(dir, name).isFile() && name.endsWith(".java");
			}
		});
		
		
		//�������
		for (File f : fileArray) {
			System.out.println(f);
		}
	}
}



			
				
				
				
	