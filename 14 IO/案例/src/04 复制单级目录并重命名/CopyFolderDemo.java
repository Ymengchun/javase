package IO_04;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;

/*
 * 需求：复制指定目录下的指定文件，并修改后缀名。
 * 指定的文件是：.java文件。
 * 指定的后缀名是：.jad
 * 指定的目录是：jad
 * 
 * 数据源：e:\\java\\A.java
 * 目的地：e:\\jad\\A.jad
 * 
 * 分析：
 * 	1.封装目录
 * 	2.获取该目录下的java文件的File数组（获取java文件推荐使用文件过滤器）
 * 	3.遍历该File数组，得到每一个File对象
 * 	4.把该File进行复制
 * 	5.在目的地目录下改名
 */

public class CopyFolderDemo {
	public static void main(String[] args) throws IOException {
		//封装源目录
		File srcFolder = new File("e:\\java");
		//封装目标目录
		File destFolder = new File("e:\\jad");
		//如果目标目录不存在，就创建
		if (!destFolder.exists()) {
			destFolder.mkdir();
		}

		//获取该目录下的java文件的File数组
		File[] fileArray = srcFolder.listFiles(new FilenameFilter() {	//文件过滤器
			@Override
			public boolean accept(File dir, String name) {
				return new File(dir, name).isFile() && name.endsWith(".java");
			}
		});

		//遍历该File数组，得到每一个File对象
		for (File file : fileArray) {
			//数据源：e:\java\DataTypeDemo.java
			//目的地：e:\\jad\DataTypeDemo.java
			String name = file.getName();
			File newFile = new File(destFolder, name);
			copyFile(file, newFile);
		}

		
		//在目的地目录下改名
		File[] destFileArray = destFolder.listFiles();
		for (File destFile : destFileArray) {
			String name = destFile.getName(); //DataTypeDemo.java，原来的名
			String newName = name.replace(".java", ".jad");		//DataTypeDemo.jad，改后的名
			
			File newFile = new File(destFolder, newName);
			destFile.renameTo(newFile);	//重命名
		}
	}

	
	//文件复制
	private static void copyFile(File file, File newFile) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(newFile));

		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = bis.read(bys)) != -1) {
			bos.write(bys, 0, len);
		}

		bos.close();
		bis.close();
	}
}
