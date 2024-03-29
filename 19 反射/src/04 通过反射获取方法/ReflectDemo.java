package cn.itcast_04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectDemo {
	public static void main(String[] args) throws Exception {
		// 获取字节码文件对象
		Class c = Class.forName("cn.itcast_01.Person");

		// 获取所有的方法
		// Method[] methods = c.getMethods(); // 获取自己的包括父亲的公共方法
		// Method[] methods = c.getDeclaredMethods(); // 获取自己的所有的方法
		// for (Method method : methods) {
		// System.out.println(method);
		// }

		Constructor con = c.getConstructor();
		Object obj = con.newInstance();

		/*
		 * Person p = new Person(); p.show();
		 */

		// 获取单个方法并使用
		// public void show()
		// public Method getMethod(String name,Class<?>... parameterTypes)
		// 第一个参数表示的方法名，第二个参数表示的是方法的参数的class类型
		Method m1 = c.getMethod("show");

		// public Object invoke(Object obj,Object... args)
		// 返回值是Object类型,第一个参数表示对象是谁，第二参数表示调用该方法的实际参数
		m1.invoke(obj); // 调用obj对象的m1方法

		System.out.println("----------");
		// 示例：获取Person类中的method方法
		Method m2 = c.getMethod("method", String.class);
		m2.invoke(obj, "hello");
		System.out.println("----------");

		// 示例：获取Person类中的getString方法
		Method m3 = c.getMethod("getString", String.class, int.class);
		Object objString = m3.invoke(obj, "hello", 100);	//invoke()的返回值是Object类型
		System.out.println(objString);
		// String s = (String)m3.invoke(obj, "hello",100);
		// System.out.println(s);
		System.out.println("----------");

		// 示例：获取Person类中的私有方法function()
		Method m4 = c.getDeclaredMethod("function");
		m4.setAccessible(true);
		m4.invoke(obj);
	}
}
