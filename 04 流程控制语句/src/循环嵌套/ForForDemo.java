package s5_ѭ��Ƕ��;
/*
	���������һ��4��5�е�����(*)ͼ����
	�����
		*****
		*****
		*****
		*****
		
	ѭ��Ƕ�ף�ѭ���л���ѭ��.
	
	���ۣ�
		��ѭ����������
		��ѭ����������
*/
class ForForDemo {
	public static void main(String[] args) {
		//ԭʼ����
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("-------------");
		
		//Ƕ��ѭ���Ľ�
		for(int y=0; y<4; y++) {
			for(int x=0; x<5; x++) {
				System.out.print("*");
			}
			//���ǿ���ͨ���յ�������ʵ�ֻ��У�System.out.println();
			System.out.println();
		}
	}
}