package Demo_06;

public class InterDemo {
	public static void main(String[] args) {
		//���1�Ĳ���
		//Inter<String> i = new InterImpl();
		//i.show("hello");

		//���2�Ĳ���
		Inter<String> i = new InterImpl<String>();
		i.show("hello");

		Inter<Integer> ii = new InterImpl<Integer>();
		ii.show(100);
	}
}
