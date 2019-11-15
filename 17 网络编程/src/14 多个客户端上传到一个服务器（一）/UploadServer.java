package cn.itcast_14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
//客户端不用改，只需要改服务器，加一个while(true)
//缺点：如果多个客户端网速不同，那么谁的网速快谁优先，不公平，应该为每个客户端设置一个线程。
public class UploadServer {
	public static void main(String[] args) throws IOException {
		// 创建服务器端的Socket对象
		ServerSocket ss = new ServerSocket(11111);

		while (true) {
			// 监听客户端连接
			Socket s = ss.accept();// 阻塞

			// 封装通道内的流
			BufferedReader br = new BufferedReader(new InputStreamReader(
					s.getInputStream()));
			// 封装文本文件
			BufferedWriter bw = new BufferedWriter(new FileWriter("Copy.java"));

			String line = null;
			while ((line = br.readLine()) != null) { // 阻塞
				bw.write(line);
				bw.newLine();
				bw.flush();
			}

			// 给出反馈
			BufferedWriter bwServer = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
			bwServer.write("文件上传成功");
			bwServer.newLine();
			bwServer.flush();

			// 释放资源
			bw.close();
			s.close();
		}
	}
}
