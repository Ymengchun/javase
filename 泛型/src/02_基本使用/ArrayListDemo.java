package Demo_02;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * 泛型在哪些地方使用呢?
 * 		看API，如果类、接口、抽象类后面有<E>，就要使用泛型。一般用于集合中。
 * 
 * 案例：用ArrayList存储字符串元素，并遍历。用泛型改进代码。
 */
public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>();

		array.add("hello");
		array.add("world");
		array.add("java");
		
		//用迭代器遍历
		Iterator<String> it = array.iterator();
		while (it.hasNext()) {
			String s = it.next();	//以前的代码未使用泛型，这里要强转，现在不用
			System.out.println(s);
		}
		System.out.println("-----------------");

		//用索引遍历
		for (int x = 0; x < array.size(); x++) {
			String s = array.get(x);	//以前的代码未使用泛型，这里要强转，现在不用
			System.out.println(s);
		}
	}
}
