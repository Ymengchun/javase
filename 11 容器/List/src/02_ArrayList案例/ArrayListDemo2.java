package Demo_04;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * ����ArrayListȥ�أ�Ҫ�󲻴����¼��ϣ�ֱ����ԭ�����ϲ�����
 */
public class ArrayListDemo2 {
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

		//����һ��Ԫ��֮����û�к͵�һ��Ԫ����ͬ��Ԫ�أ���ͬ����ɾ��������ͬ��������
		//���ڶ���Ԫ��֮����û�к͵ڶ���Ԫ����ͬ��Ԫ�أ���ͬ����ɾ��������ͬ��������
		//...
		for (int x = 0; x < array.size() - 1; x++) {
			for (int y = x + 1; y < array.size(); y++) {
				if (array.get(x).equals(array.get(y))) {
					array.remove(y);
					y--;	//ǰ��һλ
				}
			}
		}

		//��������
		Iterator it = array.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();
			System.out.println(s);
		}
	}
}
