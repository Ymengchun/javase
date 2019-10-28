package Demo_02;

import java.util.HashSet;

/*
 * hashCode()�����ã�
 * 		��߷����ٶȣ�ɢ�б�
 * ΪʲôHashSet�ܱ�֤�ַ���Ψһ��
 * 		1.HashSet��add()�����ײ������ڣ�hashCode()��equals()
 * 		2.ֻ��hashCode()��equals()����ͬʱ�����ܱ�֤��ͬһ������
 * HashSet()�ж�Ԫ���Ƿ���ͬ�Ĳ��裺	
 * 		���ж�hashCode()�Ƿ���ͬ
 * 			��ͬ��˵����ַ��ͬ�����ж�equals()�Ƿ���ͬ
 * 				 ����true��Ԫ���ظ��������
 * 				 ����false��Ԫ�ز��ظ������
 * 			��ͬ�����
 * 
 * 
 * ˵����
 * 		Object��
 * 		1.equals()���Ƚ�������ĵ�ַ�Ƿ���ͬ���Ƿ�Ϊͬһ�����󣩣���ʱ�� == �Ĺ���һ������ַ��ͬ��������true����ַ��ͬ��������false��
 * 		2.hashCode()�������ϣֵ����ͬ�Ķ����ϣֵ��ͬ��һ���Ǹ��ݶ���ĵ�ַ���أ�
 * 		3.toString()������ + @ + ʮ������hashCodeֵ��
 * 		
 * 		��д��
 * 		1.equals()���Ƚ�����������ԡ�������ͬ��������true�����Բ�ͬ��������false��
 * 			���磺String����дequals()�����󣬿��ԱȽ������ַ����������Ƿ���ͬ��
 * 				 ���û����д��equals()��==�Ĺ���һ�������޷��Ƚ��ַ��������ݡ�
 * 		2.hashCode()�������ϣֵ��
 * 		3.toString()�����Ե�ƴ�ӣ������Զ��壩
 * 
 * ��дequals()��hashCode()ʱע�⣺
 * 		1.�ɶ���д����дequals()��Ӧ����д hashcode()
 * 		2.equals()Ϊtrue��hashCode()һ��Ϊtrue��
 * 		  hashCode()Ϊtrue��equals()��һ��Ϊtrue����ͻ�������ݽṹ-ɢ�б�
 * 
 * ������String����д��equals()��hashCode()��ʹ��HashSet���Ԫ��ʱ����ȥ�ء�
 */
public class HashSetDemo {
	public static void main(String[] args) {
		//�������϶���
		HashSet<String> hs = new HashSet<String>();

		//���������Ԫ��
		hs.add("hello");
		hs.add("world");
		hs.add("java");
		hs.add("world");

		//��������
		for (String s : hs) {
			System.out.println(s);
		}
	}
}
