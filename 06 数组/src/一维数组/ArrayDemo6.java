/*
	数组操作的常见问题：
		ArrayIndexOutOfBoundsException：数组索引越界异常
			原因：访问了不存在的索引。
		
		NullPointerException：空指针异常
			原因：数组已经不指向堆内存了。而你还用数组名去访问元素。
*/
class ArrayDemo6 {
	public static void main(String[] args) {
		//定义数组
		int[] arr = {1,2,3};
		
		//越界异常
		//System.out.println(arr[3]);
	
		//空指针异常
		arr = null;
		System.out.println(arr[0]);
	}
}