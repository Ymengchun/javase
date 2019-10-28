package Exception_04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 如果try中有异常，jvm生成一个异常对象，抛出该对象，和catch中的错误类型逐个匹配。
 * 如果匹配成功，就执行对应catch中的处理信息。
 * 
 * 异常中要了解的几个方法：
 * public String getMessage()：获取异常信息，返回详细的异常信息字符串		
 * public String toString()：返回异常的简单信息描述，描述信息由三部分构成：
 * 		此对象的类的 name(全路径名)
 * 		": "（冒号和一个空格） 
 * 		调用此对象 getLocalizedMessage()方法的结果 (默认返回的是getMessage()的内容)
 * printStackTrace() 获取异常类名和异常信息，以及异常出现在程序中的位置。返回值void。把信息输出在控制台。
 */
public class ExceptionDemo {
	public static void main(String[] args) {
		String s = "2014-11-20";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			Date d = sdf.parse(s); // 创建了一个ParseException对象，然后抛出去，和catch里面进行匹配
			System.out.println(d);
		} catch (ParseException e) { 

			// getMessage()方法
			// 输入：System.out.println(e.getMessage());
			// 控制台输出：Unparseable date: "2014-11-20"
			
			

			// toString()方法
			// 输入：System.out.println(e.toString());
			// 控制台输出：java.text.ParseException: Unparseable date: "2014-11-20"
			
			
			//通常不用getMessage()和toString()方法，用printStackTrace()
			e.printStackTrace();

		}
		
		System.out.println("over");
	}
}
