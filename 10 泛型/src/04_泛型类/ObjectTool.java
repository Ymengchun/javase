package Demo_04;

/*
 * 泛型类：把泛型定义在类上
 * 		public class 类名<泛型类型1, 泛型类型2..>
 * 
 * 案例：写一个泛型类
 */
public class ObjectTool<T> {
	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
}
