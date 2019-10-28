package Exception_05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 有些异常我们处理不了，或者我们不想处理，只需抛出异常即可
 * 格式：
 * 		throws 异常类名
 * 		注意：throws只能跟在方法的括号后面。throws后可以跟多个异常名
 * 
 * 注意：
 * 		尽量不要在main方法后使用。
 * 		但是我讲课为了方便我就这样做了。
 * 
 * 小结：
 * 		编译期异常抛出，将来调用者必须处理。
 * 		运行期异常抛出，将来调用可以不用处理。
 */

public class ExceptionDemo {
	public static void main(String[] args) {
		System.out.println("今天天气很好");
		try {
			method();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println("但是就是不该有雾霾");

		method2();
	}

	
	
	// 编译期异常的抛出
	// 在方法声明上抛出，是为了告诉调用者，你注意了，我有问题。
	public static void method() throws ParseException {
		String s = "2014-11-20";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date d = sdf.parse(s);
		System.out.println(d);
	}
	
	
	// 运行期异常的抛出
	public static void method2() throws ArithmeticException {
		int a = 10;
		int b = 0;
		System.out.println(a / b);
	}

	
	
	
}
