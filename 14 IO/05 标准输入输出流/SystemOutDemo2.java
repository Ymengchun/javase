package IO_04;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
/*
 * 标准输出流
 */
public class SystemOutDemo2 {
	public static void main(String[] args) throws IOException {
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		bw.write("hello");
		bw.newLine();
		//bw.flush();
		bw.write("world");
		bw.newLine();
		//bw.flush();
		bw.write("java");
		bw.newLine();
		bw.flush();
		bw.close();
	}
}
