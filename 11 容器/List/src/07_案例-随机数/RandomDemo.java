package Demo_07;

import java.util.ArrayList;
import java.util.Random;

/*
 * ��������ȡ10��1-20֮����������Ҫ�����ظ�
 * 		1.���ڳ��Ȳ���ȷ�����ʲ���������ʵ�֣���Ϊ����ĳ����ǹ̶��ġ�
 *		2.���ü��ϡ�
 * 
 * ������
 * 		1.��������������Ķ���
 * 		2.����һ���洢������ļ��ϡ�
 * 		3.����һ��ͳ�Ʊ�������0��ʼ��
 * 		4.�ж�ͳ�����Ƿ�С��10
 * 			�ǣ�����һ����������жϸ�������ڼ������Ƿ���ڡ�
 * 					�����ڣ�����ӣ�ͳ�Ʊ���++��
 * 					���ڣ�������������һ�������
 * 			���˳�ѭ��
 * 		5.��������
 */
public class RandomDemo {
	public static void main(String[] args) {
		//��������������Ķ���
		Random r = new Random();

		//����һ���洢������ļ��ϡ�
		ArrayList<Integer> array = new ArrayList<Integer>();

		//����һ��ͳ�Ʊ�������0��ʼ��
		int count = 0;

		//�ж�ͳ�Ʊ����Ƿ�С��10
		while (count < 10) {
			//����һ�������
			int number = r.nextInt(20) + 1;	//r.nextInt(20)����0~19�������
			
			//�жϸ�������ڼ������Ƿ����
			if(!array.contains(number)){
				//�����ڣ�����ӣ�ͳ�Ʊ���++��
				array.add(number);
				count++;
			}
		}
		
		//��������
		for(Integer i : array){
			System.out.println(i);
		}
	}
}
