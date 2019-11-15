package cn.itcast_06;

import java.lang.reflect.Proxy;

//改进：添加日志和校验权限
//动态代理：本来应该自己做的事情，请别人做，请的这个人就是动态代理。
//动态代理是在运行过程中的代理对象，也就是通过反射产生一个代理

public class Test {
	public static void main(String[] args) {
		// 1.没有添加日志和校验权限功能
		UserDao ud = new UserDaoImpl();
		ud.add();
		ud.delete();
		ud.update();
		ud.find();
		System.out.println("-----------");

		
		// 2.添加日志和校验权限功能
		// 创建一个动态代理对象
		// Proxy类中有一个方法可以创建动态代理对象：public static Object newProxyInstance(ClassLoader loader,Class<?>[]interfaces,InvocationHandler h)
		
		// 第三个参数要求创建一个InvocationHandler对象（代理对象）
		// 对ud对象做一个代理对象
		MyInvocationHandler handler = new MyInvocationHandler(ud);	//谁请求动态代理，参数就是谁（目标对象），这里是ud	
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
