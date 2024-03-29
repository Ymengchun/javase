package File_08;

import java.io.File;

/*
 * 判断E盘目录下是否有后缀名为.jpg的文件，如果有，就输出此文件名称
 * 
 * 分析：
 * 		1.封装e盘目录
 * 		2.获取该目录下所有文件或者文件夹的File数组
 * 		3.遍历该File数组，得到每一个File对象，然后判断
 * 		4.是否是文件
 * 			是：继续判断是否以.jpg结尾
 * 				是：输出该文件名称
 * 				否：不搭理它
 * 			否：不搭理它
 * 
 * endsWith()：是否以某段字符串结尾
 */

public class FileDemo {
	public static void main(String[] args) {
		// 封装e盘目录
		File file = new File("e:\\");

		// 获取该目录下所有文件或者文件夹的File数组
		File[] fileArray = file.listFiles();

		// 遍历该File数组，得到每一个File对象，然后判断
		for (File f : fileArray) {
			// 是否是文件
			if (f.isFile()) {
				// 继续判断是否以.jpg结尾
				if (f.getName().endsWith(".jpg")) {		
					// 就输出该文件名称
					System.out.println(f.getName());
				}
			}
		}
	}
}
