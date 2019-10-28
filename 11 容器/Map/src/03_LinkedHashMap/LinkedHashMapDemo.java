package cn.itcast_03;

import java.util.LinkedHashMap;
import java.util.Set;

/*
 * LinkedHashMap:��HashMap���׶��ӣ����Ա�֤�洢��ȡ����˳��һ��
 * ��һ��˫����֤�洢��ȡ����˳��һ����
 */
public class LinkedHashMapDemo {
	public static void main(String[] args) {
		// �������϶���
		LinkedHashMap<String, String> hm = new LinkedHashMap<String, String>();

		// ���������Ԫ��
		hm.put("2345", "hello");
		hm.put("1234", "world");
		hm.put("3456", "java");
		hm.put("1234", "javaee");
		hm.put("3456", "android");

		// ����
		Set<String> set = hm.keySet();
		for (String key : set) {
			String value = hm.get(key);
			System.out.println(key + "---" + value);
		}
	}
}
