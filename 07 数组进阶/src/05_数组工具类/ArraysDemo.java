package Demo_05;

import java.util.Arrays;

/*
 * Arrays：数组工具类
 * 	public static String toString(int[] a)：把数组转成字符串
 *	public static void sort(int[] a)：对数组进行排序
 * 	public static int binarySearch(int[] a,int key)：二分查找
 */
public class ArraysDemo {
	public static void main(String[] args) {
		//定义一个数组
		int[] arr = { 24, 69, 80, 57, 13 };

		//public static String toString(int[] a)：把数组转成字符串
		System.out.println("排序前：" + Arrays.toString(arr)); 

		//public static void sort(int[] a)：对数组进行排序
		Arrays.sort(arr);
		System.out.println("排序后：" + Arrays.toString(arr));

		
		//[13, 24, 57, 69, 80]
		//public static int binarySearch(int[] a,int key)：二分查找（使用之前必须先排序）
		System.out.println("binarySearch:" + Arrays.binarySearch(arr, 57));
		System.out.println("binarySearch:" + Arrays.binarySearch(arr, 577));	//返回负值说明没找到
	}
}