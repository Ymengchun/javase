/*
	数组遍历：依次输出数组中的每一个元素。
	
	数组名.length：获取数组长度
*/
class ArrayTest {
	public static void main(String[] args) {
		//定义数组
		int[] arr = {11,22,33,44,55};
		
		//获取每一个元素
		for(int x=0; x<arr.length; x++) {
			System.out.println(arr[x]);
		}
		System.out.println("--------------------");
	}
		
	
	//将遍历方法封装
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