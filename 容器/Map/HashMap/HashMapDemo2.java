import java.util.HashMap;
import java.util.Set;

/*
 * HashMap<Integer,String>
 * 	����Integer
 * 	ֵ��String
 */
public class HashMapDemo2 {
	public static void main(String[] args) {
		//�������϶���
		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(27, "����ϼ");
		hm.put(30, "������");
		hm.put(28, "����");
		hm.put(29, "����ϼ");


		//����
		Set<Integer> set = hm.keySet();
		for (Integer key : set) {
			String value = hm.get(key);
			System.out.println(key + "---" + value);
		}
	}
}
