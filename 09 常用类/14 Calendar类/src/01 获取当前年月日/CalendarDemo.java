package cn.itcast_01;

import java.util.Calendar;

/*
 * Calendar:它为特定瞬间与一组诸如 YEAR、MONTH、DAY_OF_MONTH、HOUR 等 日历字段之间的转换提供了一些方法，并为操作日历字段（例如获得下星期的日期）提供了一些方法。
 * 
 * public int get(int field):返回给定日历字段的值。日历类中的每个日历字段都是静态的成员变量，并且是int类型。
 */
public class CalendarDemo {
	public static void main(String[] args) {

		Calendar rightNow = Calendar.getInstance(); // 获取当前的日历时间

		// 获取当前年份
		int year = rightNow.get(Calendar.YEAR);
		// 获取当前月份的前一个月份
		int month = rightNow.get(Calendar.MONTH);
		// 获取当前日期
		int date = rightNow.get(Calendar.DATE);

		System.out.println(year + "年" + (month + 1) + "月" + date + "日");
	}
}

/*
 * abstract class Person { public static Person getPerson() { return new
 * Student(); } }
 * 
 * class Student extends Person {
 * 
 * }
 */
