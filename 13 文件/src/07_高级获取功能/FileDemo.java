package File_07;

import java.io.File;

/*
 * 高级获取功能：
 * public String[] list()：获取指定目录下，所有文件或文件夹的名称数组
 * public File[] listFiles()：获取指定目录下，所有文件或文件夹的File数组
 * 
 * 1.如果只获取文件/文件夹名称，则两种方法都可以用。
 * 2.如果还要获取文件/文件夹的长度、路径等属性，建议用listFiles（因为返回的是文件对象，可以直接调用File方法）。
 */
public class FileDemo {
	public static void main(String[] args) {
		// 指定一个目录
		File file = new File("e:\\");

		// public String[] list()：获取指定目录下，所有文件或文件夹的名称数组
		String[] strArray = file.list();
		for (String s : strArray) {
			System.out.println(s);
		}
		System.out.println("------------");

		// public File[] listFiles()：获取指定目录下，所有文件或文件夹的File数组
		File[] fileArray = file.listFiles();
		for (File f : fileArray) {
			System.out.println(f.getName());
		}
	}
}
