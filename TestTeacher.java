public class TestTeacher {
	public static void main(String[] args) {
		Teacher t1 = Teacher.getTeacher();
		Teacher t2 = Teacher.getTeacher();
		System.out.println(t1 == t2);
		System.out.println(t1); //Pattern_04.Teacher@1db9742
		System.out.println(t2); //Pattern_04.Teacher@1db9742
	}
}

class Teacher {
	//1.构造方法私有化
	private Teacher() {
	}
	
	//2.创建一个空对象
	private static Teacher t = null;	//懒汉式：加载完类后不立刻创建对象，用的时候再创建

	//3.构造方法私有化
	public synchronized static Teacher getTeacher() {
		//第一次t对象是null，可以进来，创建一个新对象
		//创建完后就不是null了，以后就进不来了，这保证了只有一个对象（单例）
		if(t == null) {
			t = new Teacher();	//用的时候才new
		}
		return t;
	}
}
