package Demo_02;

/*
 * hashcode：根据对象的地址或字符串或数字，采用某种方法计算出来的int类型的数值
 */
public class HashCodeDemo {
	public static void main(String[] args) {
		System.out.println("hello".hashCode());
		System.out.println("hello".hashCode());
		System.out.println("world".hashCode());
	}
}