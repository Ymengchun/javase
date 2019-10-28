package IO_08;

import java.io.IOException;
import java.io.Reader;

/*
 * 要求：用Reader模拟BufferedReader的readLine()功能
 * 
 * readLine()：一次读一行，根据换行符判断是否结束，只返回内容，不返回换行符
 */

public class MyBufferedReader {
	private Reader r;

	public MyBufferedReader(Reader r) {
		this.r = r;
	}

	//写一个方法，返回一个字符串
	public String readLine() throws IOException {
		/*
		 * 由于一次读一行，不知道每一行字符串的长度，故建议用StringBuilder
		 */
		
		StringBuilder sb = new StringBuilder();

		//如何判断读取结束：返回值为-1，说明读取结束
		
		
		int ch = 0;
		while ((ch = r.read()) != -1) { //104,101,108,108,111
			if (ch == '\r') {	//回车不换行，继续读取
				continue;
			}
			if (ch == '\n') {	//回车又换行，结束读取
				return sb.toString(); //hello
			} else {
				sb.append((char)ch); //hello
			}
		}

		//为了防止数据丢失，判断sb的长度不能大于0
		if (sb.length() > 0) {
			return sb.toString();
		}

		return null;
	}

	//关闭方法
	public void close() throws IOException {
		this.r.close();
	}
}
