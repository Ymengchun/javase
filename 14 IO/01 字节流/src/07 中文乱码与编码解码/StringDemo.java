package IO_01;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/*
 * String(byte[] bytes, String charsetName)：通过指定的字符集解码字节数组
 * byte[] getBytes(String charsetName)：通过指定的字符集，把字符串→字节数组
 * 
 * 编码：把看得懂的变成看不懂的，String -- byte[]
 * 解码:把看不懂的变成看得懂的，byte[] -- String
 * 
 * 编码、解码必须采用同一字符集，否则会出现乱码
 */

public class StringDemo {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String s = "你好";

		//String → byte[]
		byte[] bys = s.getBytes();	//[-60, -29, -70, -61]
		//byte[] bys = s.getBytes("GBK");	//[-60, -29, -70, -61]
		//byte[] bys = s.getBytes("UTF-8");	//[-28, -67, -96, -27, -91, -67]
		System.out.println(Arrays.toString(bys));

		//byte[] → String
		String ss = new String(bys);	//你好
		//String ss = new String(bys, "GBK"); //你好
		//String ss = new String(bys, "UTF-8"); //???，编码不一致会出现编码问题
		System.out.println(ss);
	}
	
}