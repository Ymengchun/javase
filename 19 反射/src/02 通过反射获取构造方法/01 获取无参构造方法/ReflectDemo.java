package cn.itcast_02;

import java.lang.reflect.Constructor;

import cn.itcast_01.Person;

/*
 * 通过反射获取构造方法并使用。
 */
public class ReflectDemo {
	public static void main(String[] args) throws Exception {
		// 获取字节码文件对象
		Class c = Class.forName("cn.itcast_01.Person");

		// 获取构造方法
		// public Constructor[] getConstructors():所有公共构造方法
		// public Constructor[] getDeclaredConstructors():所有构造方法
		// Constructor[] cons = c.getDeclaredConstructors();
		// for (Constructor con : cons) {
		// System.out.println(con);
		// }

		// 获取单个构造方法
		// public Constructor<T> getConstructor(Class<?>... parameterTypes)
		// 参数表示的是：你要获取的构造方法的构造参数个数及数据类型的class字节码文件对象
		Constructor con = c.getConstructor();// 返回的是构造方法对象

		
		// public T newInstance(Object... initargs)
		// 初始化该实例，初始化为object对象
		Object obj = con.newInstance();
		System.out.println(obj);
		
	}
}
