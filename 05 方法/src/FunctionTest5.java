/*
	����¼��һ������n(1~9)�������Ӧ�ĳ˷���
*/
import java.util.Scanner;

class FunctionTest5 {
	public static void main(String[] args) {
		//��������
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������n��ֵ(1~9)��");
		int n = sc.nextInt();
		
		//����
		printNN(n);
	}
	
	/*
		���������Ӧ��nn�˷���
		������ȷ��
			����ֵ���ͣ�void
			�����б�int n
	*/
	public static void printNN(int n) {
		for(int x=1; x<=n; x++) {	//��ѭ��������
			for(int y=1; y<=x; y++) {	//��ѭ��������
				System.out.print(y + "*" + x + "=" + y*x + "\t");
			}
			System.out.println();
		}
	}
}