package s6_跳转语句;
/*
	continue:继续
	
	只适用于：循环。不能用于条件语句。
		
	continue和break的区别：
		break:退出最近的一层循环
		continue:退出本次循环，进入下一次的循环
		
	练习题：
		for(int x=1; x<=10; x++) {
			if(x%3==0) {
				//在此处填写代码
			}
			System.out.println(“Java基础班”);
		}
		
		我想在控制台输出2次:“Java基础班“
			break;
		我想在控制台输出7次:“Java基础班“
			continue;
		我想在控制台输出13次:“Java基础班“	
			System.out.println(“Java基础班”);


*/
class ContinueDemo {
	public static void main(String[] args) {
		for(int x=0; x<10; x++) {
			if(x == 3) {
				//break;
				continue;
			}
			
			System.out.println(x);
		}
	}
}