package Demo_01;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * List�����ࣺ
 * 		ArrayList:
 * 			�ײ����ݽṹ�����飬��ѯ�죬��ɾ��
 * 			�̲߳���ȫ��Ч�ʸ�
 * 		Vector:
 * 			�ײ����ݽṹ�����飬��ѯ�죬��ɾ��
 * 			�̰߳�ȫ��Ч�ʵ�
 * 		LinkedList:
 * 			�ײ����ݽṹ��������ѯ������ɾ��
 * 			�̲߳���ȫ��Ч�ʸ�
 * 
 * ������ʹ��List������洢�ַ�����洢�Զ�����󣬲�������
 * 
 */
public class ArrayListDemo {
	public static void main(String[] args) {
		//�������϶���
		ArrayList array = new ArrayList();

		//����Ԫ�ض��󣬲����Ԫ��
		array.add("hello");
		array.add("world");
		array.add("java");

		//����������
		Iterator it = array.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();	//�������ķ���������Object������ǿ��ת��ΪString
			System.out.println(s);
		}

		System.out.println("-----------");
		
		//��ͨforѭ������
		for (int x = 0; x < array.size(); x++) {
			String s = (String) array.get(x);
			System.out.println(s);
		}
	}
}
