package Demo_03;

import java.util.HashSet;

/*
 * ʹ�ü���ʱ��һ�㽨����дequals()��hashCode()���Զ����ɼ���
 */
public class DogDemo {
	public static void main(String[] args) {
		//�������϶���
		HashSet<Dog> hs = new HashSet<Dog>();

		//����������
		Dog d1 = new Dog("����", 25, "��ɫ", '��');
		Dog d2 = new Dog("��ٴ", 22, "��ɫ", 'Ů');
		Dog d3 = new Dog("����", 25, "��ɫ", '��');
		Dog d4 = new Dog("����", 20, "��ɫ", 'Ů');
		Dog d5 = new Dog("κ����", 28, "��ɫ", '��');
		Dog d6 = new Dog("����Ӣ", 23, "��ɫ", 'Ů');
		Dog d7 = new Dog("����Ӣ", 23, "��ɫ", 'Ů');
		Dog d8 = new Dog("����Ӣ", 23, "��ɫ", '��');

		//���Ԫ��
		hs.add(d1);
		hs.add(d2);
		hs.add(d3);
		hs.add(d4);
		hs.add(d5);
		hs.add(d6);
		hs.add(d7);
		hs.add(d8);

		//����
		for (Dog d : hs) {
			System.out.println(d.getName() + "---" + d.getAge() + "---"
					+ d.getColor() + "---" + d.getSex());
		}
	}
}



class Dog {
	private String name;
	private int age;
	private String color;
	private char sex;

	public Dog() {
		super();
	}

	public Dog(String name, int age, String color, char sex) {
		super();
		this.name = name;
		this.age = age;
		this.color = color;
		this.sex = sex;
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + sex;
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
		Dog other = (Dog) obj;
		if (age != other.age)
			return false;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (sex != other.sex)
			return false;
		return true;
	}

}

