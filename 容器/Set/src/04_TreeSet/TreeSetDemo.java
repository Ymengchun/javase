package Demo_05;

import java.util.TreeSet;

/*
 * TreeSet：能够对元素按某种规则排序。
 * TreeSet的特点：排序、唯一
 * 排序有两种方式
 * 	1.自然排序：数字按大小排序，字符串按字典顺序排序，自定义对象按成员变量排序
 * 	2.比较器排序
 * 
 * 案例：自然排序
 */
public class TreeSetDemo {
	public static void main(String[] args) {
		//创建集合对象
		//按自然顺序排序
		TreeSet<Integer> ts = new TreeSet<Integer>();

		//创建元素并添加：20,18,23,22,17,24,19,18,24
		ts.add(20);
		ts.add(18);
		ts.add(23);
		ts.add(22);
		ts.add(17);
		ts.add(24);
		ts.add(19);
		ts.add(18);
		ts.add(24);

		//遍历
		for (Integer i : ts) {
			System.out.println(i);
		}
	}
}