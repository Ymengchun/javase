package Demo_02;

/*
 * ѡ������
 */
public class ArrayDemo {
	public static void main(String[] args) {
		//����һ������
		int[] arr = { 24, 69, 80, 57, 13 };
		System.out.println("����ǰ��");
		printArray(arr);
		
		//�����
		selectSort(arr);
		System.out.println("�����");
		printArray(arr);

	}
	
	//ѡ�������㷨
	public static void selectSort(int[] arr){
		for(int x = 0; x < arr.length - 1; x++){
			for(int y=x+1; y < arr.length; y++){
				if(arr[y] < arr[x]){
					int temp = arr[x];
					arr[x] = arr[y];
					 arr[y] = temp;
				}
			}
		}
	}

	//��������
	public static void printArray(int[] arr) {
		System.out.print("[");
		for (int x = 0; x < arr.length; x++) {
			if (x == arr.length - 1) {
				System.out.print(arr[x]);
			} else {
				System.out.print(arr[x] + ", ");
			}
		}
		System.out.println("]");
	}
}
