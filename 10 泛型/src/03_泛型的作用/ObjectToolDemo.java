package Demo_03;

/*
 * ����ת��û���κ����⣬������ת��ʱ���ܷ�������ת���쳣��
 * ������ת�͵ĵĳ�����ܲ���ȫ��
 * ���÷��Ϳ�����߳���İ�ȫ�ԡ�
 * 
 * ClassCastException����������ת��ʱ�����ݷ������쳣��
 */
public class ObjectToolDemo {
	public static void main(String[] args) {
		ObjectTool ot = new ObjectTool();

		// ����ʹ��
		ot.setObj(new Integer(27));
		Integer i = (Integer) ot.getObj();
		System.out.println("�����ǣ�" + i);

		ot.setObj(new String("����ϼ"));
		String s = (String) ot.getObj();
		System.out.println("�����ǣ�" + s);

		System.out.println("---------");
		ot.setObj(new Integer(30));
		
		//ClassCastException
		String ss = (String) ot.getObj();
		System.out.println("�����ǣ�" + ss);
	}
}
