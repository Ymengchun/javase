package s3_ѭ���ṹ_while;
/*
	whileѭ����forѭ�������ó���?
		1.�������ѭ�������󣬼���ʹ�ÿ����������Ǹ���������whileѭ����������forѭ������֪����forѭ����
		2.֪��������Χ����forѭ������֪����whileѭ��				
*/
class WhileDemo4 {
	public static void main(String[] args) {
		//forѭ��ʵ��
		for(int x=0; x<10; x++) {
			System.out.println("ѧϰJava�����ļ�ǿ,�й��������ǲ���");
		}
		//���ﲻ���ڼ���������
		//System.out.println(x);
		
		//whileѭ��ʵ��
		int y = 0;
		while(y<10) {
			System.out.println("ѧϰJava�����ļ�ǿ,�й��������ǲ���");
			y++;
		}
		//�����ǿ��Լ������ʵ�
		System.out.println(y);
	}
} 