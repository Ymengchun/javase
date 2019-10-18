package Demo_06;

public class InterDemo {
	public static void main(String[] args) {
		//情况1的测试
		//Inter<String> i = new InterImpl();
		//i.show("hello");

		//情况2的测试
		Inter<String> i = new InterImpl<String>();
		i.show("hello");

		Inter<Integer> ii = new InterImpl<Integer>();
		ii.show(100);
	}
}
