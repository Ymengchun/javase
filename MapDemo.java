import java.util.HashMap;
import java.util.Map;


public class MapDemo {
	public static void main(String[] args) {
		//�������϶���
		Map<String, String> map = new HashMap<String, String>();

		//���Ԫ��
		map.put("�˳�", "��ٳ");
		map.put("������", "��ӱ");
		map.put("�ܽ���", "������");
		map.put("������", "����");


		//�Ƴ����еļ�ֵ��
		//map.clear();
		//���ݼ�ɾ����ֵ�ԣ�����ֵ����
		//System.out.println("remove:" + map.remove("������"));
		//System.out.println("remove:" + map.remove("�ƺ���"));


		//�жϼ����Ƿ����ָ���ļ�
		//System.out.println("containsKey:" + map.containsKey("������"));
		//System.out.println("containsKey:" + map.containsKey("�ƺ���"));
		//�жϼ����Ƿ�Ϊ��
		//System.out.println("isEmpty:"+map.isEmpty());
		//���ؼ����еļ�ֵ�ԵĶ���
		System.out.println("size:"+map.size());


		//�����������
		System.out.println("map:" + map);


		//���ݼ���ȡֵ
		System.out.println("get:" + map.get("�ܽ���"));
		System.out.println("get:" + map.get("�ܽ�")); //����null
		System.out.println("----------------------");
		//��ȡ���м��ļ���
		Set<String> set = map.keySet();
		for (String key : set) {
			System.out.println(key);
		}
		System.out.println("----------------------");
		//��ȡ����ֵ�ļ���
		Collection<String> con = map.values();
		for (String value : con) {
			System.out.println(value);
		}
	}
}