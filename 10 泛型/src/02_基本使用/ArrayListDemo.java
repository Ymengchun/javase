package Demo_02;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * ��������Щ�ط�ʹ����?
 * 		��API������ࡢ�ӿڡ������������<E>����Ҫʹ�÷��͡�һ�����ڼ����С�
 * 
 * ��������ArrayList�洢�ַ���Ԫ�أ����������÷��͸Ľ����롣
 */
public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>();

		array.add("hello");
		array.add("world");
		array.add("java");
		
		//�õ���������
		Iterator<String> it = array.iterator();
		while (it.hasNext()) {
			String s = it.next();	//��ǰ�Ĵ���δʹ�÷��ͣ�����Ҫǿת�����ڲ���
			System.out.println(s);
		}
		System.out.println("-----------------");

		//����������
		for (int x = 0; x < array.size(); x++) {
			String s = array.get(x);	//��ǰ�Ĵ���δʹ�÷��ͣ�����Ҫǿת�����ڲ���
			System.out.println(s);
		}
	}
}
