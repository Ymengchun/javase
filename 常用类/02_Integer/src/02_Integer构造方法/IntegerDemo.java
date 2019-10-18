package Demo_02;

/*
 * Integer的构造方法：
 * 	public Integer(int value)
 * 	public Integer(String s)	注意：字符串必须只有数字字符组成，否则会抛出NumberFormatException异常
 */
public class IntegerDemo {
	public static void main(String[] args) {
		//方式1
		int i = 100;
		Integer ii = new Integer(i);
		System.out.println("ii:" + ii);

		//方式2
		String s = "100";
		
		//NumberFormatException
		//String s = "abc";
		Integer iii = new Integer(s);
		System.out.println("iii:" + iii);
	}
}
