/*
	�����ڲ����ڿ����е�ʹ��
*/

interface Person {
	public abstract void study();
}

class PersonDemo {
	//�ӿ�����Ϊ��ʽ����
	public void method(Person p) {
		p.study();
	}
}

//ʵ����
class Student implements Person {
	public void study() {
		System.out.println("�ú�ѧϰ,��������");
	}
}

class InnerClassTest2 {
	public static void main(String[] args) {
		//����
		PersonDemo pd = new PersonDemo();
		Person p = new Student();
		pd.method(p);
		System.out.println("--------------------");
		
		//�����ڲ����ڿ����е�ʹ��
		//�����ڲ���ı��ʣ��̳����ʵ�ֽӿڵ�������������
		//�����ڲ�������� = ʵ����
		pd.method(new Person(){
			public void study() {
				System.out.println("�ú�ѧϰ,��������");
			}
		});
	}
}