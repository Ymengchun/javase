/*
	���������ȡ��ֵ
	
	������
		1.����һ�����飬�Ⱦ�̬��ʼ����
		2.ѡ����Ԫ�أ�Ĭ����Ϊ��ǰ���ֵ��
		3.��������Ԫ�أ������뵱ǰ���ֵ�Ƚϣ�˭��˭�ͱ�Ϊ��ǰ���ֵ��
		4.������ֵ��
*/
class ArrayTest2 {
	public static void main(String[] args) {
		//����һ������
		int[] arr = {34,98,10,25,67};
		
		/*
		��ʼʱ��ѡ����Ԫ��Ϊ��ǰ���ֵ
		int max = arr[0];
		����������Ԫ��
		for(int x=1; x<arr.length; x++) {
			��������Ԫ�أ������뵱ǰ���ֵ�Ƚϣ�˭��˭�ͱ�Ϊ��ǰ���ֵ��
			if(arr[x] > max) {
				max = arr[x];
			}
		}
		������ֵ
		System.out.println("max:"+max);
		*/
		
		//�÷������û�ȡ���ֵ
		int max = getMax(arr);
		System.out.println("max:"+max);
			
		//�÷������û�ȡ��Сֵ
		int min = getMin(arr);
		System.out.println("min:"+min);
	}
	
	//��ȡ���ֵ�ķ���
	public static int getMax(int[] arr) {
		int max = arr[0];
		for(int x=1; x<arr.length; x++) {
			if(arr[x] > max) {
				max = arr[x];
			}
		}
		return max;
	}
	
	//��ȡ��Сֵ�ķ���
	public static int getMin(int[] arr) {
		int min = arr[0];
		for(int x=1; x<arr.length; x++) {
			if(arr[x] < min) {
				min = arr[x];
			}
		}
		return min;
	}
}