package cn.itcast_02;

// 枚举类常见方法

public class EnumMethodDemo {
	public static void main(String[] args) {
		// int compareTo(E o)：比较
		Direction2 d21 = Direction2.FRONT;
		Direction2 d22 = Direction2.BEHIND;
		Direction2 d23 = Direction2.LEFT;
		Direction2 d24 = Direction2.RIGHT;
		System.out.println(d21.compareTo(d21));
		System.out.println(d21.compareTo(d24));
		System.out.println(d24.compareTo(d21));
		System.out.println("---------------");

		// String name()：枚举项名
		System.out.println(d21.name());
		System.out.println(d22.name());
		System.out.println(d23.name());
		System.out.println(d24.name());
		System.out.println("--------------");

		// int ordinal()：枚举项序数
		System.out.println(d21.ordinal());
		System.out.println(d22.ordinal());
		System.out.println(d23.ordinal());
		System.out.println(d24.ordinal());
		System.out.println("--------------");

		// String toString()：默认返回枚举项名，可以重写
		System.out.println(d21.toString());
		System.out.println(d22.toString());
		System.out.println(d23.toString());
		System.out.println(d24.toString());
		System.out.println("--------------");

		// <T> T valueOf(Class<T> type,String name)：返回指定名称的指定枚举类型的枚举常量
		Direction2 d = Enum.valueOf(Direction2.class, "FRONT");
		System.out.println(d.getName());
		System.out.println("----------------");

		// values()：返回枚举项的数组
		// 此方法虽然在JDK文档中查找不到，但每个枚举类都具有该方法，它遍历枚举类的所有枚举值非常方便
		Direction2[] dirs = Direction2.values();
		for (Direction2 d2 : dirs) {
			System.out.println(d2);	// 默认toString()
			System.out.println(d2.getName());
		}
	}
}
