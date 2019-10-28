package IO_06;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;

/*
 * 需求：把ByteArrayStreamDemo.java和DataStreamDemo.java的内容复制到Copy.java中
 * 
 * SequenceInputStream(InputStream s1, InputStream s2)：将s1和s2的内容合起来当成一个数据源，s1和s2必须用字节流
 *
 */
public class SequenceInputStreamDemo {
	public static void main(String[] args) throws IOException {
		
		//要用字符流都用字符流，要用字节流都用字节流
		InputStream s1 = new FileInputStream("ByteArrayStreamDemo.java");
		InputStream s2 = new FileInputStream("DataStreamDemo.java");
		SequenceInputStream sis = new SequenceInputStream(s1, s2);	//s1和s2的内容之和作为数据源
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("Copy.java"));

		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = sis.read(bys)) != -1) {
			bos.write(bys, 0, len);
		}

		bos.close();
		sis.close();
	}
}
