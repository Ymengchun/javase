package recurrence_03;

import java.io.File;

/*
 * 需求：递归删除带内容的目录
 * 
 * 目录我已经给定：demo
 * 
 * 分析：
 * 		1.封装目录
 * 		2.获取该目录下的所有文件或者文件夹的File数组
 * 		3.遍历该File数组，得到每一个File对象
 * 		4.判断该File对象是否是文件夹
 * 			是：回到2
 * 			否：就删除
 */
public class FileDeleteDemo {
	public static void main(String[] args) {
		// 封装目录
		File srcFolder = new File("demo");
		
		// 递归实现
		deleteFolder(srcFolder);
	}

	private static void deleteFolder(File srcFolder) {
		// 获取该目录下的所有文件或者文件夹的File数组
		File[] fileArray = srcFolder.listFiles();

		if (fileArray != null) {	//保证不会出现空指针异常（不会删除系统保护文件）
			// 遍历该File数组，得到每一个File对象
			for (File file : fileArray) {
				// 判断该File对象是否是文件夹
				if (file.isFile()) {	//递归出口：是文件，输出文件名，直接删除
					System.out.println(file.getName() + "---" + file.delete());
				}
				else {
					deleteFolder(file);	//调用自己
				}
			}	//for循环结束，所有文件夹中的文件都被删除了，现在的文件夹都是空文件夹
			
			System.out.println(srcFolder.getName() + "---" + srcFolder.delete());	//删除所有空文件夹
		}
	}
}
