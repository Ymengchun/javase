package Demo_02;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * ���󣺴洢�Զ�����󲢱�����
 * 		1.����ѧ����
 * 		2.�������϶���
 * 		3.����Ԫ�ض���
 * 		4.��Ԫ����ӵ�����
 * 		5.��������
 */
public class ArrayListDemo2 {
	public static void main(String[] args) {
		ArrayList<Student> array = new ArrayList<Student>();

		//����Ԫ�ض���
		Student s1 = new Student("�ܲ�", 40); 	//��֪���
		Student s2 = new Student("����", 30); 	//��֪����
		Student s3 = new Student("�����", 26);	//��֪�Ⱦ�

		//���Ԫ��
		array.add(s1);
		array.add(s2);
		array.add(s3);

		//����������
		Iterator<Student> it = array.iterator();
		while (it.hasNext()) {
			Student s = it.next();
			System.out.println(s.getName() + "---" + s.getAge());
		}
		System.out.println("------------------");

		//��������
		for (int x = 0; x < array.size(); x++) {
			Student s = array.get(x);
			System.out.println(s.getName() + "---" + s.getAge());
		}
	}
}
