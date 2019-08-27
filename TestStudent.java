public class TestStudent {
	public static void main(String[] args) {
		//不能通过new来构造对象，这样会生成两个不同的对象，而不是单例
		//应当调用公共方法
		//Student s1 = new Student();
		//Student s2 = new Student();
		//System.out.println(s1 == s2);	//false
		
		
		//调用公共方法保证单例
		Student s1 = Student.getStudent();
		Student s2 = Student.getStudent();
		System.out.println(s1 == s2);	//true
	}
}

class Student {
	//1、构造方法私有化
	private Student(){
	}
	
	//2、在成员位置自己创建一个对象；
	//静态对象才能调用静态方法，加static
	//为了不让外界访问此对象，加private
	private static Student s = new Student();  //饿汉式，类一加载就创建对象
	
	//3、提供一个公共方法
	//为了保证外部能调用，加static
	public static Student getStudent() {
		return s;
	}
}
