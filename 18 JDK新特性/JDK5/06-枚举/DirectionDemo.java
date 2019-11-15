package cn.itcast_02;

/*
1.定义枚举类关键字：enum
2.所有枚举类都是Enum的子类
3.枚举类的第一行必须是枚举项，最后一个枚举项后的分号可以省略；如果枚举类中有除了枚举项
外的其它成分，则分号不能省略；建议不要省略
4.枚举类可以有构造器，但必须是private，它默认的也是private
5.枚举类可以有构造方法，但枚举项必须重写其方法
 */

public class DirectionDemo {
	public static void main(String[] args) {
		Direction d = Direction.FRONT;
		System.out.println(d); // FRONT

		// public String toString()返回枚举常量的名称，它包含在声明中，直接打印常量就会显示常量名称
		System.out.println("-------------");
		Direction2 d2 = Direction2.FRONT;
		System.out.println(d2);
		System.out.println(d2.getName());
		System.out.println("-------------");
		Direction3 d3 = Direction3.FRONT;
		System.out.println(d3);
		System.out.println(d3.getName());
		d3.show();
		System.out.println("--------------");

		Direction3 dd = Direction3.FRONT;
		dd = Direction3.LEFT;

		switch (dd) {
		case FRONT:
			System.out.println("你选择了前");
			break;
		case BEHIND:
			System.out.println("你选择了后");
			break;
		case LEFT:
			System.out.println("你选择了左");
			break;
		case RIGHT:
			System.out.println("你选择了右");
			break;
		}
	}
}