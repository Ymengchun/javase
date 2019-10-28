package cn.itcast_03;

import java.util.LinkedHashMap;
import java.util.Set;

/*
 * LinkedHashMap:是HashMap的亲儿子，可以保证存储和取出的顺序一致
 * 由一个双链表保证存储和取出的顺序一致性
 */
public class LinkedHashMapDemo {
	public static void main(String[] args) {
		// 创建集合对象
		LinkedHashMap<String, String> hm = new LinkedHashMap<String, String>();

		// 创建并添加元素
		hm.put("2345", "hello");
		hm.put("1234", "world");
		hm.put("3456", "java");
		hm.put("1234", "javaee");
		hm.put("3456", "android");

		// 遍历
		Set<String> set = hm.keySet();
		for (String key : set) {
			String value = hm.get(key);
			System.out.println(key + "---" + value);
		}
	}
}
