package s6_��ת���;
/*
	������ С��������ÿ�����2.5ԪǮ������������������ǣ�
	            ÿ����һ���Ǵ�Ǯ�ĵ�5�����5�ı����Ļ��������Ứȥ6ԪǮ��
		  ���ʣ����������죬С���ſ��Դ浽100ԪǮ��

	������
		1.С��������ÿ�����2.5ԪǮ
			double dayMoney = 2.5;
		2.�����������
			double daySum = 0;
		3.�ӵ�һ�쿪ʼ�洢
			int dayCount = 1;
		4.���������죬С���ſ��Դ浽100ԪǮ��
			double result = 100;
		5.��һ���Ǵ�Ǯ�ĵ�5�����5�ı����Ļ��������Ứȥ6ԪǮ��
			˵��Ҫ�ж�dayCount��ֵ�������5�����ͼ�ȥ6ԪǮ��
				daySum -= 6;
		  	�ɴ˻�������һ�����⣬�����������5�ı�����Ļ���ǮҪ�ۼ�
				daySum += dayMoney;
		6.��Ϊ��֪���Ƕ����죬����������ѭ����һ������100Ԫ�Ҿ��˳�ѭ����
*/
class WhileDemo {
	public static void main(String[] args) {
		//ÿ��Ҫ�洢��Ǯ��2.5Ԫ
		double dayMoney = 2.5;
		
		//��Ǯ�ĳ�ʼ��ֵ��0
		double daySum = 0;
		
		//�ӵ�һ�쿪ʼ�洢
		int dayCount = 1;
		
		//���մ洢��С��100�Ͳ��洢��
		int result = 100;
		
		//��Ϊ��֪���Ƕ����죬����������ѭ����
		while(true) {
			//�ۼ�Ǯ
			daySum += dayMoney;
			
			//һ������100Ԫ�Ҿ��˳�ѭ����
			if(daySum >= result) {
				System.out.println("������"+dayCount+"��洢��100Ԫ");
				break;
			}
			
			if(dayCount%5 == 0) {
				//��ȥ6ԪǮ
				daySum -= 6;
				System.out.println("��"+dayCount+"�컨��6ԪǮ");
			}
			
			//�����仯
			dayCount++;
		}
	}
}