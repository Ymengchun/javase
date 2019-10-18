package Demo_02;

/**
 * 学生描述类
 * 
 * @author Ymengchun
 * @version V1.0
 */
public class Student {
	//姓名
	private String name;
	//年龄
	private int age;

	public Student() {
		super();
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
