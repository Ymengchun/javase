package IO_09;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

/*
 * BufferedReader
 * 		|--LineNumberReader
 * 			public int getLineNumber()����õ�ǰ�к�
 * 			public void setLineNumber(int lineNumber)������һ���к�����Ϊn+1
 */

public class LineNumberReaderDemo {
	public static void main(String[] args) throws IOException {
		LineNumberReader lnr = new LineNumberReader(new FileReader("my.txt"));

		String line = null;
		while ((line = lnr.readLine()) != null) {
			System.out.println(lnr.getLineNumber() + ":" + line);
		}

		lnr.close();
	}
}