package Demo_06;

/*
 * 泛型接口：把泛型定义在接口上
 * 		public Interface 接口名<泛型类型1, 泛型类型2...>
 */
public interface Inter<T> {
	public abstract void show(T t);
}