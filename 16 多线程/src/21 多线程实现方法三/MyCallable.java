package Thread_09;

import java.util.concurrent.Callable;

//实现多线程的第3种方法：实现Callable接口，这种方法依赖线程池。
//Callable：是一种带泛型的接口。
//这里指定的泛型其实是call()方法的返回值类型。
public class MyCallable implements Callable {

	@Override
	//重写call()方法
	public Object call() throws Exception {
		for (int x = 0; x < 100; x++) {
			System.out.println(Thread.currentThread().getName() + ":" + x);
		}
		return null;
	}

}
