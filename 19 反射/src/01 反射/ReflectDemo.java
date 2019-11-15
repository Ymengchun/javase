package cn.itcast_01;

/*
 * 反射：通过class文件对象，去使用该文件中的成员变量、构造方法、成员方法。首先要得到class文件对象（Class类对象）
 * 之前都是通过具体对象去调用
 * 
 * Class类：
 * 		成员变量	Field
 * 		构造方法	Constructor
 * 		成员方法	Method
 * 
 * 获取class文件对象的方式：
 * 	A:对象名.getClass()
 * 	B:类名.class
 * 	C:Class.forName(文件名)
 * 
 * 建议第三种：参数是字符串，而不是具体类名，方便在配置文件中配置字符串

public class ReflectDemo {
	public static void main(String[] args) throws ClassNotFoundException {
		// 方式1
		Person p = new Person();
		Class c = p.getClass();

		Person p2 = new Person();
		Class c2 = p2.getClass();	//new出来的是两个对象，getClass()得到的是同一个类

		System.out.println(p == p2);// false
		System.out.println(c == c2);// true

		// 方式2
		Class c3 = Person.class;
		// int.class;
		// String.class;
		System.out.println(c == c3);

		// 方式3
		// ClassNotFoundException
		Class c4 = Class.forName("cn.itcast_01.Person");
		System.out.println(c == c4);
	}
}
