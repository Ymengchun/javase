package IO_01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 有异常处理的字节输出流操作
 */

public class FileOutputStreamDemo4 {
	public static void main(String[] args) {
	
		//为了在finally里面能够看到文件输出流对象，就必须在异常处理之前创建该对象；为了访问不出问题，还必须将其初始化为null
		FileOutputStream fos = null;
		try {
			// fos = new FileOutputStream("z:\\fos4.txt");
			fos = new FileOutputStream("fos4.txt");
			fos.write("java".getBytes());
		} catch (FileNotFoundException e) {	//FileNotFoundException是IOException的子异常，放在IOException前面
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//如果fos不是null，才需要close()
			if (fos != null) {
				//为了保证close()一定会执行，就放到这里了
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
