package Demo_04;

import java.util.LinkedHashSet;

/*
 * LinkedHashSet�ĵײ����ݽṹ����ϣ��+����
 *		��ϣ����֤Ԫ�ص�Ψһ�ԡ�
 *		������֤Ԫ���������������ָ����˳���ȡ��˳��һ�£�����������
 *
 */
public class LinkedHashSetDemo {
	public static void main(String[] args) {
		//�������϶���
		LinkedHashSet<String> hs = new LinkedHashSet<String>();

		//���������Ԫ��
		hs.add("hello");
		hs.add("world");
		hs.add("java");
		hs.add("world");
		hs.add("java");

		//����
		for (String s : hs) {
			System.out.println(s);
		}
	}
}