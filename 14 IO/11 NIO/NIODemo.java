package IO_09;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

/*
 * nio������JDK4���֣�Ч�ʸߣ���������ʹ�á�
 * ԭ���봫ͳI/O���ǽ�����������ģ����ǲ����ڴ�ӳ���ļ��ķ�ʽ�����ļ�ӳ�䵽�ڴ棬������ڴ�һ�������ļ���
 * JDK7��֮���nio��
 * 	Path�ࣺ·��
 * 	Paths�ࣺ
 * 		public static Path get(URI uri)��������һ��·��
 * 	Files�ࣺ
 * 		public static long copy(Path source,OutputStream out)�������ļ�
 * 		public static Path write(Path path,Iterable<? extends CharSequence> lines, Charset cs, OpenOption... options)��OpenOption...�ǿɱ����
public class NIODemo {
	public static void main(String[] args) throws IOException {
		// public static long copy(Path source, OutputStream out)�������ļ�
		// Files.copy(Paths.get("ByteArrayStreamDemo.java"), new FileOutputStream("Copy.java"));

		ArrayList<String> array = new ArrayList<String>();
		array.add("hello");
		array.add("world");
		array.add("java");
		Files.write(Paths.get("array.txt"), array, Charset.forName("GBK"));
	}
}