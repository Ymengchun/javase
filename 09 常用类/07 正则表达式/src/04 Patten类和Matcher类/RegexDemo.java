package cn.itcast_05;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * ��ȡ����
 *		Pattern��Matcher���ʹ��
 *		
 *		ģʽ��ƥ�����Ļ���ʹ��˳��
 */
public class RegexDemo {
	public static void main(String[] args) {
	
		// 1.��������ʽ�����ģʽ����
		Pattern p = Pattern.compile("a*b");
		// 2.ͨ��ģʽ����õ�ƥ�����������ʱ����Ҫ���Ǳ�ƥ����ַ���
		Matcher m = p.matcher("aaaaab");
		// 3.����ƥ��������Ĺ���
		boolean b = m.matches();
		System.out.println(b);
		
		//���ϲ���ģʽ�����ƥ�����������������ʽƥ�䣬��Щ�鷳
		//����ֱ��ʹ���ַ���ƥ��
		boolean bb = "aaaab".matches("a.b");
		System.out.println(bb);
	}
}
