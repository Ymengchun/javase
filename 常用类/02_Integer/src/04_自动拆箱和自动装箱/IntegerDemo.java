package Demo_05;

/*
 * JDK5��������
 * 		1���Զ�װ�䣺�������� �� ��װ��
 * 		2���Զ����䣺��װ�� �� ��������
 * 
 * NullPointerException����ָ���쳣����
 * 		Integer x = null;	����NullPointerException��
 * 		���飺���ж��Ƿ�Ϊnull��Ȼ����ʹ�á�
 */
public class IntegerDemo {
	public static void main(String[] args) {

		Integer ii = 100;	//�Զ�װ�䣬�൱��Integer i = new Integer(100);
		int b = ii;	//�Զ����䣬�����int���ұ���Integer
		ii += 200;	//Integer��int��ӣ�Integer�Զ�����Ϊint
		System.out.println("ii:" + ii);

		//ͨ���������Ĵ��루�������Զ�ִ�еĴ��룩
		//Integer ii = Integer.valueOf(100); //�Զ�װ��
		//ii = Integer.valueOf(ii.intValue() + 200); //�Զ����䣬���Զ�װ��
		//System.out.println((new StringBuilder("ii:")).append(ii).toString());

		Integer iii = null;
		//NullPointerException
		if (iii != null) {
			iii += 1000;
			System.out.println(iii);
		}
	}
}
