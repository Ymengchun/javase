package cn.itcast_01;

import java.util.Calendar;

/*
 * Calendar:��Ϊ�ض�˲����һ������ YEAR��MONTH��DAY_OF_MONTH��HOUR �� �����ֶ�֮���ת���ṩ��һЩ��������Ϊ���������ֶΣ������������ڵ����ڣ��ṩ��һЩ������
 * 
 * public int get(int field):���ظ��������ֶε�ֵ���������е�ÿ�������ֶζ��Ǿ�̬�ĳ�Ա������������int���͡�
 */
public class CalendarDemo {
	public static void main(String[] args) {

		Calendar rightNow = Calendar.getInstance(); // ��ȡ��ǰ������ʱ��

		// ��ȡ��ǰ���
		int year = rightNow.get(Calendar.YEAR);
		// ��ȡ��ǰ�·ݵ�ǰһ���·�
		int month = rightNow.get(Calendar.MONTH);
		// ��ȡ��ǰ����
		int date = rightNow.get(Calendar.DATE);

		System.out.println(year + "��" + (month + 1) + "��" + date + "��");
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
