package cn.itcast_01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * Map���ϵı�������2������Set<Map.Entry<K, V>> set = map.entrySet();
 * Set<Map.Entry<K,V>> entrySet()�����ؼ�ֵ�Զ���ļ���	
 */
public class MapDemo4 {
	public static void main(String[] args) {
		// �������϶���
		Map<String, String> map = new HashMap<String, String>();

		// ����Ԫ�ز���ӵ�����
		map.put("���", "С��Ů");
		map.put("����", "����");
		map.put("�", "�����");
		map.put("������", "÷����");

		// ��ȡ���м�ֵ�Զ���ļ���
		Set<Map.Entry<String, String>> set = map.entrySet();
		// ������ֵ�Զ���ļ��ϣ��õ�ÿһ����ֵ�Զ���
		for (Map.Entry<String, String> me : set) {
			// ���ݼ�ֵ�Զ����ȡ����ֵ
			String key = me.getKey();
			String value = me.getValue();
			System.out.println(key + "---" + value);
		}
	}
}