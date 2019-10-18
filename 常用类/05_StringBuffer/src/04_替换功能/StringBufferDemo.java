package Demo_04;

/*
 * StringBuffer的替换功能：
 * 		public StringBuffer replace(int start, int end, String str)：从start开始到end用str替换
 */
public class StringBufferDemo {
	public static void main(String[] args) {
		//创建字符串缓冲区对象
		StringBuffer sb = new StringBuffer();

		//添加数据
		sb.append("hello");
		sb.append("world");
		sb.append("java");
		System.out.println("sb:" + sb);

		sb.replace(5, 10, "节日快乐");
		System.out.println("sb:" + sb);
	}
}
