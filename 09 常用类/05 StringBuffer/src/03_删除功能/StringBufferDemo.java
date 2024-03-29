package Demo_03;

/*
 * StringBuffer的删除功能
 * 		1、public StringBuffer deleteCharAt(int index)：删除指定位置的字符，并返回本身
 * 		2、public StringBuffer delete(int start, int end)：删除从指定位置开始指定位置结束的内容，并返回本身
 */
public class StringBufferDemo {
	public static void main(String[] args) {
		//创建对象
		StringBuffer sb = new StringBuffer();

		//添加功能
		sb.append("hello").append("world").append("java");
		System.out.println("sb:" + sb);

		//需求：删除e
		//sb.deleteCharAt(1);

		//需求：删除world
		//sb.delete(5, 10);

		//需求:删除所有的数据
		sb.delete(0, sb.length());

		System.out.println("sb:" + sb);
	}
}
