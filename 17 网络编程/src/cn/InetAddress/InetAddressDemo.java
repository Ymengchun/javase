import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * InetAddress类的成员方法
 */


public class InetAddressDemo {
	public static void main(String[] args) throws UnknownHostException {
		//public static InetAddress getByName(String host)
		InetAddress address = InetAddress.getByName("192.168.12.63");

		//public String getHostName()：获取主机名
		String name = address.getHostName();
        System.out.println(name);

		//public String getHostAddress()：获取IP地址
		String ip = address.getHostAddress();
		System.out.println(ip);
	}
}