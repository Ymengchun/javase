package Map_05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/*
 *����HashMap��Ԫ����3��ArrayList��ÿһ��ArrayList��ֵ���ַ�����
 *�����
 *		 ��������
 *		 	����
 *		 	���
 *		 Ц������
 *		 	�����
 *		 	��ƽ֮
 *		 �������
 *		 	����
 *		 	���  
 */
public class HashMapIncludeArrayListDemo {
	public static void main(String[] args) {
		// �������϶���
		HashMap<String, ArrayList<String>> hm = new HashMap<String, ArrayList<String>>();

		//����Ԫ�ؼ���1
		ArrayList<String> array1 = new ArrayList<String>();
		array1.add("����");
		array1.add("���");
		hm.put("��������", array1);

		//����Ԫ�ؼ���2
		ArrayList<String> array2 = new ArrayList<String>();
		array2.add("�����");
		array2.add("��ƽ֮");
		hm.put("Ц������", array2);

		//����Ԫ�ؼ���3
		ArrayList<String> array3 = new ArrayList<String>();
		array3.add("����");
		array3.add("���");
		hm.put("�������", array3);
		
		//��������
		Set<String> set = hm.keySet();
		for(String key : set){
			System.out.println(key);	//������£��������壬Ц������
			ArrayList<String> value = hm.get(key);
			for(String s : value){
				System.out.println("\t"+s);
			}
		}
	}
}
