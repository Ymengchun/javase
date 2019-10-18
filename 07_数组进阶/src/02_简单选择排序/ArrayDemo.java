package Demo_02;

/*
 * 选择排序：
 */
public class ArrayDemo {
	public static void main(String[] args) {
		//定义一个数组
		int[] arr = { 24, 69, 80, 57, 13 };
		System.out.println("排序前：");
		printArray(arr);
		
		//排序后
		selectSort(arr);
		System.out.println("排序后：");
		printArray(arr);

	}
	
	//选择排序算法
	public static void selectSort(int[] arr){
		for(int x = 0; x < arr.length - 1; x++){
			for(int y=x+1; y < arr.length; y++){
				if(arr[y] < arr[x]){
					int temp = arr[x];
					arr[x] = arr[y];
					 arr[y] = temp;
				}
			}
		}
	}

	//遍历功能
	public static void printArray(int[] arr) {
		System.out.print("[");
		for (int x = 0; x < arr.length; x++) {
			if (x == arr.length - 1) {
				System.out.print(arr[x]);
			} else {
				System.out.print(arr[x] + ", ");
			}
		}
		System.out.println("]");
	}
}
