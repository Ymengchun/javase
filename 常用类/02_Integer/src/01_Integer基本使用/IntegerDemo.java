package Demo_01;

/*
 * ����1����100�Ķ����ƣ��˽��ƣ�ʮ�����Ƽ������
 * ����2���ж�һ�������Ƿ���int��Χ�ڵġ�
 * 		 �������֪��int�ķ�Χ�Ƕ��?
 * 
 * Ϊ�˶Ի����������ͽ��и���Ĳ�����java�ṩ�˰�װ��
 * 		byte 			Byte
 * 		short			Short
 * 		int			Integer
 * 		long			Long
 * 		float			Float
 * 		double			Double
 * 		char			Character
 * 		boolean			Boolean
 * 
 * �����ڣ����������������ַ���֮���ת����
 */
public class IntegerDemo {
	public static void main(String[] args) {
		//�����ƣ�public static String toBinaryString(int i)
		System.out.println(Integer.toBinaryString(100));
		
		//�˽��ƣ�public static String toOctalString(int i)
		System.out.println(Integer.toOctalString(100));
		
		//ʮ�����ƣ�public static String toHexString(int i)
		System.out.println(Integer.toHexString(100));

		
		//public static final int MAX_VALUE��int���͵���С��Χ
		System.out.println(Integer.MAX_VALUE);
		
		//public static final int MIN_VALUE��int���͵����Χ
		System.out.println(Integer.MIN_VALUE);
	}
}