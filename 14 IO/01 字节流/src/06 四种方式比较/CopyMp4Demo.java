package IO_06;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 需求：把e:\\哥有老婆.mp4复制到当前项目目录下的copy.mp4中
 * 
 * 字节流四种方式复制文件：
 * 	1.字节流一次读写一个字节：		共耗时：117235毫秒
 * 	2.字节流一次读写一个字节数组： 		共耗时：156毫秒
 * 	3.字节缓冲流一次读写一个字节： 		共耗时：1141毫秒
 * 	4.字节缓冲流一次读写一个字节数组： 	共耗时：47毫秒
 */

public class CopyMp4Demo {
	public static void main(String[] args) throws IOException {
		long start = System.currentTimeMillis();	//程序运行前系统时间
		//method1("e:\\哥有老婆.mp4", "copy1.mp4");
		//method2("e:\\哥有老婆.mp4", "copy2.mp4");
		//method3("e:\\哥有老婆.mp4", "copy3.mp4");
		method4("e:\\哥有老婆.mp4", "copy4.mp4");
		long end = System.currentTimeMillis();		//系统运行后系统时间
		System.out.println("共耗时：" + (end - start) + "毫秒");
	}

	//字节缓冲流，一次读写一个字节数组：
	public static void method4(String srcString, String destString) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcString));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destString));

		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = bis.read(bys)) != -1) {
			bos.write(bys, 0, len);
		}

		bos.close();
		bis.close();
	}

	
	//字节缓冲流，一次读写一个字节：
	public static void method3(String srcString, String destString)
			throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcString));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destString));

		int by = 0;
		while ((by = bis.read()) != -1) {
			bos.write(by);

		}

		bos.close();
		bis.close();
	}

	
	// 基本字节流，一次读写一个字节数组
	public static void method2(String srcString, String destString) throws IOException {
		FileInputStream fis = new FileInputStream(srcString);
		FileOutputStream fos = new FileOutputStream(destString);

		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = fis.read(bys)) != -1) {
			fos.write(bys, 0, len);
		}

		fos.close();
		fis.close();
	}

	
	//基本字节流，一次读写一个字节
	public static void method1(String srcString, String destString) throws IOException {
		FileInputStream fis = new FileInputStream(srcString);
		FileOutputStream fos = new FileOutputStream(destString);

		int by = 0;
		while ((by = fis.read()) != -1) {
			fos.write(by);
		}

		fos.close();
		fis.close();
	}
}
