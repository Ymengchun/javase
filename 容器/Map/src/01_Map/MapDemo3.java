package cn.itcast_01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * Map���ϵı�������1��Set<String> set = map.keySet();
 */
public class MapDemo3 {
	public static void main(String[] args) {
		// �������϶���
		Map<String, String> map = new HashMap<String, String>();

		// ����Ԫ�ز���ӵ�����
		map.put("���", "С��Ů");
		map.put("����", "����");
		map.put("�", "�����");
		map.put("������", "÷����");

		// ����
		// ��ȡ���еļ�
		Set<String> set = map.keySet();
		// �������ļ��ϣ���ȡ�õ�ÿһ����
		for (String key : set) {
			// ���ݼ�ȥ��ֵ
			String value = map.get(key);
			System.out.println(key + "---" + value);
		}
	}
}