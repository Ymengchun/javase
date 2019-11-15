package cn.itcast_06;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;


//InvocationHandler�ӿڣ�������invoke()��������ʵ������Ҫʵ��invoke()����

public class MyInvocationHandler implements InvocationHandler {
	private Object target; // Ŀ���������̬������Ǹ����󣻲����Ǵ�����еģ������û���Ŀ�����

	public MyInvocationHandler(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("Ȩ��У��");
		Object result = method.invoke(target, args);
		System.out.println("��־��¼");
		return result; // ���ص��Ƕ�̬�������
	}
}
