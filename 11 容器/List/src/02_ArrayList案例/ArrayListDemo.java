package Demo_04;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * 案例：ArrayList去重
 * 
 * 分析：
 * 		1.创建集合对象
 * 		2.添加多个字符串元素(包含内容相同的)
 * 		3.创建新集合
 * 		4.遍历旧集合，获取得到每一个元素
 * 		5.拿这个元素到新集合去找，看有没有
 * 			有：跳过
 * 			没有：添加到新集合
 * 		6.遍历新集合，输出元素
 */
public class ArrayListDemo {
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

		//创建新集合
		ArrayList newArray = new ArrayList();

		//遍历旧集合,获取得到每一个元素
		Iterator it = array.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();

			//拿这个元素到新集合去找，看有没有
			if (!newArray.contains(s)) {
				newArray.add(s);
			}
		}

		//遍历新集合
		for (int x = 0; x < newArray.size(); x++) {
			String s = (String) newArray.get(x);
			System.out.println(s);
		}
	}
}
