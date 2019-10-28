package cn.itcast_01;

import java.math.BigInteger;

/*
 * BigInteger:可以让超过Integer范围内的数据进行运算
 * 
 * 构造方法：
 * BigInteger(String val) 
 */
public class BigIntegerDemo {
	public static void main(String[] args) {

		BigInteger bi = new BigInteger("2147483648");
		System.out.println("bi:" + bi);
	}
}