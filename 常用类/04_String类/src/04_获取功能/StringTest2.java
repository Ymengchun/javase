package Demo_04;

/*
 * ����ͳ��һ���ַ����д�д��ĸ�ַ���Сд��ĸ�ַ��������ַ����ֵĴ�����(�����������ַ�)
 * ������
 * 		"Hello123World"
 * �����
 * 		��д�ַ���2��
 * 		Сд�ַ���8��
 * 		�����ַ���3��
 * 
 * ������
 * 		ǰ�᣺�ַ���Ҫ����
 * 		1.��������ͳ�Ʊ���
 * 			bigCount=0
 * 			smallCount=0
 * 			numberCount=0
 * 		2.�����ַ������õ�ÿһ���ַ���
 * 			length()��charAt()���
 * 		3.�жϸ��ַ������������������͵�
 * 			��bigCount++
 * 			С��smallCount++
 * 			���֣�numberCount++
 * 
 * 		  ����һ��
 * 			ASCII���
 * 				0	48
 * 				A	65
 * 				a	97
 * 		 ��������
 * 			char ch = s.charAt(x);
 * 			if(ch>='0' && ch<='9') numberCount++
 * 			if(ch>='a' && ch<='z') smallCount++
 * 			if(ch>='A' && ch<='Z') bigCount++
 *		
 *		4.������
 *
 * ��ϰ���Ѹ����ַ����ķ�ʽ���Ľ�Ϊ����¼���ַ����ķ�ʽ��
 */
public class StringTest2 {
	public static void main(String[] args) {
		//����һ���ַ���
		String s = "Hello123World";
		
		//��������ͳ�Ʊ���
		int bigCount = 0;
		int smallCount = 0;
		int numberCount = 0;
		
		//�����ַ������õ�ÿһ���ַ���
		for(int x=0; x<s.length(); x++){
			char ch = s.charAt(x);
			
			//�жϸ��ַ������������������͵�
			if(ch>='a' && ch<='z'){
				smallCount++;
			}else if(ch>='A' && ch<='Z'){
				bigCount++;
			}else if(ch>='0' && ch<='9'){
				numberCount++;
			}
		}
		
		//��������
		System.out.println("��д��ĸ"+bigCount+"��");
		System.out.println("Сд��ĸ"+smallCount+"��");
		System.out.println("����"+numberCount+"��");
	}
}