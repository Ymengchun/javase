package Exception_06;

/*
 * throw:���á����׳��쳣���÷������ڷ����У������Ƿ������׳��쳣���󣬶������쳣�ࡣ
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
			throw new ArithmeticException();	//�׳��쳣����
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
