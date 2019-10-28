package IO_07;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 * ���л������Ѷ������ķ�ʽд���ı��ļ����������д��䡣���� -- ������(ObjectOutputStream)
 * �����л��������ı��ļ��е����������ݻ��������е����������ݻ�ԭ�ɶ���������  -- ����(ObjectInputStream)
 */
public class ObjectStreamDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//���Զ���һ���ࣺ�����е�Person��
		//write();

		read();
	}

	private static void write() throws IOException {
		//�������л�������
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("oos.txt"));

		//��������
		Person p = new Person("����ϼ", 27);

		//public final void writeObject(Object obj)
		oos.writeObject(p);

		//�ͷ���Դ
		oos.close();
	}

	private static void read() throws IOException, ClassNotFoundException {
		//���������л�����
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("oos.txt"));

		//��ԭ����
		Object obj = ois.readObject();

		//�ͷ���Դ
		ois.close();

		//�������
		System.out.println(obj);
	}

}
