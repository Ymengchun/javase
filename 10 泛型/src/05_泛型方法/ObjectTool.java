package Demo_05;



/*
 * ���ͷ������ѷ��Ͷ����ڷ�����
 * 		public <��������> �������� ������(��������)
 */

//���÷��ͷ�����ֻ�����������أ�������
//public class ObjectTool<T> {
//	public void show(String s) {
//		System.out.println(s);
//	}
// 	public void show(Integer i) {
// 		System.out.println(i);
// 	}
// 	public void show(Boolean b) {
// 		System.out.println(b);
// 	}

//ʹ�÷��ͷ���
public class ObjectTool {
	public <T> void show(T t) {
		System.out.println(t);
	}
}