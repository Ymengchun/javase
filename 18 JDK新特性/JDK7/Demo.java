package cn.itcast_03;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Demo {
	public static void main(String[] args) {
		// 1.��������������ʹ�ö����Ʊ�ʾ������byte,short,int,long������ǰ׺0b��0B
		int x = 0b100101;
		System.out.println(x);

		// 2. �������������Գ����»��ߣ����㻮����λ��
		// int y = 1_1123_1000;
		// ���ܳ����ڽ��Ʊ�ʶ����ֵ֮��
		// int b = 0x_1122;
		// ���ܳ�������ֵ��ͷ�ͽ�β
		// int a1 = _11;
		// int a2 = 11_;
		// ���ܳ�����С�����Ա�
		// double d1 = 12._34;
		// double d1 = 12_.34;
		

		// 3.switch ���������ַ���

		// 4.���ͼ�
		ArrayList<String> array = new ArrayList<>();

		// 5.�쳣�Ķ��catch�ϲ�

	}

	// 6.try-with-resources ���
	private static void method() {
		// ԭ�ȵ�
		try {
			FileReader fr = new FileReader("a.txt");
			FileWriter fw = new FileWriter("b.txt");
			int ch = 0;
			while ((ch = fr.read()) != -1) {
				fw.write(ch);
			}
			fw.close();
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// �Ľ��棺��try-with-resources ���Ľ�
		// ���ã�����Ҫclose()����Դ����try()�У�ʡ�Ժ����close()
		// try(������java.lang.AutoClosable���������)
		try (FileReader fr = new FileReader("a.txt");
				FileWriter fw = new FileWriter("b.txt");) {
			int ch = 0;
			while ((ch = fr.read()) != -1) {
				fw.write(ch);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
