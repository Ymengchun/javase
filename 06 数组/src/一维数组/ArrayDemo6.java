/*
	��������ĳ������⣺
		ArrayIndexOutOfBoundsException����������Խ���쳣
			ԭ�򣺷����˲����ڵ�������
		
		NullPointerException����ָ���쳣
			ԭ�������Ѿ���ָ����ڴ��ˡ����㻹��������ȥ����Ԫ�ء�
*/
class ArrayDemo6 {
	public static void main(String[] args) {
		//��������
		int[] arr = {1,2,3};
		
		//Խ���쳣
		//System.out.println(arr[3]);
	
		//��ָ���쳣
		arr = null;
		System.out.println(arr[0]);
	}
}