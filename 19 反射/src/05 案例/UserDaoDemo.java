package cn.itcast_05;

public class UserDaoDemo {
	public static void main(String[] args) {
		// �������û�����
		UserDao ud = new UserDaoImpl();
		ud.add();
		ud.delete();
		ud.update();
		ud.find();
		System.out.println("---------");
		// ��ʵ������Ӧ��������
		// ��ÿ������ִ��ǰ������Ƿ���Ȩ�޲��������Ҳ�������Ҫ���¼�¼
		UserDao ud2 = new UserDaoImpl2();
		ud2.add();
		ud2.delete();
		ud2.update();
		ud2.find();
		
		StudentDao sd = new StudentDaoImpl();
		sd.login();
		sd.regist();
		System.out.println("---------");

		sd2.login();
		sd2.regist();
	}
}
