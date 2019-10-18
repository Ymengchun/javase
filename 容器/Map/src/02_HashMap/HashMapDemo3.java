package cn.itcast_02;

import java.util.HashMap;
import java.util.Set;

/*
 * HashMap<String,Student>
 * ����String	ѧ��
 * ֵ��Student ѧ������
 */
public class HashMapDemo3 {
	public static void main(String[] args) {
		// �������϶���
		HashMap<String, Student> hm = new HashMap<String, Student>();

		// ����ѧ������
		Student s1 = new Student("���ǳ�", 58);
		Student s2 = new Student("���»�", 55);
		Student s3 = new Student("����ΰ", 54);
		Student s4 = new Student("������", 50);

		// ���Ԫ��
		hm.put("9527", s1);
		hm.put("9522", s2);
		hm.put("9524", s3);
		hm.put("9529", s4);

		// ����
		Set<String> set = hm.keySet();
		for (String key : set) {
			// ע���ˣ����ֵ�����ַ�����
			// String value = hm.get(key);
			Student value = hm.get(key);
			System.out.println(key + "---" + value.getName() + "---"
					+ value.getAge());
		}
	}
}

class Student {
	private String name;
	private int age;

	public Student() {
		super();
	}

	public Student(String name, int age) {
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
