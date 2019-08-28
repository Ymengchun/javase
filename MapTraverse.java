
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class MapTraverse {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		map.put(4, "d");
		map.put(5, "e");
		
		
		//����һ��ͨ��Map.keySet()����
		System.out.println("����һ��");
		Set<Integer> set = map.keySet();	//�õ�����key�ļ���
		for (Integer i : set) {
			System.out.print(map.get(i) + " ");
		}

		
		
		//��������ͨ��Map.entrySetʹ��iterator����
		System.out.println("��������");
		Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<Integer, String> entry = it.next();
			System.out.println("[" + entry.getKey() + "," + entry.getValue() +"]");
		}
		
		
		
		//��������ͨ��Map.entrySet�������Ƽ���
		System.out.println("��������");
		for (Map.Entry<Integer, String> entry : map.entrySet()) {	//�������м�ֵ�Եļ���
			System.out.println("[" + entry.getKey() + "," + entry.getValue() +"]");
		}
		
		
		//�����ģ�ͨ��Map.values()�������е�value�������ܱ���key
		System.out.println("�����ģ�");
		for (String value : map.values()) {
			System.out.println(value);
		}
		
	}
	

}
