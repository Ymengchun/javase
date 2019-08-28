
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
		
		
		//方法一：通过Map.keySet()遍历
		System.out.println("方法一：");
		Set<Integer> set = map.keySet();	//得到所有key的集合
		for (Integer i : set) {
			System.out.print(map.get(i) + " ");
		}

		
		
		//方法二：通过Map.entrySet使用iterator遍历
		System.out.println("方法二：");
		Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<Integer, String> entry = it.next();
			System.out.println("[" + entry.getKey() + "," + entry.getValue() +"]");
		}
		
		
		
		//方法三：通过Map.entrySet遍历（推荐）
		System.out.println("方法三：");
		for (Map.Entry<Integer, String> entry : map.entrySet()) {	//遍历所有键值对的集合
			System.out.println("[" + entry.getKey() + "," + entry.getValue() +"]");
		}
		
		
		//方法四：通过Map.values()遍历所有的value，但不能遍历key
		System.out.println("方法四：");
		for (String value : map.values()) {
			System.out.println(value);
		}
		
	}
	

}
