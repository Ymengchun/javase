package Demo_04;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * ������ArrayListȥ��
 * 
 * ������
 * 		1.�������϶���
 * 		2.��Ӷ���ַ���Ԫ��(����������ͬ��)
 * 		3.�����¼���
 * 		4.�����ɼ��ϣ���ȡ�õ�ÿһ��Ԫ��
 * 		5.�����Ԫ�ص��¼���ȥ�ң�����û��
 * 			�У�����
 * 			û�У���ӵ��¼���
 * 		6.�����¼��ϣ����Ԫ��
 */
public class ArrayListDemo {
	public static void main(String[] args) {
		//�������϶���
		ArrayList array = new ArrayList();

		//��Ӷ���ַ���Ԫ��(����������ͬ��)
		array.add("hello");
		array.add("world");
		array.add("java");
		array.add("world");
		array.add("java");
		array.add("world");
		array.add("world");
		array.add("world");
		array.add("world");
		array.add("java");
		array.add("world");

		//�����¼���
		ArrayList newArray = new ArrayList();

		//�����ɼ���,��ȡ�õ�ÿһ��Ԫ��
		Iterator it = array.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();

			//�����Ԫ�ص��¼���ȥ�ң�����û��
			if (!newArray.contains(s)) {
				newArray.add(s);
			}
		}

		//�����¼���
		for (int x = 0; x < newArray.size(); x++) {
			String s = (String) newArray.get(x);
			System.out.println(s);
		}
	}
}
