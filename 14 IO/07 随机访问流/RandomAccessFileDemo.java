package IO_05;

import java.io.IOException;
import java.io.RandomAccessFile;

/*
 * 随机访问流：
 * 		RandomAccessFile类不属于流，是Object类的子类。
 * 		它融合了InputStream和OutputStream的功能，支持对文件的随机读写。
 *
 * public RandomAccessFile(String name, String mode)：第一个参数是文件路径，第二个参数是操作文件的模式。
 * 		模式有四种，常用的是"rw"，这种模式表示既可以写数据，也可以读数据
 * 	**"r" : ** 以只读方式打开。调用结果对象的任何 write 方法都将导致抛出 IOException。
 * 	"rw": 打开以便读取和写入。
 * 	"rws": 打开以便读取和写入。相对于 "rw"，"rws" 还要求对“文件的内容”或“元数据”的每个更新都同步写入到基础存储设备。
 * 	"rwd" : 打开以便读取和写入，相对于 "rw"，"rwd" 还要求对“文件的内容”的每个更新都同步写入到基础存储设备。	
 */
public class RandomAccessFileDemo {
    public static void main(String[] args) throws IOException {
        //write();
        read();
    }

    private static void read() throws IOException {
        //创建随机访问流对象
        RandomAccessFile raf = new RandomAccessFile("raf.txt", "rw");

        int i = raf.readInt();	//读一个整型数
        System.out.println(i);

        //该文件指针可以通过 getFilePointer方法读取，并通过seek方法设置。
        System.out.println("当前文件的指针位置是：" + raf.getFilePointer());

        char ch = raf.readChar();	//读一个字符
        System.out.println(ch);
        System.out.println("当前文件的指针位置是：" + raf.getFilePointer());

        String s = raf.readUTF();
        System.out.println(s);
        System.out.println("当前文件的指针位置是：" + raf.getFilePointer());

        //根据索引读取
        raf.seek(4);
        ch = raf.readChar();
        System.out.println(ch);
    }

    private static void write() throws IOException {
        //创建随机访问流对象
        RandomAccessFile raf = new RandomAccessFile("raf.txt", "rw");

        raf.writeInt(100);		//写一个整型数
        raf.writeChar('a');		//写一个字符
        raf.writeUTF("中国");		//写一个字符串

        raf.close();
    }
}