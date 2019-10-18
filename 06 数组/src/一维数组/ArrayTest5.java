/*
	需求：查找指定元素第一次在数组中出现的索引
	
	分析：
		1.定义一个数组，并静态初始化。
		2.写一个功能实现
			遍历数组，依次获取数组中的每一个元素，和已知的数据进行比较
			如果相等，就返回当前的索引值。
*/
class ArrayTest5 {
	public static void main(String[] args) {
		//定义一个数组，并静态初始化
		int[] arr = {200,250,38,888,444};
		
		//需求：我要查找250在这个数组中第一次出现的索引
		int index = getIndex(arr,250);
		System.out.println("250在数组中第一次出现的索引是："+index);
		
		int index2 = getIndex2(arr,250);
		System.out.println("250在数组中第一次出现的索引是："+index2);
		
		int index3 = getIndex2(arr,2500);
		System.out.println("2500在数组中第一次出现的索引是："+index3);
	}
	
	//方法一
	public static int getIndex(int[] arr,int value) {
		//遍历数组，依次获取数组中的每一个元素，和已知的数据进行比较
		for(int x=0; x<arr.length; x++) {
			if(arr[x] == value) {
				//如果相等，就返回当前的索引值。
				return x;
			}
		}
		
		//如果找不到数据，返回-1（一定要考虑类似这样的特殊情况）
		return -1;
	}
	
	
	//方法二
	public static int getIndex2(int[] arr,int value) {
		//定义一个索引
		int index = -1;
		
		//有就修改索引值
		for(int x=0; x<arr.length; x++) {
			if(arr[x] == value) {
				index = x;
				break;
			}
		}
		
		//返回index
		return index;
	}
}