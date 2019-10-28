package Exception_08;

public class Teacher {
	public void check(int score) throws MyException {
		if (score > 100 || score < 0) {
			throw new MyException("分数必须在0-100之间！");	//抛出自定义异常类的对象
		} else {
			System.out.println("分数没有问题");
		}
	}

	// 若 MyException继承自 RuntimeException，就不需要 throws MyException，因为 RuntimeException是运行时异常，编译不用检查
	// public void check(int score) {	//这里不用throws MyException
	// if (score > 100 || score < 0) {
	// throw new MyException();
	// } else {
	// System.out.println("分数没有问题");
	// }
	// }
}
