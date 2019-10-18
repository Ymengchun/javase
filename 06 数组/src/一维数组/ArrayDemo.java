/*
	数组：存储同一类型的多个元素的容器。
	
	定义格式：
		1.数据类型[] 数组名;
		2.数据类型 数组名[];
		推荐第1种
		
	举例：
		1.int[] a; 定义一个int类型的数组a变量
		2.int a[]; 定义一个int类型的a数组变量
		
、
	数组的初始化：为数组开辟内存空间，并为每个数组元素赋值
	初始化的方法
		1.动态初始化：只指定长度，由系统给出初始化值
		2.静态初始化：给出初始化值，由系统决定长度
			
	动态初始化的格式：
		数据类型[] 数组名 = new 数据类型[数组长度];
		举例：
		int[] arr = new int[3];	
		
	获取数组中的元素：数组名[索引]

*/
class ArrayDemo {
	public static void main(String[] args) {
		//定义一个数组
		//int[] a;
		//可能尚未初始化变量a
		//System.out.println(a);
		
		int[] arr = new int[3];
		/*
			左边：
				int:说明数组中的元素的数据类型是int类型
				[]:说明这是一个数组
				arr:是数组的名称
				
			右边：
				new:为数组分配内存空间。
				int:说明数组中的元素的数据类型是int类型
				[]:说明这是一个数组
				3:数组长度，其实也就是数组中元素的个数
		*/
		
		//数组名的实质：首元素的地址
		System.out.println(arr); //[I@175078b 地址值。

		//获取数组元素：数组名[索引];
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
	}
}