import java.util.HashMap;
import java.util.Set;

public class HashMapDemo1 {
	public static void main(String[] args) {
		//�������϶���
		HashMap<String, String> hm = new HashMap<String, String>();

		//���������Ԫ��
		hm.put("it001", "����");
		hm.put("it003", "����");
		hm.put("it004", "�ǲ�˹");
		hm.put("it005", "�ų���");
		hm.put("it002", "�ò���"); 
		hm.put("it001", "�ȶ��Ǵ�");	//��"����"�����ˣ�˵��key����Ψһ��

		//����
		Set<String> set = hm.keySet();
		for (String key : set) {
			String value = hm.get(key);
			System.out.println(key + "---" + value);
		}
	}
}
