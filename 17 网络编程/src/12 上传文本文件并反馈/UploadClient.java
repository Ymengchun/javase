package cn.itcast_12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

/*
 * 如果只让服务器向客户发送反馈信息，就会没有反应
 * 因为服务器根本就不知道客户结束了，而客户还等待服务器给反馈，所以就相互等待
 * 
 * 解决：
 * A:在多写一条数据，告诉服务器，读取到这条数据说明我就结束，你也结束吧。
 * 		这样做可以解决问题，但是不好。
 * B:Socket对象提供了一种解决方案
 * 		public void shutdownOutput()
 */

public class UploadClient {
	public static void main(String[] args) throws IOException {
		// 创建客户端Socket对象
		Socket s = new Socket("192.168.12.92", 11111);

		// 封装文本文件
		BufferedReader br = new BufferedReader(new FileReader(
				"InetAddressDemo.java"));
		
		// 上传文件
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

		String line = null;
		while ((line = br.readLine()) != null) { // 阻塞
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		
		//方法一：自定义一个结束标记
		//bw.write("over");
		//bw.newLine();
		//bw.flush();
		
		//方法二：Socket提供了一个终止，它会通知服务器你别等了，我上传完了
		s.shutdownOutput();

		// 接收服务器反馈
		BufferedReader brClient = new BufferedReader(new InputStreamReader(s.getInputStream()));
		String client = brClient.readLine(); // 阻塞
		System.out.println(client);

		// 释放资源
		br.close();
		s.close();
	}
}
