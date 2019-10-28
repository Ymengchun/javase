package Demo_02;

import java.util.HashSet;

/*
 * hashCode()的作用：
 * 		提高访问速度（散列表）
 * 为什么HashSet能保证字符串唯一？
 * 		1.HashSet的add()方法底层依赖于：hashCode()、equals()
 * 		2.只有hashCode()和equals()都相同时，才能保证是同一个对象。
 * HashSet()判断元素是否相同的步骤：	
 * 		先判断hashCode()是否相同
 * 			相同：说明地址相同，再判断equals()是否相同
 * 				 返回true：元素重复，不添加
 * 				 返回false：元素不重复，添加
 * 			不同：添加
 * 
 * 
 * 说明：
 * 		Object：
 * 		1.equals()：比较两对象的地址是否相同（是否为同一个对象），此时和 == 的功能一样。地址相同——返回true，地址不同——返回false。
 * 		2.hashCode()：计算哈希值。不同的对象哈希值不同（一般是根据对象的地址返回）
 * 		3.toString()：类名 + @ + 十六进制hashCode值。
 * 		
 * 		重写后：
 * 		1.equals()：比较两对象的属性。属性相同——返回true，属性不同——返回false。
 * 			例如：String类重写equals()方法后，可以比较两个字符串的内容是否相同。
 * 				 如果没有重写，equals()和==的功能一样，就无法比较字符串的内容。
 * 		2.hashCode()：计算哈希值。
 * 		3.toString()：属性的拼接（可以自定义）
 * 
 * 重写equals()和hashCode()时注意：
 * 		1.成对重写：重写equals()就应当重写 hashcode()
 * 		2.equals()为true，hashCode()一定为true：
 * 		  hashCode()为true，equals()不一定为true：冲突（见数据结构-散列表）
 * 
 * 案例：String类重写了equals()和hashCode()，使用HashSet添加元素时可以去重。
 */
public class HashSetDemo {
	public static void main(String[] args) {
		//创建集合对象
		HashSet<String> hs = new HashSet<String>();

		//创建并添加元素
		hs.add("hello");
		hs.add("world");
		hs.add("java");
		hs.add("world");

		//遍历集合
		for (String s : hs) {
			System.out.println(s);
		}
	}
}
