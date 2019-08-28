import java.util.HashMap;
import java.util.Set;

/*
 * HashMap<Student,String>
 * 	����Student
 * 		�����ü����㣺�����������ĳ�Ա����ֵ����ͬ����Ϊͬһ������
 * 		�����������дhashCode��equals����ǰ��key���ǻ������ͣ���һ�����������ͣ�������д��
 * 	ֵ��String
 */
public class HashMapDemo4 {
	public static void main(String[] args) {
		//�������϶���
		HashMap<Student, String> hm = new HashMap<Student, String>();

		//����ѧ������
		Student s1 = new Student("����", 27);
		Student s2 = new Student("���Ѿ�", 30);
		Student s3 = new Student("��ʩ", 33);
		Student s4 = new Student("����", 35);
		Student s5 = new Student("����", 27);	//key��ͬ��ֵ����

		//���Ԫ��
		hm.put(s1, "8888");
		hm.put(s2, "6666");
		hm.put(s3, "5555");
		hm.put(s4, "7777");
		hm.put(s5, "9999");

		//����
		Set<Student> set = hm.keySet();
		for (Student key : set) {
			String value = hm.get(key);
			System.out.println(key.getName() + "---" + key.getAge() + "---"
					+ value);
		}
	}
}