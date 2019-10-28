package File_04;

import java.io.File;

/*
 * 重命名功能：public boolean renameTo(File dest)
 * 		1.如果路径名相同，就是改名。
 * 		2.如果路径名不同，就是改名并剪切。
 * 
 * 绝对路径：路径以盘符开始，c:\\a.txt
 * 相对路径：路径不以盘符开始a.txt，默认在当前文件夹下
 */
public class FileDemo {
	public static void main(String[] args) {
		// 创建一个文件对象
        	File file = new File("林青霞.jpg");

        	// 需求：修改这个文件的名称为"东方不败.jpg"
        	// File newFile = new File("东方不败.jpg");
        	// file.renameTo(newFile));

        	file.renameTo(new File("东方不败.jpg"));
	}
}
