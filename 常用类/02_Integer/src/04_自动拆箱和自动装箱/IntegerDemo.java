package Demo_05;

/*
 * JDK5的新特性
 * 		1、自动装箱：基本类型 → 包装类
 * 		2、自动拆箱：包装类 → 基本类型
 * 
 * NullPointerException（空指针异常）：
 * 		Integer x = null;	出现NullPointerException。
 * 		建议：先判断是否为null，然后再使用。
 */
public class IntegerDemo {
	public static void main(String[] args) {

		Integer ii = 100;	//自动装箱，相当于Integer i = new Integer(100);
		int b = ii;	//自动拆箱，左边是int，右边是Integer
		ii += 200;	//Integer与int相加，Integer自动拆箱为int
		System.out.println("ii:" + ii);

		//通过反编译后的代码（编译器自动执行的代码）
		//Integer ii = Integer.valueOf(100); //自动装箱
		//ii = Integer.valueOf(ii.intValue() + 200); //自动拆箱，再自动装箱
		//System.out.println((new StringBuilder("ii:")).append(ii).toString());

		Integer iii = null;
		//NullPointerException
		if (iii != null) {
			iii += 1000;
			System.out.println(iii);
		}
	}
}
