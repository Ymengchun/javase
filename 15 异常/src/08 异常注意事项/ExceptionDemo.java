package Exception_09;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 异常注意事项:
 * 1.子类重写父类方法时，子类的方法必须抛出相同的异常或父类异常的子类。(子类异常不能超过父类异常)
 * 2.如果父类抛出了多个异常，子类重写父类时，只能与父类相同的异常或父类异常的子集。（子类不能抛出父类没有的异常）
 * 3.父类方法没有抛出异常，继承的子类方法也不能抛出异常。如果子类方法内有异常，那么子类只能try，不能throws。
 */

public class ExceptionDemo {

}

class Father {
	public void show() throws Exception {
	}

	public void method() {
	}
}

class Son extends Father {
	@Override
	public void show() throws ArithmeticException {

	}

	//@Override
	//public void method() throws Exception {	//报错，父类方法没有抛出异常，继承的子类方法也不能抛出异常
	//}

}