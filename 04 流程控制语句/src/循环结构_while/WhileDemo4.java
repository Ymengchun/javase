package s3_循环结构_while;
/*
	while循环和for循环的适用场景?
		1.如果想在循环结束后，继续使用控制条件的那个变量，用while循环，否则用for循环。不知道用for循环。
		2.知道遍历范围，用for循环；不知道用while循环				
*/
class WhileDemo4 {
	public static void main(String[] args) {
		//for循环实现
		for(int x=0; x<10; x++) {
			System.out.println("学习Java技术哪家强,中国北京传智播客");
		}
		//这里不能在继续访问了
		//System.out.println(x);
		
		//while循环实现
		int y = 0;
		while(y<10) {
			System.out.println("学习Java技术哪家强,中国北京传智播客");
			y++;
		}
		//这里是可以继续访问的
		System.out.println(y);
	}
} 