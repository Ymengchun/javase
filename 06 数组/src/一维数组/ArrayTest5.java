/*
	���󣺲���ָ��Ԫ�ص�һ���������г��ֵ�����
	
	������
		1.����һ�����飬����̬��ʼ����
		2.дһ������ʵ��
			�������飬���λ�ȡ�����е�ÿһ��Ԫ�أ�����֪�����ݽ��бȽ�
			�����ȣ��ͷ��ص�ǰ������ֵ��
*/
class ArrayTest5 {
	public static void main(String[] args) {
		//����һ�����飬����̬��ʼ��
		int[] arr = {200,250,38,888,444};
		
		//������Ҫ����250����������е�һ�γ��ֵ�����
		int index = getIndex(arr,250);
		System.out.println("250�������е�һ�γ��ֵ������ǣ�"+index);
		
		int index2 = getIndex2(arr,250);
		System.out.println("250�������е�һ�γ��ֵ������ǣ�"+index2);
		
		int index3 = getIndex2(arr,2500);
		System.out.println("2500�������е�һ�γ��ֵ������ǣ�"+index3);
	}
	
	//����һ
	public static int getIndex(int[] arr,int value) {
		//�������飬���λ�ȡ�����е�ÿһ��Ԫ�أ�����֪�����ݽ��бȽ�
		for(int x=0; x<arr.length; x++) {
			if(arr[x] == value) {
				//�����ȣ��ͷ��ص�ǰ������ֵ��
				return x;
			}
		}
		
		//����Ҳ������ݣ�����-1��һ��Ҫ�����������������������
		return -1;
	}
	
	
	//������
	public static int getIndex2(int[] arr,int value) {
		//����һ������
		int index = -1;
		
		//�о��޸�����ֵ
		for(int x=0; x<arr.length; x++) {
			if(arr[x] == value) {
				index = x;
				break;
			}
		}
		
		//����index
		return index;
	}
}