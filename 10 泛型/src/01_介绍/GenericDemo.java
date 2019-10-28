package Demo_01;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * 
 * 泛型：说明可以用什么类型。
 * 格式：
 * 		<数据类型>
 * 		此处的数据类型只能是引用类型。例如——int类型必须转化为Integer类。
 * 优点：
 * 		1.把运行时期的问题提前到了编译时期
 * 		2.避免了强制类型转换
 * 		3.优化了程序设计，解决了黄色警告线
 */
public class GenericDemo {
	public static void main(String[] args) {
		//创建
		ArrayList<String> array = new ArrayList<String>();

		//添加元素
		array.add("hello");
		array.add("world");
		array.add("java");


		//遍历
		Iterator<String> it = array.iterator();
		while (it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}

	}
}
