package Demo_01;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * 
 * ���ͣ�˵��������ʲô���͡�
 * ��ʽ��
 * 		<��������>
 * 		�˴�����������ֻ�����������͡����硪��int���ͱ���ת��ΪInteger�ࡣ
 * �ŵ㣺
 * 		1.������ʱ�ڵ�������ǰ���˱���ʱ��
 * 		2.������ǿ������ת��
 * 		3.�Ż��˳�����ƣ�����˻�ɫ������
 */
public class GenericDemo {
	public static void main(String[] args) {
		//����
		ArrayList<String> array = new ArrayList<String>();

		//���Ԫ��
		array.add("hello");
		array.add("world");
		array.add("java");


		//����
		Iterator<String> it = array.iterator();
		while (it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}

	}
}
