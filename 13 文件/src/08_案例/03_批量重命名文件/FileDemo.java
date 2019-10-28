package File_09;

import java.io.File;

/*
 * 需求：把"E:\评书\三国演义"下面的视频名称修改为00?_介绍.avi，
 * 例如：将三国演义_001_[评书网-今天很高兴,明天就IO了]_桃园三结义.avi 改成 001_桃园三结义.avi
 * 
 * 思路：
 * 		1：封装目录
 * 		2：获取该目录下所有的文件的File数组
 * 		3：遍历该File数组，得到每一个File对象
 * 		4：拼接一个新的名称，然后重命名即可。
 */
public class FileDemo {
	public static void main(String[] args) {
		// 封装目录
		File srcFolder = new File("E:\\评书\\三国演义");

		// 获取该目录下所有的文件的File数组
		File[] fileArray = srcFolder.listFiles();

		// 遍历该File数组，得到每一个File对象
		for (File file : fileArray) {
			
			String name = file.getName(); 	// 三国演义_001_[评书网-今天很高兴,明天就IO了]_桃园三结义.avi
			

			//获取子字符串“001”
			int index = name.indexOf("_");	//获取第一个下划线的索引
			String numberString = name.substring(index + 1, index + 4);		//截取第一个下划线之后的三位（即001）
			

			//获取子字符串“介绍.avi”，如“桃园三结义.avi”
			int endIndex = name.lastIndexOf('_');	//获取最后一个下划线的索引
			String nameString = name.substring(endIndex);	//截取“桃园三结义.avi”
			

			//拼接：001_桃园三结义.avi
			String newName = numberString.concat(nameString);
			

			// 重命名即可
			file.renameTo(new File(srcFolder, newName));
		}
	}
}
