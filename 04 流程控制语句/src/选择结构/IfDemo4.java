package s9_ѡ��ṹ;
/*
	��Ԫ�������if��������
		��Ԫ�����ʵ�ֵģ������Բ���if���ʵ�֡���֮��������
		
		ʲôʱ��if��䲻������Ԫ�����ʵ����?
			��if�����ƵĲ�����һ���������ʱ��Ͳ��С�
			��Ϊ��Ԫ������ļ�������boolean���ͣ�������һ�������
*/
class IfDemo4 {
	public static void main(String[] args) {
		//��ȡ�������ݵ����ֵ
		int a = 10;
		int b = 20;
		
		//��if���ʵ��
		int max1;
		if(a > b) {
			max1 = a;
		}else {
			max1 = b;
		}
		System.out.println("max1:"+max1);
		
		//����Ԫ������Ľ�
		int max2 = (a > b)? a: b;
		System.out.println("max2:"+max2);
		System.out.println("----------");
		
		//�ж�һ����������������ż��,���������������ż��
		int x = 100;
		
		if(x%2 == 0) {
			System.out.println("100��һ��ż��");
		}else {
			System.out.println("100��һ������");
		} 
		
		//����Ԫ�Ľ�
		//���ָĽ��Ǵ���ġ�
		//String s = (x%2 == 0)?System.out.println("100��һ��ż��");:System.out.println("100��һ������");;
	}
}