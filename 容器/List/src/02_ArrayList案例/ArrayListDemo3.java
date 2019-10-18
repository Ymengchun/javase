package Demo_04;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * 需求：去除集合中自定义对象的重复值(对象的成员变量值都相同)
 * 
 * 产生的问题：如果按照和字符串一样的操作（直接用contains方法），就会出问题。
 * 原因：
 * 		1.contains()方法的底层实现仍然是equals()方法；
 *		2.而Student类中没有equals()方法，它默认使用父亲Object的equals()方法；
 *		3.Object()的equals()方法比较的是地址，而不同的Student对象显然地址不同（new一下就是新的地址）；
 * 解决：重写equals()即可（自动生成）
 * 自动生成即可。
 */
public class ArrayListDemo3 {
	public static void main(String[] args) {
		//创建集合对象
		ArrayList array = new ArrayList();

		//创建学生对象
		Student s1 = new Student("林青霞", 27);
		Student s2 = new Student("林志玲", 40);
		Student s3 = new Student("凤姐", 35);
		Student s4 = new Student("芙蓉姐姐", 18);
		Student s5 = new Student("翠花", 16);
		Student s6 = new Student("林青霞", 27);
		Student s7 = new Student("林青霞", 18);

		//添加元素
		array.add(s1);
		array.add(s2);
		array.add(s3);
		array.add(s4);
		array.add(s5);
		array.add(s6);
		array.add(s7);

		//创建新集合
		ArrayList newArray = new ArrayList();

		//遍历旧集合，获取每一个元素
		Iterator it = array.iterator();
		while (it.hasNext()) {
			Student s = (Student) it.next();

			//拿这个元素到新集合去找，看有没有
			if (!newArray.contains(s)) {
				newArray.add(s);
			}
		}

		//遍历新集合
		for (int x = 0; x < newArray.size(); x++) {
			Student s = (Student) newArray.get(x);
			System.out.println(s.getName() + "---" + s.getAge());
		}
	}
}



class Student {
	private String name;
	private int age;

	public Student() {
		super();
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}
