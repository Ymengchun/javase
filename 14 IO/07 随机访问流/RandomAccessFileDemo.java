package IO_05;

import java.io.IOException;
import java.io.RandomAccessFile;

/*
 * �����������
 * 		RandomAccessFile�಻����������Object������ࡣ
 * 		���ں���InputStream��OutputStream�Ĺ��ܣ�֧�ֶ��ļ��������д��
 *
 * public RandomAccessFile(String name, String mode)����һ���������ļ�·�����ڶ��������ǲ����ļ���ģʽ��
 * 		ģʽ�����֣����õ���"rw"������ģʽ��ʾ�ȿ���д���ݣ�Ҳ���Զ�����
 * 	**"r" : ** ��ֻ����ʽ�򿪡����ý��������κ� write �������������׳� IOException��
 * 	"rw": ���Ա��ȡ��д�롣
 * 	"rws": ���Ա��ȡ��д�롣����� "rw"��"rws" ��Ҫ��ԡ��ļ������ݡ���Ԫ���ݡ���ÿ�����¶�ͬ��д�뵽�����洢�豸��
 * 	"rwd" : ���Ա��ȡ��д�룬����� "rw"��"rwd" ��Ҫ��ԡ��ļ������ݡ���ÿ�����¶�ͬ��д�뵽�����洢�豸��	
 */
public class RandomAccessFileDemo {
    public static void main(String[] args) throws IOException {
        //write();
        read();
    }

    private static void read() throws IOException {
        //�����������������
        RandomAccessFile raf = new RandomAccessFile("raf.txt", "rw");

        int i = raf.readInt();	//��һ��������
        System.out.println(i);

        //���ļ�ָ�����ͨ�� getFilePointer������ȡ����ͨ��seek�������á�
        System.out.println("��ǰ�ļ���ָ��λ���ǣ�" + raf.getFilePointer());

        char ch = raf.readChar();	//��һ���ַ�
        System.out.println(ch);
        System.out.println("��ǰ�ļ���ָ��λ���ǣ�" + raf.getFilePointer());

        String s = raf.readUTF();
        System.out.println(s);
        System.out.println("��ǰ�ļ���ָ��λ���ǣ�" + raf.getFilePointer());

        //����������ȡ
        raf.seek(4);
        ch = raf.readChar();
        System.out.println(ch);
    }

    private static void write() throws IOException {
        //�����������������
        RandomAccessFile raf = new RandomAccessFile("raf.txt", "rw");

        raf.writeInt(100);		//дһ��������
        raf.writeChar('a');		//дһ���ַ�
        raf.writeUTF("�й�");		//дһ���ַ���

        raf.close();
    }
}