package Demo_02;

import java.util.HashSet;

/*
 * Person��û����дhashCode()��equals()��ʹ��HashSet���Ԫ��ʱ�޷�ȥ�ء�
 */
public class HashSetDemo3 {
	public static void main(String[] args) {
		//�������϶���
		HashSet<Person> p = new HashSet<Person>();

		//����ѧ������
		Person p1 = new Person("����ϼ", 27);
		Person p2 = new Person("����", 22);
		Person p3 = new Person("������", 30);
		Person p4 = new Person("����ϼ", 27);
		Person p5 = new Person("����ϼ", 20);
		Person p6 = new Person("������", 22);

		//���Ԫ��
		p.add(p1);
		p.add(p2);
		p.add(p3);
		p.add(p4);
		p.add(p5);
		p.add(p6);

		//��������
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
