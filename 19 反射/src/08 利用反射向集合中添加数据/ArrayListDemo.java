package cn.itcast.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/*
 * 利用反射向集合中添加数据
 */
public class ArrayListDemo {
	public static void main(String[] args) throws Exception {
		// 创建集合对象
		ArrayList<String> array = new ArrayList<Integer>();

		// array.add("hello");
		// array.add("world");
		// array.add("java");

		Class c = array.getClass(); // 集合ArrayList的class文件对象
		Method m = c.getMethod("add", Object.class);	// add()参数的类型是Object

		m.invoke(array, "hello"); // 调用array的add方法，传入的值是hello
		m.invoke(array, "world");
		m.invoke(array, "java");

		System.out.println(array);
	}
}
