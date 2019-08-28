import java.util.HashMap;
import java.util.Map;


public class MapDemo {
	public static void main(String[] args) {
		//创建集合对象
		Map<String, String> map = new HashMap<String, String>();

		//添加元素
		map.put("邓超", "孙俪");
		map.put("黄晓明", "杨颖");
		map.put("周杰伦", "蔡依林");
		map.put("刘恺威", "杨幂");


		//移除所有的键值对
		//map.clear();
		//根据键删除键值对，并把值返回
		//System.out.println("remove:" + map.remove("黄晓明"));
		//System.out.println("remove:" + map.remove("黄海波"));


		//判断集合是否包含指定的键
		//System.out.println("containsKey:" + map.containsKey("黄晓明"));
		//System.out.println("containsKey:" + map.containsKey("黄海波"));
		//判断集合是否为空
		//System.out.println("isEmpty:"+map.isEmpty());
		//返回集合中的键值对的对数
		System.out.println("size:"+map.size());


		//输出集合名称
		System.out.println("map:" + map);


		//根据键获取值
		System.out.println("get:" + map.get("周杰伦"));
		System.out.println("get:" + map.get("周杰")); //返回null
		System.out.println("----------------------");
		//获取所有键的集合
		Set<String> set = map.keySet();
		for (String key : set) {
			System.out.println(key);
		}
		System.out.println("----------------------");
		//获取所有值的集合
		Collection<String> con = map.values();
		for (String value : con) {
			System.out.println(value);
		}
	}
}