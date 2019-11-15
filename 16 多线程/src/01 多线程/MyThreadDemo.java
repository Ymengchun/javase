package Thread_01;

/*
 *	进程：
 *		正在运行的程序，是系统进行资源分配和调用的独立单位。
 *		每一个进程都有它自己的内存空间和系统资源。
 *	线程：
 *		是进程中的单个顺序控制流，是一条执行路径
 *		单线程程序：一个进程只有一条执行路。
 *		多线程进程：一个进程有多条执行路径。例：游戏中既有画面又有音乐。
 *
 *  举例：
 *  	扫雷程序，迅雷下载
 *  
 *  并行和并发
 *		并发：某一时间间隔内同时运行多个程序。
 *		并行：某一时刻同时运行多个程序。
 *
 * Java程序的运行原理：
 * 		java命令启动JVM，JVM启动就相当于启动一个进程。
 * 		由该进程创建一个主线程去调用main方法。
 * 
 * 思考题：
 * 		jvm虚拟机的启动是单线程还是多线程？
 * 			多线程。
 * 			原因：垃圾回收线程也要先启动，否则会出现内存溢出。
 * 				故至少有两个线程：主线程+垃圾回收线程。
 * 			
 */

public class MyThreadDemo {
	public static void main(String[] args) {
		System.out.println("hello");
		new Object();
		new Object();
		new Object();
		new Object();
		//...
		System.out.println("world");
	}
}
