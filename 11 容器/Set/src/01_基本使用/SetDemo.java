package Demo_01;

import java.util.HashSet;
import java.util.Set;

/*
 * Collection
 * 		|--List
 * 			����(�洢˳���ȡ��˳��һ��),���ظ�
 * 		|--Set
 * 			����(�洢˳���ȡ��˳��һ��),Ψһ
 * 
 * ʵ��Set�ӿڵ���õ��ࣺHashSet
 */
public class SetDemo {
	public static void main(String[] args) {
		//�������϶���
		Set<String> set = new HashSet<String>();

		//���������Ԫ��
		set.add("hello");
		set.add("java");
		set.add("world");
		set.add("java");
		set.add("world");

		//��ǿfor
		for (String s : set) {
			System.out.println(s);
		}
	}
}
