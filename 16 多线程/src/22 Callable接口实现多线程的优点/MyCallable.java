package Thread_10;

import java.util.concurrent.Callable;

/*
 * 案例：线程求和
 * 	解释：用Callable接口事实现多线程的一个好处就是，有返回值类型
 */
public class MyCallable implements Callable<Integer> {

	private int number;

	public MyCallable(int number) {
		this.number = number;
	}

	@Override
	public Integer call() throws Exception {
		int sum = 0;
		for (int x = 1; x <= number; x++) {
			sum += x;
		}
		return sum;
	}

}
