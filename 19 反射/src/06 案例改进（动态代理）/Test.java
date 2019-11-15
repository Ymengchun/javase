package cn.itcast_06;

import java.lang.reflect.Proxy;

//�Ľ��������־��У��Ȩ��
//��̬��������Ӧ���Լ��������飬����������������˾��Ƕ�̬����
//��̬�����������й����еĴ������Ҳ����ͨ���������һ������

public class Test {
	public static void main(String[] args) {
		// 1.û�������־��У��Ȩ�޹���
		UserDao ud = new UserDaoImpl();
		ud.add();
		ud.delete();
		ud.update();
		ud.find();
		System.out.println("-----------");

		
		// 2.�����־��У��Ȩ�޹���
		// ����һ����̬�������
		// Proxy������һ���������Դ�����̬�������public static Object newProxyInstance(ClassLoader loader,Class<?>[]interfaces,InvocationHandler h)
		
		// ����������Ҫ�󴴽�һ��InvocationHandler���󣨴������
		// ��ud������һ���������
		MyInvocationHandler handler = new MyInvocationHandler(ud);	//˭����̬������������˭��Ŀ����󣩣�������ud	
		UserDao proxy = (UserDao) Proxy.newProxyInstance(ud.getClass()
				.getClassLoader(), ud.getClass().getInterfaces(), handler);
		proxy.add();
		proxy.delete();
		proxy.update();
		proxy.find();
		System.out.println("-----------");

		StudentDao sd = new StudentDaoImpl();
		MyInvocationHandler handler2 = new MyInvocationHandler(sd);
		StudentDao proxy2 = (StudentDao) Proxy.newProxyInstance(sd.getClass()
				.getClassLoader(), sd.getClass().getInterfaces(), handler2);
		proxy2.login();
		proxy2.regist();
	}
}
