package File_08;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.logging.Filter;
import java.util.logging.LogRecord;

/*
 * 要求：判断E盘目录下是否有后缀名为.java的文件，如果有，就输出此文件名称
 * 	方法1：先获取所有文件，都放到数组里面，然后再遍历，依次判断，满足条件就输出。
 * 	方法2：边获取边判断，只把满足条件的文件放到数组中，然后遍历输出。
 * 
 * 要实现方法2的效果，必须使用文件名称过滤器（filter）
 * 	1.public String[] list(FilenameFilter filter)，和list()方法对应。
 * 	2.public File[] listFiles(FilenameFilter filter)，和listFiles()方法对应。
 */

public class FileDemo2 {
	public static void main(String[] args) {
		//封装e盘目录
		File file = new File("e:\\");
		
		//创建文件过滤器对象
		File[] fileArray = file.listFiles(new FilenameFilter() {	
			@Override
			public boolean accept(File dir, String name) {
				return new File(dir, name).isFile() && name.endsWith(".java");
			}
		});
		
		
		//遍历输出
		for (File f : fileArray) {
			System.out.println(f);
		}
	}
}



			
				
				
				
	