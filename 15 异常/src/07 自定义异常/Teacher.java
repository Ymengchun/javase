package Exception_08;

public class Teacher {
	public void check(int score) throws MyException {
		if (score > 100 || score < 0) {
			throw new MyException("����������0-100֮�䣡");	//�׳��Զ����쳣��Ķ���
		} else {
			System.out.println("����û������");
		}
	}

	// �� MyException�̳��� RuntimeException���Ͳ���Ҫ throws MyException����Ϊ RuntimeException������ʱ�쳣�����벻�ü��
	// public void check(int score) {	//���ﲻ��throws MyException
	// if (score > 100 || score < 0) {
	// throw new MyException();
	// } else {
	// System.out.println("����û������");
	// }
	// }
}
