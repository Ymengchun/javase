package Demo_03;

/*
 * 向上转型没有任何问题，但向下转型时可能发生类型转换异常。
 * 即向下转型的的程序可能不安全。
 * 采用泛型可以提高程序的安全性。
 * 
 * ClassCastException：两个类型转换时不兼容发生的异常。
 */
public class ObjectToolDemo {
	public static void main(String[] args) {
		ObjectTool ot = new ObjectTool();

		// 正常使用
		ot.setObj(new Integer(27));
		Integer i = (Integer) ot.getObj();
		System.out.println("年龄是：" + i);

		ot.setObj(new String("林青霞"));
		String s = (String) ot.getObj();
		System.out.println("姓名是：" + s);

		System.out.println("---------");
		ot.setObj(new Integer(30));
		
		//ClassCastException
		String ss = (String) ot.getObj();
		System.out.println("姓名是：" + ss);
	}
}
