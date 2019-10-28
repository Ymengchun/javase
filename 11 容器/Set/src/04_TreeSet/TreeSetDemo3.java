package Demo_06;

import java.util.TreeSet;

/*
 * �����밴�������ĳ�������
 */
public class TreeSetDemo3 {
	public static void main(String[] args) {
		//�������϶���
		TreeSet<Student> ts = new TreeSet<Student>();

		//����Ԫ��
		Student s1 = new Student("linqingxia", 27);
		Student s2 = new Student("zhangguorong", 29);
		Student s3 = new Student("wanglihong", 23);
		Student s4 = new Student("linqingxia", 27);
		Student s5 = new Student("liushishi", 22);
		Student s6 = new Student("wuqilong", 40);
		Student s7 = new Student("fengqingy", 22);
		Student s8 = new Student("linqingxia", 29);

		// ���Ԫ��
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);
		ts.add(s6);
		ts.add(s7);
		ts.add(s8);

		//����
		for (Student s : ts) {
			System.out.println(s.getName() + "---" + s.getAge());
		}
	}
}



class Student implements Comparable<Student> {
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
	public int compareTo(Student s) {
		//��Ҫ�����������ĳ���
		int num = this.name.length() - s.name.length();
		//��Ҫ����������������
		int num2 = num == 0 ? this.name.compareTo(s.name) : num;
		//�ٴ�Ҫ����������
		int num3 = num2 == 0 ? this.age - s.age : num2;
		return num3;
	}
}

