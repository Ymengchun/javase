package Demo_04;

/*
 * ������Ĳ���
 */
public class ObjectToolDemo {
	public static void main(String[] args) {

		ObjectTool<String> ot = new ObjectTool<String>();
		//ot.setObj(new Integer(27)); 	//����ͨ��������Ϊ��ֻ������String��
		ot.setObj(new String("����ϼ"));
		String s = ot.getObj();
		System.out.println("�����ǣ�" + s);

		ObjectTool<Integer> ot2 = new ObjectTool<Integer>();
		// ot2.setObj(new String("������"));	//����ͨ��������Ϊ��ֻ������Integer��
		ot2.setObj(new Integer(27));
		Integer i = ot2.getObj();
		System.out.println("�����ǣ�" + i);
	}
}
