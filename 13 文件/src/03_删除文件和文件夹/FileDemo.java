package File_03;

import java.io.File;
import java.io.IOException;

/*
 * 删除功能：public boolean delete()
 * 注意：
 * 	1.如果创建文件或文件夹时忘了写盘符路径，则默认在当前项目路径下创建。
 * 	2.Java中的删除不走回收站。
 * 	3.要删除一个文件夹，该文件夹内不能包含文件或文件夹。
 */
public class FileDemo {
	public static void main(String[] args) throws IOException {
		// 创建文件
		// File file = new File("e:\\a.txt");
		// System.out.println("createNewFile:" + file.createNewFile());

		// 没有写盘符路径，则默认在当前项目路径下创建
		File file = new File("a.txt");
		System.out.println("createNewFile:" + file.createNewFile());

		
		File file2 = new File("aaa\\bbb\\ccc");
		System.out.println("mkdirs:" + file2.mkdirs());

		// 删除文件：删除a.txt文件
		File file3 = new File("a.txt");
		System.out.println("delete:" + file3.delete());

		// 删除文件夹：删除ccc这个文件夹
		File file4 = new File("aaa\\bbb\\ccc");
		System.out.println("delete:" + file4.delete());

		// 错误，要删除aaa文件夹，先要删bbb文件夹
		// File file5 = new File("aaa");
		// System.out.println("delete:" + file5.delete());

		// 正确，要删除aaa文件夹，先要删bbb文件夹
		File file6 = new File("aaa\\bbb");
		File file7 = new File("aaa");	
		System.out.println("delete:" + file6.delete());
		System.out.println("delete:" + file7.delete());
	}
}