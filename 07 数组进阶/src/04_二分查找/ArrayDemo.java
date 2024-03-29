package Demo_04;

/*
 * 查找：
 * 		无序顺序表：顺序查找
 * 		有序顺序表：左右查找
 * 
 * 分析：
 * 		1.定义最大索引，最小索引
 * 		2.计算出中间索引
 * 		3.拿中间索引的值和要查找的值比较
 * 			若相等：返回当前的中间索引
 * 			不相等：
 * 				大：左半边找——max = mid - 1;
 * 				小：右半边找——min = mid + 1；
 * 		4.重新计算出中间索引，返回第2步
 */
public class ArrayDemo {
	public static void main(String[] args) {
		//定义一个数组
		int[] arr = {11,22,33,44,55,66,77};
		
		//写功能实现
		int index = getIndex(arr, 33);
		System.out.println("index:"+index);
		
		//假如这个元素不存在后有什么现象呢?
		index = getIndex(arr, 333);
		System.out.println("index:"+index);
	}
	
	/*
	 * 两个明确：
	 * 返回值类型：int
	 * 参数列表：int[] arr,int value
	 */
	public static int getIndex(int[] arr,int value){
		//定义最大索引，最小索引
		int max = arr.length -1;
		int min = 0;
		
		//计算出中间索引
		int mid = (max +min)/2;
		
		//拿中间索引的值和要查找的值进行比较
		while(arr[mid] != value){
			if(arr[mid]>value){
				max = mid - 1;
			}else if(arr[mid]<value){
				min = mid + 1;
			}
			
			//加入判断
			if(min > max){
				return -1;
			}
			
			mid = (max + min)/2;
		}
		
		return mid;
	}
}
