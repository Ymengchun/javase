package recurrence_03;

import java.io.File;

/*
 * 需求：把E:\JavaSE目录下所有的.java文件的绝对路径给输出在控制台。
 * 
 * 分析：
 * 		1.封装目录
 * 		2.获取该目录下所有的文件或者文件夹的File数组
 * 		3.遍历该File数组，得到每一个File对象
 * 		4.判断该File对象是否是文件夹
 * 			是：返回第2步
 * 			否：是否以.java结尾
 * 				是：就输出该文件的绝对路径
 * 				否：不搭理它
 */

public class FilePathDemo {
	public static void main(String[] args) {
		// 封装目录
		File srcFolder = new File("E:\\JavaSE");

		// 递归功能实现
		getAllJavaFilePaths(srcFolder);
	}

	private static void getAllJavaFilePaths(File srcFolder) {
		// 获取该目录下所有的文件或者文件夹的File数组
		File[] fileArray = srcFolder.listFiles();

		// 遍历该File数组，得到每一个File对象
		for (File file : fileArray) {
			// 判断该File对象是否是文件夹
			if (file.isDirectory()) {
				getAllJavaFilePaths(file);
			} else {
				// 继续判断是否以.java结尾
				if (file.getName().endsWith(".java")) {
					// 就输出该文件的绝对路径
					System.out.println(file.getAbsolutePath());
				}
			}
		}
	}
}
