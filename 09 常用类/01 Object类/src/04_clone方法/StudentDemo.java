package Demo_04;

/*
 *	protected void finalize()���������ڶԸö���ĸ�������ʱ�����ô˷��������������գ����ǻ��յľ���ʱ�䲻ȷ��
 *	protected Object clone()�����������ش˶����һ��������
 *		ʹ�ã��ñ���¡����ʵ�� Cloneable�ӿڣ���дclone������
 *		Ҫ֪�������дclone����
 * 		clone()�ķ���ֵ������Object��ת��
 */
public class StudentDemo {
	public static void main(String[] args) throws CloneNotSupportedException {
		//����ѧ������
		Student s = new Student();
		s.setName("����ϼ");
		s.setAge(27);
		
		//��¡ѧ������
		Object obj = s.clone();	//clone()�ķ���ֵ������Object
		Student s2 = (Student)obj;	//ת��
		
		System.out.println(s.getName()+"---"+s.getAge());
		System.out.println(s2.getName()+"---"+s2.getAge());
		
		//��ǰ������
		Student s3 = s;
		System.out.println(s3.getName()+"---"+s3.getAge());
		System.out.println("---------");
		
		//��ʵ���������
		s3.setName("����");
		s3.setAge(30);
		System.out.println(s.getName()+"---"+s.getAge());
		System.out.println(s2.getName()+"---"+s2.getAge());
		System.out.println(s3.getName()+"---"+s3.getAge());
		
	}
}