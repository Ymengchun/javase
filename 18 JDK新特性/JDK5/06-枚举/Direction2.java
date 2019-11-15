package cn.itcast_02;

/*
 * 使用含参构造函数的枚举类
 */
public enum Direction2 {
	FRONT("前"), BEHIND("后"), LEFT("左"), RIGHT("右");

	private String name;	//必须是私有

	private Direction2(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	// toString()默认返回枚举项的名字，可以重写
	// @Override
	// public String toString() {
	// return "我爱林青霞";
	// }
}
