package Demo_03;

import java.util.Scanner;

/*
 * 猜数字小游戏
 * 产生一个1~100的随机数：int number = (int) (Math.random() * 100) + 1;
 */
public class GuessNumberGame {
	private GuessNumberGame() {
	}

	public static void start() {
		//产生一个1~100的随机数
		int number = (int) (Math.random() * 100) + 1;

		while (true) {
			//键盘录入数据
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入你要猜的数据(1-100)：");
			int guessNumber = sc.nextInt();

			//判断
			if (guessNumber > number) {
				System.out.println("你猜的数据" + guessNumber + "大了");
			} else if (guessNumber < number) {
				System.out.println("你猜的数据" + guessNumber + "小了");
			} else {
				System.out.println("恭喜你，猜中了");
				break;
			}
		}
	}
}
