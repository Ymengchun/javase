package Thread_12;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/*
 * 案例：在指定的时间删除的指定的目录
 */

class DeleteFolder extends TimerTask {

	@Override
	public void run() {
		File srcFolder = new File("demo");
		deleteFolder(srcFolder);
	}

	// 递归删除目录
	public void deleteFolder(File srcFolder) {
		File[] fileArray = srcFolder.listFiles();
		if (fileArray != null) {
			for (File file : fileArray) {
				if (file.isDirectory()) {	//递归调用
					deleteFolder(file);
				} else {	//递归出口
					System.out.println(file.getName() + ":" + file.delete());	
				}
			}
			System.out.println(srcFolder.getName() + ":" + srcFolder.delete());
		}
	}
}

public class TimerTest {
	public static void main(String[] args) throws ParseException {
		Timer t = new Timer();

		String s = "2014-11-27 15:45:00";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date d = sdf.parse(s);

		t.schedule(new DeleteFolder(), d);
	}
}
