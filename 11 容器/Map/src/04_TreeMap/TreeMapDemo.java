package cn.itcast_04;

import java.util.Set;
import java.util.TreeMap;

/*
 * TreeMap:�ײ�ʵ���Ǻ������������Դ��������ԣ�
 *
 * TreeMap<String,String>
 * ����String
 * ֵ��String
 *
 * ���򷽷���1.Ĭ����Ȼ����2.��������ʱʹ���Զ��壬ʵ��Comparator�ӿڣ���дcompare����
 */

public class TreeMapDemo {
	public static void main(String[] args) {
		// �������϶���
		TreeMap<String, String> tm = new TreeMap<String, String>();	//Ĭ����Ȼ����

		// ����Ԫ�ز����Ԫ��
		tm.put("hello", "���");
		tm.put("world", "����");
		tm.put("java", "צ��");
		tm.put("world", "����2");
		tm.put("javaee", "צ��EE");

		// ��������
		Set<String> set = tm.keySet();
		for (String key : set) {
			String value = tm.get(key);
			System.out.println(key + "---" + value);
		}
	}
}
