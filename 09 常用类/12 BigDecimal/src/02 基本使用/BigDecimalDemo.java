package cn.itcast_02;

import java.math.BigDecimal;

/*
 * 构造方法：
 * 		public BigDecimal(String val)
 * 
 * public BigDecimal add(BigDecimal augend)
 * public BigDecimal subtract(BigDecimal subtrahend)
 * public BigDecimal multiply(BigDecimal multiplicand)
 * public BigDecimal divide(BigDecimal divisor)
 * public BigDecimal divide(BigDecimal divisor,int scale,int roundingMode):商，几位小数，如何舍取
 * 	总共有8种取舍方法，BigDecimal.ROUND_HALF_UP 表示四舍五入
 */
public class BigDecimalDemo {
	public static void main(String[] args) {


		BigDecimal bd1 = new BigDecimal("0.09");
		BigDecimal bd2 = new BigDecimal("0.01");
		System.out.println("add:" + bd1.add(bd2));
		System.out.println("-------------------");

		BigDecimal bd3 = new BigDecimal("1.0");
		BigDecimal bd4 = new BigDecimal("0.32");
		System.out.println("subtract:" + bd3.subtract(bd4));
		System.out.println("-------------------");

		BigDecimal bd5 = new BigDecimal("1.015");
		BigDecimal bd6 = new BigDecimal("100");
		System.out.println("multiply:" + bd5.multiply(bd6));
		System.out.println("-------------------");

		BigDecimal bd7 = new BigDecimal("1.301");
		BigDecimal bd8 = new BigDecimal("100");
		System.out.println("divide:" + bd7.divide(bd8));
		System.out.println("divide:"
				+ bd7.divide(bd8, 3, BigDecimal.ROUND_HALF_UP));
		System.out.println("divide:"
				+ bd7.divide(bd8, 8, BigDecimal.ROUND_HALF_UP));
	}
}
