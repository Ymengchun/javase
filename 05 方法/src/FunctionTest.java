/*
	����������¼���������ݣ����ؽϴ�ֵ
*/
import java.util.Scanner;

class FunctionTest {
	public static void main(String[] args) {
		//��������¼�����
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�������һ������:");
		int a = sc.nextInt();
		
		System.out.println("������ڶ�������:");
		int b = sc.nextInt();
		
		int result = getMax(a,b);
		System.out.println("�ϴ�ֵ�ǣ�"+result);
	}
	
	/*
		�����������еĽϴ�ֵ
		������ȷ��
			����ֵ���ͣ�int
			�����б�int a,int b			
	*/
	public static int getMax(int a,int b) {
		return ((a>b)? a : b);
	}
}