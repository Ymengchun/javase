/*
	案例：数组元素逆序 (就是把元素反转)
	
	分析：
		1.定义一个数组，静态初始化。
		2.思路
			把0索引和arr.length-1的数据交换
			把1索引和arr.length-2的数据交换
			...
			只要做到arr.length/2的时候即可。
*/
class ArrayTest3 {
	public static void main(String[] args) {
		//定义一个数组，静态初始化。
		int[] arr = {12,98,50,34,76};
		
		//逆序前
		System.out.println("逆序前：");
		printArray(arr);
		
		//逆序后
		System.out.println("逆序后：");
		//reverse(arr);	//一般方法
		reverse2(arr);	//双指针法
		printArray(arr);
	}
	
	//方法一：一般方法
	public static void reverse(int[] arr) {
		for(int x=0; x<arr.length/2; x++) {
			int temp = arr[x];
			arr[x] = arr[arr.length-1-x];
			arr[arr.length-1-x] = temp;
		}
	}
	
	//方法二：双指针法
	public static void reverse2(int[] arr) {
		for(int start=0, end=arr.length-1; start<=end; start++, end--) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
		}
	}
	
	//遍历数组
	public static void printArray(int[] arr) {
		System.out.print("[");
		for(int x=0; x<arr.length; x++) {
			if(x == arr.length-1) { //这是最后一个元素
				System.out.println(arr[x]+"]");
			}else {
				System.out.print(arr[x]+", ");
			}
		}
	}
}