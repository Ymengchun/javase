package Demo_04;

/*
 *	protected void finalize()：当不存在对该对象的更多引用时，调用此方法用于垃圾回收，但是回收的具体时间不确定
 *	protected Object clone()：创建并返回此对象的一个副本。
 *		使用：让被克隆的类实现 Cloneable接口，重写clone方法。
 *		要知道如何重写clone方法
 * 		clone()的返回值类型是Object，转型
 */
public class StudentDemo {
	public static void main(String[] args) throws CloneNotSupportedException {
		//创建学生对象
		Student s = new Student();
		s.setName("林青霞");
		s.setAge(27);
		
		//克隆学生对象
		Object obj = s.clone();	//clone()的返回值类型是Object
		Student s2 = (Student)obj;	//转型
		
		System.out.println(s.getName()+"---"+s.getAge());
		System.out.println(s2.getName()+"---"+s2.getAge());
		
		//以前的做法
		Student s3 = s;
		System.out.println(s3.getName()+"---"+s3.getAge());
		System.out.println("---------");
		
		//其实是有区别的
		s3.setName("刘意");
		s3.setAge(30);
		System.out.println(s.getName()+"---"+s.getAge());
		System.out.println(s2.getName()+"---"+s2.getAge());
		System.out.println(s3.getName()+"---"+s3.getAge());
		
	}
}