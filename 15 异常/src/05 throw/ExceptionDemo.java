package Exception_06;

/*
 * throw:作用——抛出异常。用法——在方法中，而不是方法后；抛出异常对象，而不是异常类。
 * 
 */

public class ExceptionDemo {
	public static void main(String[] args) {
		// method();
		
		try {
			method2();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void method() {
		int a = 10;
		int b = 0;
		if (b == 0) {
			throw new ArithmeticException();	//抛出异常对象
		} else {
			System.out.println(a / b);
		}
	}

	public static void method2() throws Exception {
		int a = 10;
		int b = 0;
		if (b == 0) {
			throw new Exception();
		} else {
			System.out.println(a / b);
		}
	}
}
