package cn.itcast_02;

/*
 * 枚举类实现自己的抽象方法
 */
public enum Direction3 {
	FRONT("前") {
		@Override
		public void show() {
			System.out.println("前");
		}
	},
	BEHIND("后") {
		@Override
		public void show() {
			System.out.println("后");
		}
	},
	LEFT("左") {
		@Override
		public void show() {
			System.out.println("左");
		}
	},
	RIGHT("右") {
		@Override
		public void show() {
			System.out.println("右");
		}
	};

	private String name;

	private Direction3(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public abstract void show();
}
