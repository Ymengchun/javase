package Demo_02;

/*
 * public String toString()：
 * 		返回该对象的字符串表示。默认为类名+@+十六进制的hashCode值。
 * 		可以重写，建议所有子类都重写该方法，自动生成即可。
 * 	 	直接输出一个对象的名称，其实就是调用该对象的toString()方法。
 */
public class StudentDemo {
	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s.hashCode());
		System.out.println(s.getClass().getName());
		System.out.println("--------------------");
		System.out.println(s.toString());	//Demo_02.Student@42552c
		System.out.println("--------------------");
		//toString()方法的源码：
		//	getClass().getName() + '@' + Integer.toHexString(hashCode())
		//	this.getClass().getName()+'@'+Integer.toHexString(this.hashCode())

		// Demo_02.Student@42552c
		// Demo_02.Student@42552c

		System.out.println(s.getClass().getName() + '@'
				+ Integer.toHexString(s.hashCode()));

		System.out.println(s.toString());

		// 直接输出对象的名称
		System.out.println(s);
	}
}
