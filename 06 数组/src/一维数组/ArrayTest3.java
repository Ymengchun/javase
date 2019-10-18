/*
	����������Ԫ������ (���ǰ�Ԫ�ط�ת)
	
	������
		1.����һ�����飬��̬��ʼ����
		2.˼·
			��0������arr.length-1�����ݽ���
			��1������arr.length-2�����ݽ���
			...
			ֻҪ����arr.length/2��ʱ�򼴿ɡ�
*/
class ArrayTest3 {
	public static void main(String[] args) {
		//����һ�����飬��̬��ʼ����
		int[] arr = {12,98,50,34,76};
		
		//����ǰ
		System.out.println("����ǰ��");
		printArray(arr);
		
		//�����
		System.out.println("�����");
		//reverse(arr);	//һ�㷽��
		reverse2(arr);	//˫ָ�뷨
		printArray(arr);
	}
	
	//����һ��һ�㷽��
	public static void reverse(int[] arr) {
		for(int x=0; x<arr.length/2; x++) {
			int temp = arr[x];
			arr[x] = arr[arr.length-1-x];
			arr[arr.length-1-x] = temp;
		}
	}
	
	//��������˫ָ�뷨
	public static void reverse2(int[] arr) {
		for(int start=0, end=arr.length-1; start<=end; start++, end--) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
		}
	}
	
	//��������
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