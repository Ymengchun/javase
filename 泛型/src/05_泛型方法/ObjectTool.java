package Demo_05;



/*
 * 泛型方法：把泛型定义在方法上
 * 		public <泛型类型> 返回类型 方法名(泛型类型)
 */

//不用泛型方法，只依靠方法重载：累死你
//public class ObjectTool<T> {
//	public void show(String s) {
//		System.out.println(s);
//	}
// 	public void show(Integer i) {
// 		System.out.println(i);
// 	}
// 	public void show(Boolean b) {
// 		System.out.println(b);
// 	}

//使用泛型方法
public class ObjectTool {
	public <T> void show(T t) {
		System.out.println(t);
	}
}