package cn.itcast_06;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;


//InvocationHandler接口：声明了invoke()方法，其实现类需要实现invoke()方法

public class MyInvocationHandler implements InvocationHandler {
	private Object target; // 目标对象，请求动态代理的那个对象；操作是代理进行的，但调用还是目标对象

	public MyInvocationHandler(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("权限校验");
		Object result = method.invoke(target, args);
		System.out.println("日志记录");
		return result; // 返回的是动态代理对象
	}
}
