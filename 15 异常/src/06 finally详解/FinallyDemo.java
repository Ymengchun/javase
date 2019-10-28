package Exception_07;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * finally��finally�е����һ����ִ�У��������ִ�е�finally֮ǰjvm�˳��ˣ��Ͳ���ִ���ˡ�
 * ��ʽ��try������catch������finally������
 * ���ã������ͷ���Դ����IO�����������ݿ�����л����
 */
public class FinallyDemo {
	public static void main(String[] args) {
		String s = "2014-11-20";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		Date d = null;
		try {
			// System.out.println(10 / 0);
			d = sdf.parse(s);
		} catch (ParseException e) {
			e.printStackTrace();
			System.exit(0);
		} finally {
			System.out.println("����Ĵ����ǿ���ִ�е�");
		}

		System.out.println(d);
	}
}