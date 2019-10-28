package Demo_06;

import java.util.ArrayList;

/*
 * ���������ϵ�Ƕ��
 */
public class ArrayListDemo {
	public static void main(String[] args) {
		//�����󼯺�
		ArrayList<ArrayList<Student>> bigArrayList = new ArrayList<ArrayList<Student>>();

		//������һ���༶��ѧ������
		ArrayList<Student> firstArrayList = new ArrayList<Student>();
		//����ѧ��
		Student s1 = new Student("��ɮ", 30);
		Student s2 = new Student("�����", 29);
		Student s3 = new Student("��˽�", 28);
		Student s4 = new Student("ɳɮ", 27);
		Student s5 = new Student("������", 26);
		//ѧ������
		firstArrayList.add(s1);
		firstArrayList.add(s2);
		firstArrayList.add(s3);
		firstArrayList.add(s4);
		firstArrayList.add(s5);
		//�ѵ�һ���༶�洢��ѧ��ϵͳ��
		bigArrayList.add(firstArrayList);

		//�����ڶ����༶��ѧ������
		ArrayList<Student> secondArrayList = new ArrayList<Student>();
		//����ѧ��
		Student s11 = new Student("�����", 30);
		Student s22 = new Student("˾��ܲ", 28);
		Student s33 = new Student("���", 26);
		//ѧ������
		secondArrayList.add(s11);
		secondArrayList.add(s22);
		secondArrayList.add(s33);
		//�ѵڶ����༶�洢��ѧ��ϵͳ��
		bigArrayList.add(secondArrayList);

		//�����������༶��ѧ������
		ArrayList<Student> thirdArrayList = new ArrayList<Student>();
		//����ѧ��
		Student s111 = new Student("�ν�", 40);
		Student s222 = new Student("����", 35);
		Student s333 = new Student("��ٴ", 30);
		Student s444 = new Student("��ʦʦ", 22);
		//ѧ������
		thirdArrayList.add(s111);
		thirdArrayList.add(s222);
		thirdArrayList.add(s333);
		thirdArrayList.add(s444);
		//�ѵ������༶�洢��ѧ��ϵͳ��
		bigArrayList.add(thirdArrayList);

		//��������
		for (ArrayList<Student> array : bigArrayList) {
			for (Student s : array) {
				System.out.println(s.getName() + "---" + s.getAge());
			}
		}
	}
}

package Demo_06;

public class Student {
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

}

