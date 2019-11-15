package Thread_12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;
import java.util.Vector;

public class ThreadDemo {
	public static void main(String[] args) {
		//线程安全的类
		StringBuffer sb = new StringBuffer();
		Vector<String> v = new Vector<String>();
		Hashtable<String, String> h = new Hashtable<String, String>();

		//Vector是线程安全的，但即使Vector线程安全，也不建议用，而用synchronizedList
		//public static <T> List<T> synchronizedList(List<T> list)
		List<String> list1 = new ArrayList<String>();// 线程不安全
		List<String> list2 = Collections.synchronizedList(new ArrayList<String>()); //线程安全
	}
}
