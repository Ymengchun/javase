package Demo_03;

import java.util.LinkedList;

/*
 * LinkedList的特有功能：
 * 		1.添加功能
 * 			public void addFirst(Object e)
 * 			public void addLast(Object e)
 * 		2.获取功能
 * 			public Object getFirst()
 * 			public Obejct getLast()
 * 		3.删除功能
 * 			public Object removeFirst()
 * 			public Object removeLast()
 */
public class LinkedListDemo {
	public static void main(String[] args) {
		//创建集合对象
		LinkedList link = new LinkedList();

		//添加元素
		link.add("hello");
		link.add("world");
		link.add("java");

		//ddFirst()：添加头元素
		//link.addFirst("javaee");
		//addLast()：添加尾元素
		//link.addLast("android");

		//getFirst()：获取头元素
		//System.out.println("getFirst:" + link.getFirst());
		//getLast()：获取尾元素
		//System.out.println("getLast:" + link.getLast());

		//removeFirst()：删除首元素
		System.out.println("removeFirst:" + link.removeFirst());
		//removeLast()：删除尾元素
		System.out.println("removeLast:" + link.removeLast());

		//输出对象名
		System.out.println("link:" + link);
	}
}
