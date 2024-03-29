package Demo_07;

/*
 * 统计大串中小串出现的次数
 * 举例：统计字符串"woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun"中"Java"出现的次数。
 * 分析：
 *		1.定义一个统计变量count，初始化为0
 * 		2.先在大串中查找小串第一次出现的位置
 * 			a：索引是-1，说明不存在了，就返回统计变量
 * 			b：索引不是-1，说明存在，统计变量++
 * 		3.把刚才的索引+小串的长度作为开始位置截取上一次的大串，返回一个新的字符串，并把该字符串的值重新赋值给大串
 * 		4.回到第2步
 */
public class StringTest5 {
	public static void main(String[] args) {
		//定义大串
		String maxString = "woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun";
		//定义小串
		String minString = "java";

		//写功能实现
		int count = getCount(maxString, minString);
		System.out.println("Java在大串中出现了：" + count + "次");
	}

	/*
	 * 两个明确： 返回值类型：int 参数列表：两个字符串
	 */
	public static int getCount(String maxString, String minString) {
		//定义一个统计变量，初始化值是0
		int count = 0;
		int index;
		
		//先查，赋值，判断
		while((index = maxString.indexOf(minString)) != -1){
			count++;
			maxString = maxString.substring(index + minString.length());	//链式编程
		}

		return count;
	}
}
