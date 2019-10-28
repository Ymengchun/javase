package Demo_07;

/*
 * 统计大串中小串出现的次数
 * 举例：统计"woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun"中"Java"出现的次数
 * 
 * 分析：
 * 		前提：是已经知道了大串和小串。
 * 
 * 		1.定义一个统计变量count，初始化为0
 * 		2.先在大串中查找小串第一次出现的位置
 * 			a：索引是-1，说明不存在了，就返回统计变量
 * 			b：索引不是-1，说明存在，统计变量++
 * 		3.把刚才的索引+小串的长度作为开始位置截取上一次的大串，返回一个新的字符串，并把该字符串的值重新赋值给大串
 * 		4.回到第2步
 */
public class StringTest4 {
	public static void main(String[] args) {
		//定义大串
		String maxString = "woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun";
		//定义小串
		String minString = "java";

		//写功能实现
		int count = getCount(maxString, minString);
		System.out.println("Java在大串中出现了：" + count + "次");
	}

	//统计小串出现次数的方法
	public static int getCount(String maxString, String minString) {
		//定义一个统计变量，初始化值是0
		int count = 0;

		//先在大串中查找小串第一次出现的位置
		int index = maxString.indexOf(minString);

		//索引不是-1，说明存在，统计变量++
		while (index != -1) {
			count++;
			//截取剩下的字符串
			//把刚才的索引+小串的长度作为开始位置截取上一次的大串，返回一个新的字符串，并把该字符串的值重新赋值给大串
			int startIndex = index + minString.length();	//子串开始的索引
			maxString = maxString.substring(startIndex);
			//继续查
			index = maxString.indexOf(minString);
		}

		return count;
	}
}
