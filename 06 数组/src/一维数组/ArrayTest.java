/*
	���������������������е�ÿһ��Ԫ�ء�
	
	������.length����ȡ���鳤��
*/
class ArrayTest {
	public static void main(String[] args) {
		//��������
		int[] arr = {11,22,33,44,55};
		
		//��ȡÿһ��Ԫ��
		for(int x=0; x<arr.length; x++) {
			System.out.println(arr[x]);
		}
		System.out.println("--------------------");
	}
		
	
	//������������װ
	public static void printArray(int[] arr) {
		System.out.print("[");
		for(int x=0; x<arr.length; x++) {
			if(x == arr.length-1) { //�������һ��Ԫ��
				System.out.println(arr[x]+"]");
			}else {
				System.out.print(arr[x]+", ");
			}
		}
	}
}