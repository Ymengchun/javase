package s2_��ֵ�����;
/*
	�����⣺
		short s = 1; s = s + 1; 
		short s = 1; s += 1;
		��������������û�����⣬����У����������⡣
		
		��һ�����벻ͨ����s��short���ͣ�1��int���ͣ�s+1��int���ͣ��Զ�ת�������Ⱥ���ߵ�s��short����
					  s+1��sҪǿ��ת������һ��ʽ��û��
		�ڶ���û�����⣺
			��չ�ĸ�ֵ�������ʵ������һ��ǿ������ת����
			
			s += 1;
			���ǵȼ��� s = s + 1;
			���ǵȼ��� s = (s����������)(s + 1);
*/
class OperatorTest {
	public static void main(String[] args) {
		//short s = 1;
		//s = s + 1;
		//System.out.println(s);
		
		short s = 1;
		s += 1; //������ s = s + 1;
		System.out.println(s);
	}
}