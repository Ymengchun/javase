package Demo_05;

/*
 * 测试方法重载
 */
public class ObjectToolDemo {
	public static void main(String[] args) {

		// 定义泛型方法后
		ObjectTool ot = new ObjectTool();
		ot.show("hello");
		ot.show(100);
		ot.show(true);
	}
}
