package Exception_08;

/*
 * Java不可能考虑到所有异常情况，解决方法——自定义异常。
 * 自定义异常不能作为异常类，如果想要作为异常类，要继承Exception或RuntimeException
 * 
 * 两种方式：
 * A：继承Exception——编译要检查
 * B：继承RuntimeException——编译不用检查
 */

public class MyException extends Exception {	//继承自Exception
	public MyException() {
	}

	public MyException(String message) {
		super(message);		//继承Exception类的构造方法，自定义错误信息
	}
}

// public class MyException extends RuntimeException {		//继承自RuntimeException
//
// }