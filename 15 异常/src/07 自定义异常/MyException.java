package Exception_08;

/*
 * Java�����ܿ��ǵ������쳣�����������������Զ����쳣��
 * �Զ����쳣������Ϊ�쳣�࣬�����Ҫ��Ϊ�쳣�࣬Ҫ�̳�Exception��RuntimeException
 * 
 * ���ַ�ʽ��
 * A���̳�Exception��������Ҫ���
 * B���̳�RuntimeException�������벻�ü��
 */

public class MyException extends Exception {	//�̳���Exception
	public MyException() {
	}

	public MyException(String message) {
		super(message);		//�̳�Exception��Ĺ��췽�����Զ��������Ϣ
	}
}

// public class MyException extends RuntimeException {		//�̳���RuntimeException
//
// }