package IO_01;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 如何实现数据的换行?
 * 		windows:\r\n
 * 		linux:\n
 * 		Mac:\r
 * 		一些高级记事本，可以识别任意换行符号（如Notepad++）
 * 
 * 如何实现数据的追加写入?
 * 		用构造方法带第二个参数是true的情况即可
 */

public class FileOutputStreamDemo3 {
	public static void main(String[] args) throws IOException {
		//创建字节输出流对象
		//FileOutputStream fos = new FileOutputStream("fos3.txt");
		
		//创建字节输出流对象，如果第二个参数为 true，则将字节追加写入文件末尾处，而不是文件开头。
		FileOutputStream fos = new FileOutputStream("fos3.txt", true);

		//写数据
		for (int x = 0; x < 10; x++) {
			fos.write(("hello" + x).getBytes());
			fos.write("\r\n".getBytes());
		}

		//释放资源
		fos.close();
	}
}
