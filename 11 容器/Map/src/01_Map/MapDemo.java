package cn.itcast_01;

import java.util.HashMap;
import java.util.Map;

/*
 * Map���ϵ��ص㣺����ӳ�䵽ֵ���������ظ���ֵ�����ظ���ÿ�������ֻ��ӳ�䵽һ��ֵ��������ʵ��һ������Ӧ������ݣ���������list��װ��
 * 
 * Map���Ϻ�Collection���ϵ�����?
 * 		Map��Ԫ���ǳɶԳ��ֵģ���Ψ��ֵ���ظ�
 * 		Collection��Ԫ�ص������֣�SetΨһ��List���ظ�
 * 
 * ע�⣺
 * 		Map���ϵ����ݽṹֵ��Լ���Ч����ֵ�޹�	
 *		Collection���ϵ����ݽṹ�����Ԫ����Ч
 * 
 * Map���ϵĹ��ܸ�����
 * 1:��ӹ���
 * 		V put(K key,V value):���Ԫ��
 * 			������ǵ�һ�δ洢����ֱ�Ӵ洢Ԫ�أ�����null
 * 			��������ǵ�һ�δ��ڣ�����ֵ����ǰ��ֵ�滻����������ǰ��ֵ
 * 2:ɾ������
 * 		void clear():�Ƴ����еļ�ֵ��
 * 		V remove(Object key)�����ݼ�ɾ����ֵ�ԣ�����ֵ����
 * 3:�жϹ���
 * 		boolean containsKey(Object key)���жϼ����Ƿ����ָ���ļ�
 * 		boolean containsValue(Object value):�жϼ����Ƿ����ָ����ֵ
 * 		boolean isEmpty()���жϼ����Ƿ�Ϊ��
 * 4:��ȡ����
 * 		Set<Map.Entry<K,V>> entrySet():���м�ֵ�Եļ���
 * 		V get(Object key):���ݼ���ȡֵ
 * 		Set<K> keySet():���м��ļ���
 * 		Collection<V> values():����ֵ�ļ���
 * 5�����ȹ���
 * 		int size()����ֵ�ԵĶ���
 */
public class MapDemo {
	public static void main(String[] args) {
		// �������϶���
		Map<String, String> map = new HashMap<String, String>();

		// ���Ԫ��
		// V put(K key,V value):���Ԫ�ء������ʵ������һ������?�Ȳ������㣬�Ȼὲ
		// System.out.println("put:" + map.put("����", "������"));
		// System.out.println("put:" + map.put("����", "Ҧ��"));

		map.put("�˳�", "��ٳ");
		map.put("������", "��ӱ");
		map.put("�ܽ���", "������");
		map.put("������", "����");

		// void clear():�Ƴ����еļ�ֵ��Ԫ��
		// map.clear();

		// V remove(Object key)�����ݼ�ɾ����ֵ��Ԫ�أ�����ֵ����
		// System.out.println("remove:" + map.remove("������"));
		// System.out.println("remove:" + map.remove("������"));

		// boolean containsKey(Object key)���жϼ����Ƿ����ָ���ļ�
		// System.out.println("containsKey:" + map.containsKey("������"));
		// System.out.println("containsKey:" + map.containsKey("������"));

		// boolean isEmpty()���жϼ����Ƿ�Ϊ��
		// System.out.println("isEmpty:"+map.isEmpty());
		
		//int size()�����ؼ����еļ�ֵ�ԵĶ���
		System.out.println("size:"+map.size());

		// �����������
		System.out.println("map:" + map);
	}
}