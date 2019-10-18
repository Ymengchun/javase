package Demo_06;

//实现类在实现接口的时候
//情况1：已经知道接口的类型
//public class InterImpl implements Inter<String> {	//不使用泛型
//	@Override
//	public void show(String t) {
//		System.out.println(t);
//	}
//}

//情况2：不知道接口的类型
public class InterImpl<T> implements Inter<T> {	//使用泛型
	@Override
	public void show(T t) {
		System.out.println(t);
	}
}