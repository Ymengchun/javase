package IO_07;

import java.io.Serializable;

/*
 * NotSerializableException：未序列化异常
 * 
 * 如何将一个类序列化：实现java.io.Serializable接口。未实现此接口的类将无法使其任何状态序列化或反序列化。
 * 标记接口：没有方法的接口
 * 注意：一个类中可能有很多成员变量，有些我不想进行序列化。请问该怎么办呢?
 * 		使用transient关键字声明不需要序列化的成员变量
 */

public class Person implements Serializable {
	
	private static final long serialVersionUID = -2071565876962058344L;
	private String name;
	//private int age;
	private transient int age;

	// int age;

	public Person() {
		super();
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}
