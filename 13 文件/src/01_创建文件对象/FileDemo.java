package File_01;

import java.io.File;

/*
 * 
 * File类：用于对文件进行操作。
 * 构造方法：
 * 		File(String pathname)：根据一个路径得到File对象
 * 		File(String parent, String child)：根据一个目录和一个子文件/目录得到File对象
 * 		File(File parent, String child)：根据一个父File对象和一个子文件/目录得到File对象
 * 注意：以上三种方法只创建了文件对象（路径名），并没有创建文件
 */
public class FileDemo {
	public static void main(String[] args) {
		// File(String pathname)：根据一个路径得到File对象
		// 把 e:\\demo\\a.txt 封装成一个File对象
		File file = new File("E:\\demo\\a.txt");

		// File(String parent, String child)：根据一个目录和一个子文件/目录得到File对象
		File file2 = new File("E:\\demo", "a.txt");

		// File(File parent, String child)：根据一个父File对象和一个子文件/目录得到File对象
		File file3 = new File("e:\\demo");
		File file4 = new File(file3, "a.txt");

		// 以上三种方式其实效果一样
	}
}
