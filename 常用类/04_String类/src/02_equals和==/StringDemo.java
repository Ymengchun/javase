package Demo_02;

/*
 * 字符串的特点：一旦被赋值，就不能改变。
 * 本案例中s看似改变了，但实际上后一次的赋值是生成了原来字符串s的一个副本，并没有改变原先的字符串s。
 */
public class StringDemo {
	public static void main(String[] args) {
		String s = "hello";
		System.out.println("s:" + s); //hello
		System.out.println(s.hashCode());	//99162322
		
		s = "world";
		System.out.println(s.hashCode());	//113318802
		System.out.println("s:" + s); //world
	}
}