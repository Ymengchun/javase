/*
	数组的静态初始化：
			数据类型[] 数组名 = {元素1,元素2,…};
			举例：
				int[] arr = {1,2,3};
			注意：
				不要同时动态和静态进行。如：
					int[] arr = new int[3]{1,2,3}; //错误
*/
class ArrayDemo5 {
	public static void main(String[] args) {
		//定义数组
		int[] arr = {1,2,3};
		
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
	}
}