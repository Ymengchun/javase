package Demo_04;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * ����ȥ���������Զ��������ظ�ֵ(����ĳ�Ա����ֵ����ͬ)
 * 
 * ���������⣺������պ��ַ���һ���Ĳ�����ֱ����contains���������ͻ�����⡣
 * ԭ��
 * 		1.contains()�����ĵײ�ʵ����Ȼ��equals()������
 *		2.��Student����û��equals()��������Ĭ��ʹ�ø���Object��equals()������
 *		3.Object()��equals()�����Ƚϵ��ǵ�ַ������ͬ��Student������Ȼ��ַ��ͬ��newһ�¾����µĵ�ַ����
 * �������дequals()���ɣ��Զ����ɣ�
 * �Զ����ɼ��ɡ�
 */
public class ArrayListDemo3 {
	public static void main(String[] args) {
		//�������϶���
		ArrayList array = new ArrayList();

		//����ѧ������
		Student s1 = new Student("����ϼ", 27);
		Student s2 = new Student("��־��", 40);
		Student s3 = new Student("���", 35);
		Student s4 = new Student("ܽ�ؽ��", 18);
		Student s5 = new Student("�仨", 16);
		Student s6 = new Student("����ϼ", 27);
		Student s7 = new Student("����ϼ", 18);

		//���Ԫ��
		array.add(s1);
		array.add(s2);
		array.add(s3);
		array.add(s4);
		array.add(s5);
		array.add(s6);
		array.add(s7);

		//�����¼���
		ArrayList newArray = new ArrayList();

		//�����ɼ��ϣ���ȡÿһ��Ԫ��
		Iterator it = array.iterator();
		while (it.hasNext()) {
			Student s = (Student) it.next();

			//�����Ԫ�ص��¼���ȥ�ң�����û��
			if (!newArray.contains(s)) {
				newArray.add(s);
			}
		}

		//�����¼���
		for (int x = 0; x < newArray.size(); x++) {
			Student s = (Student) newArray.get(x);
			System.out.println(s.getName() + "---" + s.getAge());
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
