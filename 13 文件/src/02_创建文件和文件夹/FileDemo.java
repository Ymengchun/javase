package File_02;

import java.io.File;
import java.io.IOException;

/*
 *�����ļ���
 *	1.public boolean createNewFile()�������ļ�������true�����ļ��Ѵ��ھͲ��ٴ���������false��
 *	2.public boolean mkdir()�������ļ��У�����true�����ļ����Ѵ��ھͲ��ٴ���������false��
 *	3.public boolean mkdirs()�������༶�ļ��У�������ļ��в����ڣ����Զ�������
 *
 *ע�⣺
 *	1.��ȷĿ�ģ������ļ��л����ļ�
 *	2.�����ļ���ǰ�᣺�ļ�����Ŀ¼���ڣ�������׳��쳣��createNewFile()���쳣����������������ȴ���Ŀ¼���ٴ����ļ���
 *  	3.����Ŀ¼��ǰ�᣺��Ŀ¼�ĸ�Ŀ¼���ڣ�����Ŀ¼�����ڲ����׳��쳣��mkdir()û���쳣����������������ȴ�����Ŀ¼���ٴ�����Ŀ¼��
 *  	4.�������༶�ļ��У��Ƽ���mkdirs()
 */
public class FileDemo {
	public static void main(String[] args) throws IOException {
		// ������Ҫ��e��Ŀ¼�´���һ���ļ���demo
		File file = new File("e:\\demo");
		System.out.println("mkdir:" + file.mkdir());

		// ������Ҫ��e��Ŀ¼demo�´���һ���ļ�a.txt
		File file2 = new File("e:\\demo\\a.txt");
		System.out.println("createNewFile:" + file2.createNewFile());

		// ������Ҫ��e��Ŀ¼test�´���һ���ļ�b.txt
		// Exception in thread "main" java.io.IOException: ϵͳ�Ҳ���ָ����·����
		// ע�⣺Ҫ����ĳ��Ŀ¼�´������ݣ���Ŀ¼���ȱ�����ڡ�
		// ������ȴ��������ڵ�Ŀ¼��Ȼ���ٴ����ļ���
		// File file3 = new File("e:\\test\\b.txt");
		// System.out.println("createNewFile:" + file3.createNewFile());

		// ������Ҫ��e��Ŀ¼test�´���aaaĿ¼
		// File file4 = new File("e:\\test\\aaa");
		// System.out.println("mkdir:" + file4.mkdir());
		// File file5 = new File("e:\\test");
		// File file6 = new File("e:\\test\\aaa");
		// System.out.println("mkdir:" + file5.mkdir());
		// System.out.println("mkdir:" + file6.mkdir());

		
		File file7 = new File("e:\\aaa\\bbb\\ccc\\ddd");	//mkdirs()���ʺϴ����༶�ļ���
		System.out.println("mkdirs:" + file7.mkdirs());


		File file8 = new File("e:\\liuyi\\a.txt");		//������a.txt��һ���ļ��У�a.txt���ļ�������Ϊmkdirs()ֻ�ܴ����ļ���
		System.out.println("mkdirs:" + file8.mkdirs());
	}
}
