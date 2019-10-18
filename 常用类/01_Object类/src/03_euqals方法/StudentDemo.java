package Demo_03;

/*
 * public boolean equals(Object obj)�����������Ƿ���˶�����ȡ��� 
 * 		��дǰ��Ĭ����������Ƚϵ�ֵַ�Ƿ���ͬ����==����һ����
 *		��д�󣺱Ƚ϶���ĳ�Ա����ֵ�Ƿ���ͬ�������Ա����ֵ��ͬ����Ϊ����������ͬ���Զ����ɼ��ɡ�
 * 
 * ��Դ�룺
 * 		public boolean equals(Object obj) {
 * 			//this - s1
 * 			//obj - s2
 *       	return (this == obj);
 *   	}
 * 
 * ==��
 * 		�������ͣ��Ƚ�ֵ�Ƿ���ͬ��
 * 		�������ͣ��Ƚϵ�ַ�Ƿ���ͬ��
 * equals:
 * 		ֻ�����������ͣ�Ĭ������£��Ƚϵ�ַ�Ƿ���ͬ����==����һ��������д�󣬱Ƚ϶���ĳ�Ա����ֵ�Ƿ���ͬ��
 * 
 * ClassCastException��
 */
public class StudentDemo {
	public static void main(String[] args) {
		Student s1 = new Student("����ϼ", 27);
		Student s2 = new Student("����ϼ", 27);
		System.out.println(s1 == s2); //false
		Student s3 = s1;
		System.out.println(s1 == s3); //true
		System.out.println("---------------");

		System.out.println(s1.equals(s2)); //obj = s2; //false
		System.out.println(s1.equals(s1)); //true
		System.out.println(s1.equals(s3)); //true
		Student s4 = new Student("������",30);
		System.out.println(s1.equals(s4)); //false
		
		Demo d = new Demo();
		System.out.println(s1.equals(d)); //ClassCastException������ͬ��Ķ���equalsʱ�����

	}
}

class Demo {}