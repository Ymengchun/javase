package cn.itcast_07;

import java.util.Comparator;

/*
 * 比较器排序：自定义一个比较器类，实现Comparator接口，重写compare()方法。
 * 
 * 自然排序、比较器排序的区别
 * 		1.自然排序：直接用待排序的类实现Comparable接口，重写compareTo()方法
 * 		2.比较器排序：重新定义一个比较器类，实现Comparator接口，重写compare()方法。
 * 
 */
public class MyComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		//int num = this.name.length() - s.name.length();
		//this -- s1
		//s -- s2
		//姓名长度
		int num = s1.getName().length() - s2.getName().length();
		//姓名内容
		int num2 = num == 0 ? s1.getName().compareTo(s2.getName()) : num;	//String类重写了compareTo()：按字典顺序比较
		//年龄
		int num3 = num2 == 0 ? s1.getAge() - s2.getAge() : num2;
		return num3;
	}

}
