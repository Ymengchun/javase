package cn.itcast_07;

import java.util.Comparator;
import java.util.TreeSet;

/*
 * 需求：按姓名的长度排序
 */
public class TreeSetDemo {
	public static void main(String[] args) {
		//创建集合对象
		//TreeSet<Student> ts = new TreeSet<Student>(); //自然排序
		// public TreeSet(Comparator comparator) //比较器排序
		// TreeSet<Student> ts = new TreeSet<Student>(new MyComparator());

		//如果一个方法的参数是接口，那么真正需要的不是接口，而是实现接口的对象
		//可以用匿名内部类实现
		TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				//姓名长度
				int num = s1.getName().length() - s2.getName().length();
				//姓名内容
				int num2 = num == 0 ? s1.getName().compareTo(s2.getName())
						: num;
				//年龄
				int num3 = num2 == 0 ? s1.getAge() - s2.getAge() : num2;
				return num3;
			}
		});

		//创建元素
		Student s1 = new Student("linqingxia", 27);
		Student s2 = new Student("zhangguorong", 29);
		Student s3 = new Student("wanglihong", 23);
		Student s4 = new Student("linqingxia", 27);
		Student s5 = new Student("liushishi", 22);
		Student s6 = new Student("wuqilong", 40);
		Student s7 = new Student("fengqingy", 22);
		Student s8 = new Student("linqingxia", 29);

		//添加元素
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);
		ts.add(s6);
		ts.add(s7);
		ts.add(s8);

		//遍历
		for (Student s : ts) {
			System.out.println(s.getName() + "---" + s.getAge());
		}
	}
}
