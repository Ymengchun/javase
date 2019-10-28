package IO_07;

import java.io.Serializable;

/*
 * NotSerializableException��δ���л��쳣
 * 
 * ��ν�һ�������л���ʵ��java.io.Serializable�ӿڡ�δʵ�ִ˽ӿڵ��ཫ�޷�ʹ���κ�״̬���л������л���
 * ��ǽӿڣ�û�з����Ľӿ�
 * ע�⣺һ�����п����кܶ��Ա��������Щ�Ҳ���������л������ʸ���ô����?
 * 		ʹ��transient�ؼ�����������Ҫ���л��ĳ�Ա����
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
