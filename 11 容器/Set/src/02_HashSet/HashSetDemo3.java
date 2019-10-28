package Demo_02;

import java.util.HashSet;

/*
 * Person类没有重写hashCode()和equals()，使用HashSet添加元素时无法去重。
 */
public class HashSetDemo3 {
	public static void main(String[] args) {
		//创建集合对象
		HashSet<Person> p = new HashSet<Person>();

		//创建学生对象
		Person p1 = new Person("林青霞", 27);
		Person p2 = new Person("柳岩", 22);
		Person p3 = new Person("王祖贤", 30);
		Person p4 = new Person("林青霞", 27);
		Person p5 = new Person("林青霞", 20);
		Person p6 = new Person("范冰冰", 22);

		//添加元素
		p.add(p1);
		p.add(p2);
		p.add(p3);
		p.add(p4);
		p.add(p5);
		p.add(p6);

		//遍历集合
		for (Person e : p) {
			System.out.println(e.getName() + "---" + e.getAge());
		}
	}
}


class Person {
	private String name;
	private int age;

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
}
