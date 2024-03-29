package IO_02;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/*
 * 内存操作流：处理临时数据，程序结束，数据就从内存中消失。
 * 字节数组：
 * 		ByteArrayInputStream
 * 		ByteArrayOutputStream
 * 字符数组：
 * 		CharArrayReader
 * 		CharArrayWriter
 * 字符串：
 * 		StringReader
 * 		StringWriter
 */

public class ByteArrayStreamDemo {
	public static void main(String[] args) throws IOException {
		//写数据
		ByteArrayOutputStream baos = new ByteArrayOutputStream();

		//写数据
		for (int x = 0; x < 10; x++) {
			baos.write(("hello" + x).getBytes());
		}

		//不需要释放资源
		//通过查看源码我们知道这里什么都没做，所以根本不需要close()
		//baos.close();

		//public byte[] toByteArray()
		byte[] bys = baos.toByteArray();

		//读数据
		//ByteArrayInputStream(byte[] buf)
		ByteArrayInputStream bais = new ByteArrayInputStream(bys);

		int by = 0;
		while ((by = bais.read()) != -1) {
			System.out.print((char) by);
		}

	}
}
