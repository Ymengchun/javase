package File_02;

import java.io.File;
import java.io.IOException;

/*
 *创建文件：
 *	1.public boolean createNewFile()：创建文件（返回true），文件已存在就不再创建（返回false）
 *	2.public boolean mkdir()：创建文件夹（返回true），文件夹已存在就不再创建（返回false）
 *	3.public boolean mkdirs()：创建多级文件夹，如果父文件夹不存在，会自动创建。
 *
 *注意：
 *	1.明确目的：创建文件夹还是文件
 *	2.创建文件的前提：文件所在目录存在，否则会抛出异常（createNewFile()有异常声明）。解决——先创建目录，再创建文件。
 *  	3.创建目录的前提：该目录的父目录存在，但父目录不存在不会抛出异常（mkdir()没有异常声明）。解决——先创建父目录，再创建子目录。
 *  	4.若创建多级文件夹，推荐用mkdirs()
 */
public class FileDemo {
	public static void main(String[] args) throws IOException {
		// 需求：我要在e盘目录下创建一个文件夹demo
		File file = new File("e:\\demo");
		System.out.println("mkdir:" + file.mkdir());

		// 需求：我要在e盘目录demo下创建一个文件a.txt
		File file2 = new File("e:\\demo\\a.txt");
		System.out.println("createNewFile:" + file2.createNewFile());

		// 需求：我要在e盘目录test下创建一个文件b.txt
		// Exception in thread "main" java.io.IOException: 系统找不到指定的路径。
		// 注意：要想在某个目录下创建内容，该目录首先必须存在。
		// 解决：先创建不存在的目录，然后再创建文件。
		// File file3 = new File("e:\\test\\b.txt");
		// System.out.println("createNewFile:" + file3.createNewFile());

		// 需求：我要在e盘目录test下创建aaa目录
		// File file4 = new File("e:\\test\\aaa");
		// System.out.println("mkdir:" + file4.mkdir());
		// File file5 = new File("e:\\test");
		// File file6 = new File("e:\\test\\aaa");
		// System.out.println("mkdir:" + file5.mkdir());
		// System.out.println("mkdir:" + file6.mkdir());

		
		File file7 = new File("e:\\aaa\\bbb\\ccc\\ddd");	//mkdirs()更适合创建多级文件夹
		System.out.println("mkdirs:" + file7.mkdirs());


		File file8 = new File("e:\\liuyi\\a.txt");		//创建的a.txt是一个文件夹，a.txt是文件名，因为mkdirs()只能创建文件夹
		System.out.println("mkdirs:" + file8.mkdirs());
	}
}
