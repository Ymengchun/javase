package cn.itcast_05;

public class UserDaoDemo {
	public static void main(String[] args) {
		// 基本的用户操作
		UserDao ud = new UserDaoImpl();
		ud.add();
		ud.delete();
		ud.update();
		ud.find();
		System.out.println("---------");
		// 真实的需求应该这样：
		// 在每个操作执行前，检测是否有权限操作；并且操作者需要留下记录
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
