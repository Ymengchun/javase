package Demo_04;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * 需求：ArrayList去重，要求不创建新集合，直接在原集合上操作。
 */
public class ArrayListDemo2 {
	public static void main(String[] args) {
		//创建集合对象
		ArrayList array = new ArrayList();

		//添加多个字符串元素(包含内容相同的)
		array.add("hello");
		array.add("world");
		array.add("java");
		array.add("world");
		array.add("java");
		array.add("world");
		array.add("world");
		array.add("world");
		array.add("world");
		array.add("java");
		array.add("world");

		//看第一个元素之后有没有和第一个元素相同的元素：相同——删除，不相同——跳过
		//看第二个元素之后有没有和第二个元素相同的元素：相同——删除，不相同——跳过
		//...
		for (int x = 0; x < array.size() - 1; x++) {
			for (int y = x + 1; y < array.size(); y++) {
				if (array.get(x).equals(array.get(y))) {
					array.remove(y);
					y--;	//前移一位
				}
			}
		}

		//遍历集合
		Iterator it = array.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();
			System.out.println(s);
		}
	}
}
