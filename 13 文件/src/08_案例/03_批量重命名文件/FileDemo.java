package File_09;

import java.io.File;

/*
 * ���󣺰�"E:\����\��������"�������Ƶ�����޸�Ϊ00?_����.avi��
 * ���磺����������_001_[������-����ܸ���,�����IO��]_��԰������.avi �ĳ� 001_��԰������.avi
 * 
 * ˼·��
 * 		1����װĿ¼
 * 		2����ȡ��Ŀ¼�����е��ļ���File����
 * 		3��������File���飬�õ�ÿһ��File����
 * 		4��ƴ��һ���µ����ƣ�Ȼ�����������ɡ�
 */
public class FileDemo {
	public static void main(String[] args) {
		// ��װĿ¼
		File srcFolder = new File("E:\\����\\��������");

		// ��ȡ��Ŀ¼�����е��ļ���File����
		File[] fileArray = srcFolder.listFiles();

		// ������File���飬�õ�ÿһ��File����
		for (File file : fileArray) {
			
			String name = file.getName(); 	// ��������_001_[������-����ܸ���,�����IO��]_��԰������.avi
			

			//��ȡ���ַ�����001��
			int index = name.indexOf("_");	//��ȡ��һ���»��ߵ�����
			String numberString = name.substring(index + 1, index + 4);		//��ȡ��һ���»���֮�����λ����001��
			

			//��ȡ���ַ���������.avi�����硰��԰������.avi��
			int endIndex = name.lastIndexOf('_');	//��ȡ���һ���»��ߵ�����
			String nameString = name.substring(endIndex);	//��ȡ����԰������.avi��
			

			//ƴ�ӣ�001_��԰������.avi
			String newName = numberString.concat(nameString);
			

			// ����������
			file.renameTo(new File(srcFolder, newName));
		}
	}
}
