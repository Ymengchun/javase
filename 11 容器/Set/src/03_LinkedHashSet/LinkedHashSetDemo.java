package Demo_04;

import java.util.LinkedHashSet;

/*
 * LinkedHashSet的底层数据结构：哈希表+链表。
 *		哈希表：保证元素的唯一性。
 *		链表：保证元素有序。这里的有序指存入顺序和取出顺序一致，而不是排序。
 *
 */
public class LinkedHashSetDemo {
	public static void main(String[] args) {
		//创建集合对象
		LinkedHashSet<String> hs = new LinkedHashSet<String>();

		//创建并添加元素
		hs.add("hello");
		hs.add("world");
		hs.add("java");
		hs.add("world");
		hs.add("java");

		//遍历
		for (String s : hs) {
			System.out.println(s);
		}
	}
}