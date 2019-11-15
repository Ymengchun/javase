package cn.itcast.test;

import java.io.FileReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

/*
 * 通过配置文件运行类中的方法
 * 
 * 反射：
 * 	配置文件由键值对构成，键固定不变，值可以改变	
 * 		
 * 		
 * 			
 * 			
 */
public class Test {
	public static void main(String[] args) throws Exception {
		// 反射前的做法
		// Student s = new Student();
		// s.love();
		// Teacher t = new Teacher();
		// t.love();
		// Worker w = new Worker();
		// w.love();

		// 反射后的做法
		// 加载键值对
		Properties prop = new Properties();
		FileReader fr = new FileReader("class.txt");	//配置文件class.txt
		prop.load(fr);
		fr.close();

		// 获取数据
		String className = prop.getProperty("className");
		String methodName = prop.getProperty("methodName");

		// 反射
		Class c = Class.forName(className);

		Constructor con = c.getConstructor();
		Object obj = con.newInstance();

		// 调用方法
		Method m = c.getMethod(methodName);
		m.invoke(obj);
	}
}