package Exception_09;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * �쳣ע������:
 * 1.������д���෽��ʱ������ķ��������׳���ͬ���쳣�����쳣�����ࡣ(�����쳣���ܳ��������쳣)
 * 2.��������׳��˶���쳣��������д����ʱ��ֻ���븸����ͬ���쳣�����쳣���Ӽ��������಻���׳�����û�е��쳣��
 * 3.���෽��û���׳��쳣���̳е����෽��Ҳ�����׳��쳣��������෽�������쳣����ô����ֻ��try������throws��
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
	//public void method() throws Exception {	//�������෽��û���׳��쳣���̳е����෽��Ҳ�����׳��쳣
	//}

}