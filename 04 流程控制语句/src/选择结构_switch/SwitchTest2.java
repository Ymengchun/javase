package s1_选择结构_switch;

/*
	案例：模拟单项选择题
	
	分析：
		1.出一个选择题，然后供你选择。
		2.键盘录入
		3.根据选择来给出你选择的结论。
*/
import java.util.Scanner;

class SwitchTest2 {
	public static void main(String[] args) {
		//出一道选择题，给出多个选择
		System.out.println("下面的几个人你最爱谁?");
		System.out.println("1 林青霞");
		System.out.println("2 张曼玉");
		System.out.println("3 刘德华");
		System.out.println("4 王力宏");
		
		//键盘录入选择的数据。
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入你的选择：");
		int choiceNumber = sc.nextInt();
		
		//强制转换为字符类型
		char choice = (char) choiceNumber;
		
		switch(choice) {
			case 1:
				System.out.println("恭喜你,选择正确");
				break;
			case 2:
				System.out.println("不好意思，你选择有误");
				break;
			case 3:
				System.out.println("不好意思，你选择有误");
				break;
			case 4:
				System.out.println("不好意思，你选择有误");
				break;
			default:
				System.out.println("没有该选项");
				break;
		}
	}
}