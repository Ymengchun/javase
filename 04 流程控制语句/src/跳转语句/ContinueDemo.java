package s6_��ת���;
/*
	continue:����
	
	ֻ�����ڣ�ѭ������������������䡣
		
	continue��break������
		break:�˳������һ��ѭ��
		continue:�˳�����ѭ����������һ�ε�ѭ��
		
	��ϰ�⣺
		for(int x=1; x<=10; x++) {
			if(x%3==0) {
				//�ڴ˴���д����
			}
			System.out.println(��Java�����ࡱ);
		}
		
		�����ڿ���̨���2��:��Java�����ࡰ
			break;
		�����ڿ���̨���7��:��Java�����ࡰ
			continue;
		�����ڿ���̨���13��:��Java�����ࡰ	
			System.out.println(��Java�����ࡱ);


*/
class ContinueDemo {
	public static void main(String[] args) {
		for(int x=0; x<10; x++) {
			if(x == 3) {
				//break;
				continue;
			}
			
			System.out.println(x);
		}
	}
}