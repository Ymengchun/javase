package s2_ѭ������_for;
/*
	�������1-10֮������֮��
	
	������
		0+1=1
			1+2=3
				3+3=6
					6+4=10
						10+5=15
							 ...
							 
	
*/
class ForDemo3 {
	public static void main(String[] args) {
		//ԭʼ����
		System.out.println(1+2+3+4+5+6+7+8+9+10);
		
		//��ѭ���Ľ�
		int sum = 0;
		
		for(int x=1; x<=10; x++) {
			sum = sum + x;
		}
		
		System.out.println("sum:"+sum);
	}
}