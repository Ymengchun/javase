package Demo_03;

import java.util.LinkedList;

/*
 * LinkedList�����й��ܣ�
 * 		1.��ӹ���
 * 			public void addFirst(Object e)
 * 			public void addLast(Object e)
 * 		2.��ȡ����
 * 			public Object getFirst()
 * 			public Obejct getLast()
 * 		3.ɾ������
 * 			public Object removeFirst()
 * 			public Object removeLast()
 */
public class LinkedListDemo {
	public static void main(String[] args) {
		//�������϶���
		LinkedList link = new LinkedList();

		//���Ԫ��
		link.add("hello");
		link.add("world");
		link.add("java");

		//ddFirst()�����ͷԪ��
		//link.addFirst("javaee");
		//addLast()�����βԪ��
		//link.addLast("android");

		//getFirst()����ȡͷԪ��
		//System.out.println("getFirst:" + link.getFirst());
		//getLast()����ȡβԪ��
		//System.out.println("getLast:" + link.getLast());

		//removeFirst()��ɾ����Ԫ��
		System.out.println("removeFirst:" + link.removeFirst());
		//removeLast()��ɾ��βԪ��
		System.out.println("removeLast:" + link.removeLast());

		//���������
		System.out.println("link:" + link);
	}
}
