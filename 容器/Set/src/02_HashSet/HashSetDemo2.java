package Demo_02;

import java.util.HashSet;

/*
 * ������Student����д��hashCode()��equals()��ʹ��HashSet���Ԫ��ʱ����ȥ�ء�
 */
public class HashSetDemo2 {
	public static void main(String[] args) {
		//�������϶���
		HashSet<Student> hs = new HashSet<Student>();

		//����ѧ������
		Student s1 = new Student("����ϼ", 27);
		Student s2 = new Student("����", 22);
		Student s3 = new Student("������", 30);
		Student s4 = new Student("����ϼ", 27);
		Student s5 = new Student("����ϼ", 20);
		Student s6 = new Student("������", 22);

		//���Ԫ��
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		hs.add(s4);
		hs.add(s5);
		hs.add(s6);

		//��������
		for (Student s : hs) {
			System.out.println(s.getName() + "---" + s.getAge());
		}
	}
}



/*
 * Student�ࣺ��д��hashCode()��equals()
 */
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
