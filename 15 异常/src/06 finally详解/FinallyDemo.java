package Exception_07;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * finally：finally中的语句一定会执行，但如果在执行到finally之前jvm退出了，就不能执行了。
 * 格式：try···catch···finally···
 * 作用：用于释放资源，在IO流操作和数据库操作中会见到
 */
public class FinallyDemo {
	public static void main(String[] args) {
		String s = "2014-11-20";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		Date d = null;
		try {
			// System.out.println(10 / 0);
			d = sdf.parse(s);
		} catch (ParseException e) {
			e.printStackTrace();
			System.exit(0);
		} finally {
			System.out.println("这里的代码是可以执行的");
		}

		System.out.println(d);
	}
}