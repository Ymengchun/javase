package cn.itcast.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/*
 * ���÷����򼯺����������
 */
public class ArrayListDemo {
	public static void main(String[] args) throws Exception {
		// �������϶���
		ArrayList<String> array = new ArrayList<Integer>();

		// array.add("hello");
		// array.add("world");
		// array.add("java");

		Class c = array.getClass(); // ����ArrayList��class�ļ�����
		Method m = c.getMethod("add", Object.class);	// add()������������Object

		m.invoke(array, "hello"); // ����array��add�����������ֵ��hello
		m.invoke(array, "world");
		m.invoke(array, "java");

		System.out.println(array);
	}
}
