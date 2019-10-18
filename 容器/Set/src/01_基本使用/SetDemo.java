package Demo_01;

import java.util.HashSet;
import java.util.Set;

/*
 * Collection
 * 		|--List
 * 			有序(存储顺序和取出顺序一致),可重复
 * 		|--Set
 * 			无序(存储顺序和取出顺序不一致),唯一
 * 
 * 实现Set接口的最常用的类：HashSet
 */
public class SetDemo {
	public static void main(String[] args) {
		//创建集合对象
		Set<String> set = new HashSet<String>();

		//创建并添加元素
		set.add("hello");
		set.add("java");
		set.add("world");
		set.add("java");
		set.add("world");

		//增强for
		for (String s : set) {
			System.out.println(s);
		}
	}
}
