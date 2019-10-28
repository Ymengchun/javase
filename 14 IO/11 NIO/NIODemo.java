package IO_09;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

/*
 * nio包：在JDK4出现，效率高，但不经常使用。
 * 原理：与传统I/O都是进行输入输出的，但是采用内存映射文件的方式，将文件映射到内存，像访问内存一样访问文件。
 * JDK7的之后的nio：
 * 	Path类：路径
 * 	Paths类：
 * 		public static Path get(URI uri)：静返回一个路径
 * 	Files类：
 * 		public static long copy(Path source,OutputStream out)：复制文件
 * 		public static Path write(Path path,Iterable<? extends CharSequence> lines, Charset cs, OpenOption... options)：OpenOption...是可变参数
public class NIODemo {
	public static void main(String[] args) throws IOException {
		// public static long copy(Path source, OutputStream out)：复制文件
		// Files.copy(Paths.get("ByteArrayStreamDemo.java"), new FileOutputStream("Copy.java"));

		ArrayList<String> array = new ArrayList<String>();
		array.add("hello");
		array.add("world");
		array.add("java");
		Files.write(Paths.get("array.txt"), array, Charset.forName("GBK"));
	}
}