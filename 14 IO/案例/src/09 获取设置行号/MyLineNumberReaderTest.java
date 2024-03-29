package IO_09;

import java.io.FileReader;
import java.io.IOException;

public class MyLineNumberReaderTest {
	public static void main(String[] args) throws IOException {
		// MyLineNumberReader mlnr = new MyLineNumberReader(new FileReader("my.txt"));

		MyLineNumberReader2 mlnr = new MyLineNumberReader2(new FileReader("my.txt"));

		String line = null;
		while ((line = mlnr.readLine()) != null) {
			System.out.println(mlnr.getLineNumber() + ":" + line);
		}

		mlnr.close();
	}
}
