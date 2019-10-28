package Exception_04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * ���try�����쳣��jvm����һ���쳣�����׳��ö��󣬺�catch�еĴ����������ƥ�䡣
 * ���ƥ��ɹ�����ִ�ж�Ӧcatch�еĴ�����Ϣ��
 * 
 * �쳣��Ҫ�˽�ļ���������
 * public String getMessage()����ȡ�쳣��Ϣ��������ϸ���쳣��Ϣ�ַ���		
 * public String toString()�������쳣�ļ���Ϣ������������Ϣ�������ֹ��ɣ�
 * 		�˶������� name(ȫ·����)
 * 		": "��ð�ź�һ���ո� 
 * 		���ô˶��� getLocalizedMessage()�����Ľ�� (Ĭ�Ϸ��ص���getMessage()������)
 * printStackTrace() ��ȡ�쳣�������쳣��Ϣ���Լ��쳣�����ڳ����е�λ�á�����ֵvoid������Ϣ����ڿ���̨��
 */
public class ExceptionDemo {
	public static void main(String[] args) {
		String s = "2014-11-20";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			Date d = sdf.parse(s); // ������һ��ParseException����Ȼ���׳�ȥ����catch�������ƥ��
			System.out.println(d);
		} catch (ParseException e) { 

			// getMessage()����
			// ���룺System.out.println(e.getMessage());
			// ����̨�����Unparseable date: "2014-11-20"
			
			

			// toString()����
			// ���룺System.out.println(e.toString());
			// ����̨�����java.text.ParseException: Unparseable date: "2014-11-20"
			
			
			//ͨ������getMessage()��toString()��������printStackTrace()
			e.printStackTrace();

		}
		
		System.out.println("over");
	}
}
