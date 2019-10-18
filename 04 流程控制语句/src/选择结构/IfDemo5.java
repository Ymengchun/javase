package s9_选择结构;

/*
		if(比较表达式1) {
			语句体1;
		}else if(比较表达式2) {
			语句体2;
		}else if(比较表达式3) {
			语句体3;
		}
		...
		else {
			语句体n+1;
		}
		
	执行流程：
		先计算比较表达式1,看返回值是true还是false
		如果是true，就执行语句体1，if语句结束
		如果是false，计算比较表达式2，看其返回值是true还是false
		
		如果是true，就执行语句体2，if语句结束。
		如果是false，就计算比较表达式3，看其返回值是true还是false，
		...
		如果都是false，就执行语句体n+1。
*/
import java.util.Scanner;

class IfDemo5 {
	public static void main(String[] args) {
		//需求：键盘录入一个成绩，判断并输出成绩的等级。
		/*
			90-100 优秀
			80-90  好
			70-80  良
			60-70  及格
			0-60   不及格
		*/
		
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		
		//录入数据
		System.out.println("请输入你的考试成绩：");
		int score = sc.nextInt();
		
		/*
		未改进
		if(score>=90 && score<=100) {
			System.out.println("优秀");
		}else if(score>=80 && score<90) {
			System.out.println("好");
		}else if(score>=70 && score<80) {
			System.out.println("良");
		}else if(score>=60 && score<70) {
			System.out.println("及格");
		}else {
			System.out.println("不及格");
		}
		*/

		//改进
		//在测试程序的时候，要考虑这样几个问题：
		//正确数据，错误数据，边界数据。


		if(score<0 || score>100) {
			System.out.println("你输入的成绩有误");
		}else if(score>=90 && score<=100) {
			System.out.println("优秀");
		}else if(score>=80 && score<90) {
			System.out.println("好");
		}else if(score>=70 && score<80) {
			System.out.println("良");
		}else if(score>=60 && score<70) {
			System.out.println("及格");
		}else {
			System.out.println("不及格");
		}
	}
}