package cn.itcast_04;

import java.util.Set;
import java.util.TreeMap;

/*
 * TreeMap:底层实现是红黑树（红黑树自带排序特性）
 *
 * TreeMap<String,String>
 * 键：String
 * 值：String
 *
 * 排序方法：1.默认自然排序；2.创建对象时使用自定义，实现Comparator接口，重写compare方法
 */

public class TreeMapDemo {
	public static void main(String[] args) {
		// 创建集合对象
		TreeMap<String, String> tm = new TreeMap<String, String>();	//默认自然排序

		// 创建元素并添加元素
		tm.put("hello", "你好");
		tm.put("world", "世界");
		tm.put("java", "爪哇");
		tm.put("world", "世界2");
		tm.put("javaee", "爪哇EE");

		// 遍历集合
		Set<String> set = tm.keySet();
		for (String key : set) {
			String value = tm.get(key);
			System.out.println(key + "---" + value);
		}
	}
}
