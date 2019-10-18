package 变量和数据类型;

/*
	byte b = 130;有没有问题?如果我想让赋值正确，可以怎么做?结果是多少呢?
	
	练习：byte b = (byte)300;
*/

class DataTypeDemo7 {
	public static void main(String[] args) {
		//byte的范围：-128~127。
		//130不在此范围内，报错。
		//byte b = 130; 
		
		//我们可以使用强制类型转换
		byte b = (byte) 130;
		
		//结果是多少呢?
		System.out.println(b);
	}
}
/*
	分析：
		1.获取130的二进制
			00000000 00000000 00000000 10000010
			这是130的原码，也是反码，还是补码。
		2.做截取操作，截成byte类型。
			10000010 
			这个结果是补码。
		3.已知补码求原码。
					符号位		数值位
			补码：	1			0000010
			
			反码：	1			0000001
			
			原码：	1			1111110
*/
