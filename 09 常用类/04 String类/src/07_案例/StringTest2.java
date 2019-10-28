package Demo_07;

/*
 * 需求：把数组中的数据按照指定个格式拼接成一个字符串，把方法封装。
 * 输入：
 * 		int[] arr = {1,2,3};	
 * 输出：
 *		"[1, 2, 3]"
 * 分析：
 * 		1.定义一个字符串对象，内容为空
 * 		2.先把字符串拼接一个"["
 * 		3.遍历int数组，得到每一个元素
 * 		4.先判断该元素是否为最后一个
 * 			是：就直接拼接元素和"]"
 * 			不是：就拼接元素和逗号以及空格
 * 		5.输出拼接后的字符串
 * 
 */
public class StringTest2 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };

		//写一个功能，实现结果
		String result = arrayToString(arr);
		System.out.println("最终结果是：" + result);
	}


	public static String arrayToString(int[] arr) {
		//定义一个字符串
		String s = "";

		//先把字符串拼接一个"["
		s += "[";

		//遍历int数组，得到每一个元素
		for (int x = 0; x < arr.length; x++) {
			//先判断该元素是否为最后一个
			if (x == arr.length - 1) {
				//就直接拼接元素和"]"
				s += arr[x];
				s += "]";
			} else {
				//就拼接元素和逗号以及空格
				s += arr[x];
				s += ", ";
			}
		}

		return s;
	}
}
