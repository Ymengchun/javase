package cn.itcast_01;

import java.math.BigInteger;

/*
 * BigInteger:�����ó���Integer��Χ�ڵ����ݽ�������
 * 
 * ���췽����
 * BigInteger(String val) 
 */
public class BigIntegerDemo {
	public static void main(String[] args) {

		BigInteger bi = new BigInteger("2147483648");
		System.out.println("bi:" + bi);
	}
}