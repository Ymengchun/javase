package cn.itcast_02;

/*
 * ʹ�ú��ι��캯����ö����
 */
public enum Direction2 {
	FRONT("ǰ"), BEHIND("��"), LEFT("��"), RIGHT("��");

	private String name;	//������˽��

	private Direction2(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	// toString()Ĭ�Ϸ���ö��������֣�������д
	// @Override
	// public String toString() {
	// return "�Ұ�����ϼ";
	// }
}
