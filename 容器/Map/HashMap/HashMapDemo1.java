import java.util.HashMap;
import java.util.Set;

public class HashMapDemo1 {
	public static void main(String[] args) {
		//创建集合对象
		HashMap<String, String> hm = new HashMap<String, String>();

		//创建并添加元素
		hm.put("it001", "马云");
		hm.put("it003", "马化腾");
		hm.put("it004", "乔布斯");
		hm.put("it005", "张朝阳");
		hm.put("it002", "裘伯君"); 
		hm.put("it001", "比尔盖茨");	//把"马云"覆盖了，说明key具有唯一性

		//遍历
		Set<String> set = hm.keySet();
		for (String key : set) {
			String value = hm.get(key);
			System.out.println(key + "---" + value);
		}
	}
}
