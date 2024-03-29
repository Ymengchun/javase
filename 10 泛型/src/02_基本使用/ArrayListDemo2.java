package Demo_02;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * 需求：存储自定义对象并遍历。
 * 		1.创建学生类
 * 		2.创建集合对象
 * 		3.创建元素对象
 * 		4.把元素添加到集合
 * 		5.遍历集合
 */
public class ArrayListDemo2 {
	public static void main(String[] args) {
		ArrayList<Student> array = new ArrayList<Student>();

		//创建元素对象
		Student s1 = new Student("曹操", 40); 	//后知后觉
		Student s2 = new Student("蒋干", 30); 	//不知不觉
		Student s3 = new Student("诸葛亮", 26);	//先知先觉

		//添加元素
		array.add(s1);
		array.add(s2);
		array.add(s3);

		//迭代器遍历
		Iterator<Student> it = array.iterator();
		while (it.hasNext()) {
			Student s = it.next();
			System.out.println(s.getName() + "---" + s.getAge());
		}
		System.out.println("------------------");

		//索引遍历
		for (int x = 0; x < array.size(); x++) {
			Student s = array.get(x);
			System.out.println(s.getName() + "---" + s.getAge());
		}
	}
}
