package Demo_04;

/*
 * ���ң�
 * 		����˳���˳�����
 * 		����˳������Ҳ���
 * 
 * ������
 * 		1.���������������С����
 * 		2.������м�����
 * 		3.���м�������ֵ��Ҫ���ҵ�ֵ�Ƚ�
 * 			����ȣ����ص�ǰ���м�����
 * 			����ȣ�
 * 				�������ҡ���max = mid - 1;
 * 				С���Ұ���ҡ���min = mid + 1��
 * 		4.���¼�����м����������ص�2��
 */
public class ArrayDemo {
	public static void main(String[] args) {
		//����һ������
		int[] arr = {11,22,33,44,55,66,77};
		
		//д����ʵ��
		int index = getIndex(arr, 33);
		System.out.println("index:"+index);
		
		//�������Ԫ�ز����ں���ʲô������?
		index = getIndex(arr, 333);
		System.out.println("index:"+index);
	}
	
	/*
	 * ������ȷ��
	 * ����ֵ���ͣ�int
	 * �����б�int[] arr,int value
	 */
	public static int getIndex(int[] arr,int value){
		//���������������С����
		int max = arr.length -1;
		int min = 0;
		
		//������м�����
		int mid = (max +min)/2;
		
		//���м�������ֵ��Ҫ���ҵ�ֵ���бȽ�
		while(arr[mid] != value){
			if(arr[mid]>value){
				max = mid - 1;
			}else if(arr[mid]<value){
				min = mid + 1;
			}
			
			//�����ж�
			if(min > max){
				return -1;
			}
			
			mid = (max + min)/2;
		}
		
		return mid;
	}
}
