package Demo_07;

/*
 * ���󣺰������е����ݰ���ָ������ʽƴ�ӳ�һ���ַ������ѷ�����װ��
 * ���룺
 * 		int[] arr = {1,2,3};	
 * �����
 *		"[1, 2, 3]"
 * ������
 * 		1.����һ���ַ�����������Ϊ��
 * 		2.�Ȱ��ַ���ƴ��һ��"["
 * 		3.����int���飬�õ�ÿһ��Ԫ��
 * 		4.���жϸ�Ԫ���Ƿ�Ϊ���һ��
 * 			�ǣ���ֱ��ƴ��Ԫ�غ�"]"
 * 			���ǣ���ƴ��Ԫ�غͶ����Լ��ո�
 * 		5.���ƴ�Ӻ���ַ���
 * 
 */
public class StringTest2 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };

		//дһ�����ܣ�ʵ�ֽ��
		String result = arrayToString(arr);
		System.out.println("���ս���ǣ�" + result);
	}


	public static String arrayToString(int[] arr) {
		//����һ���ַ���
		String s = "";

		//�Ȱ��ַ���ƴ��һ��"["
		s += "[";

		//����int���飬�õ�ÿһ��Ԫ��
		for (int x = 0; x < arr.length; x++) {
			//���жϸ�Ԫ���Ƿ�Ϊ���һ��
			if (x == arr.length - 1) {
				//��ֱ��ƴ��Ԫ�غ�"]"
				s += arr[x];
				s += "]";
			} else {
				//��ƴ��Ԫ�غͶ����Լ��ո�
				s += arr[x];
				s += ", ";
			}
		}

		return s;
	}
}
