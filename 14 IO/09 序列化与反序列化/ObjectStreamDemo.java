package IO_07;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 * 序列化流：把对象按流的方式写入文本文件或在网络中传输。对象 -- 流数据(ObjectOutputStream)
 * 反序列化流：把文本文件中的流对象数据或者网络中的流对象数据还原成对象。流数据  -- 对象(ObjectInputStream)
 */
public class ObjectStreamDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//先自定义一个类：本包中的Person类
		//write();

		read();
	}

	private static void write() throws IOException {
		//创建序列化流对象
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("oos.txt"));

		//创建对象
		Person p = new Person("林青霞", 27);

		//public final void writeObject(Object obj)
		oos.writeObject(p);

		//释放资源
		oos.close();
	}

	private static void read() throws IOException, ClassNotFoundException {
		//创建反序列化对象
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("oos.txt"));

		//还原对象
		Object obj = ois.readObject();

		//释放资源
		ois.close();

		//输出对象
		System.out.println(obj);
	}

}
