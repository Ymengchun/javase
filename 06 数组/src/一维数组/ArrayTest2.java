/*
	需求：数组获取最值
	
	分析：
		1.定义一个数组，先静态初始化。
		2.选择首元素，默认它为当前最大值。
		3.遍历其他元素，依次与当前最大值比较，谁大谁就变为当前最大值。
		4.输出最大值。
*/
class ArrayTest2 {
	public static void main(String[] args) {
		//定义一个数组
		int[] arr = {34,98,10,25,67};
		
		/*
		开始时，选择首元素为当前最大值
		int max = arr[0];
		遍历其他的元素
		for(int x=1; x<arr.length; x++) {
			遍历其他元素，依次与当前最大值比较，谁大谁就变为当前最大值。
			if(arr[x] > max) {
				max = arr[x];
			}
		}
		输出最大值
		System.out.println("max:"+max);
		*/
		
		//用方法调用获取最大值
		int max = getMax(arr);
		System.out.println("max:"+max);
			
		//用方法调用获取最小值
		int min = getMin(arr);
		System.out.println("min:"+min);
	}
	
	//获取最大值的方法
	public static int getMax(int[] arr) {
		int max = arr[0];
		for(int x=1; x<arr.length; x++) {
			if(arr[x] > max) {
				max = arr[x];
			}
		}
		return max;
	}
	
	//获取最小值的方法
	public static int getMin(int[] arr) {
		int min = arr[0];
		for(int x=1; x<arr.length; x++) {
			if(arr[x] < min) {
				min = arr[x];
			}
		}
		return min;
	}
}