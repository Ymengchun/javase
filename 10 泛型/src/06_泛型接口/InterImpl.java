package Demo_06;

//ʵ������ʵ�ֽӿڵ�ʱ��
//���1���Ѿ�֪���ӿڵ�����
//public class InterImpl implements Inter<String> {	//��ʹ�÷���
//	@Override
//	public void show(String t) {
//		System.out.println(t);
//	}
//}

//���2����֪���ӿڵ�����
public class InterImpl<T> implements Inter<T> {	//ʹ�÷���
	@Override
	public void show(T t) {
		System.out.println(t);
	}
}