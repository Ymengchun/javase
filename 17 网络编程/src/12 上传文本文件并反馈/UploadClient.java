package cn.itcast_12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

/*
 * ���ֻ�÷�������ͻ����ͷ�����Ϣ���ͻ�û�з�Ӧ
 * ��Ϊ�����������Ͳ�֪���ͻ������ˣ����ͻ����ȴ������������������Ծ��໥�ȴ�
 * 
 * �����
 * A:�ڶ�дһ�����ݣ����߷���������ȡ����������˵���Ҿͽ�������Ҳ�����ɡ�
 * 		���������Խ�����⣬���ǲ��á�
 * B:Socket�����ṩ��һ�ֽ������
 * 		public void shutdownOutput()
 */

public class UploadClient {
	public static void main(String[] args) throws IOException {
		// �����ͻ���Socket����
		Socket s = new Socket("192.168.12.92", 11111);

		// ��װ�ı��ļ�
		BufferedReader br = new BufferedReader(new FileReader(
				"InetAddressDemo.java"));
		
		// �ϴ��ļ�
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

		String line = null;
		while ((line = br.readLine()) != null) { // ����
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		
		//����һ���Զ���һ���������
		//bw.write("over");
		//bw.newLine();
		//bw.flush();
		
		//��������Socket�ṩ��һ����ֹ������֪ͨ�����������ˣ����ϴ�����
		s.shutdownOutput();

		// ���շ���������
		BufferedReader brClient = new BufferedReader(new InputStreamReader(s.getInputStream()));
		String client = brClient.readLine(); // ����
		System.out.println(client);

		// �ͷ���Դ
		br.close();
		s.close();
	}
}
