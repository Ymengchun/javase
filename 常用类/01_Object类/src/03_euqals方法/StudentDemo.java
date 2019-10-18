package Demo_03;

/*
 * public boolean equals(Object obj)：其他对象是否与此对象“相等”。 
 * 		重写前（默认情况）：比较地址值是否相同，和==作用一样。
 *		重写后：比较对象的成员变量值是否相同，如果成员变量值相同则认为两个对象相同，自动生成即可。
 * 
 * 看源码：
 * 		public boolean equals(Object obj) {
 * 			//this - s1
 * 			//obj - s2
 *       	return (this == obj);
 *   	}
 * 
 * ==：
 * 		基本类型：比较值是否相同。
 * 		引用类型：比较地址是否相同。
 * equals:
 * 		只用于引用类型：默认情况下，比较地址是否相同（和==作用一样）。重写后，比较对象的成员变量值是否相同。
 * 
 * ClassCastException：
 */
public class StudentDemo {
	public static void main(String[] args) {
		Student s1 = new Student("林青霞", 27);
		Student s2 = new Student("林青霞", 27);
		System.out.println(s1 == s2); //false
		Student s3 = s1;
		System.out.println(s1 == s3); //true
		System.out.println("---------------");

		System.out.println(s1.equals(s2)); //obj = s2; //false
		System.out.println(s1.equals(s1)); //true
		System.out.println(s1.equals(s3)); //true
		Student s4 = new Student("风清扬",30);
		System.out.println(s1.equals(s4)); //false
		
		Demo d = new Demo();
		System.out.println(s1.equals(d)); //ClassCastException：两不同类的对象equals时会产生

	}
}

class Demo {}