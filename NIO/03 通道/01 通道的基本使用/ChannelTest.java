import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * 通道：定义在java.nio.channels中
 * 通道和流的区别：
 *  1.流：连接文件和程序，能直接传输数据
 *  2.通道：连接文件和程序，本能不能直接传输数据，需要借助Buffer传输数据
 *
 * 通道的实现类
 *  java.nio.channels.Channel接口
 *      |--FileChannel：本地
 *      |--SocketChannel：TCP
 *      |--ServerSocketChannel：TCP
 *      |--DatagramChannel：UDP
 *
 *  获取通道的方法
 *  1.getChannel()方法
 *      1.本地I/O
 *          FileInputStream/FileOutputStream
 *          RandomAccessFile
 *      2.网络I/O
 *          Socket
 *          ServerSocket
 *          DatagramSocket
 *  2.JDK1.7中为各个通道提供了open()方法
 *  3.JDK1.7中的Files工具类的newByteChannel()方法
 */
public class ChannelTest {

    //1.利用通道复制文件
    @Test
    public void test1(){
        //获取流
        FileInputStream fis = null;
        FileOutputStream fos = null;

        //获取通道
        FileChannel inChannel = null;
        FileChannel outChanel = null;

        try {
            fis = new FileInputStream("C:\\Users\\Administrator\\Desktop\\1.jpg");
            fos = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\2.jpg");


            inChannel = fis.getChannel();
            outChanel = fos.getChannel();

            //分配指定大小的缓冲区
            ByteBuffer buf = ByteBuffer.allocate(1024);

            //将通道中的数据存入缓冲区
            while ((inChannel.read(buf)) != -1) {
                buf.flip(); //切换为读模式
                outChanel.write(buf);   //将缓冲区数据写入通道
                buf.clear();    //请空缓冲区
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (outChanel != null) {
                //关闭资源
                try {
                    outChanel.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (inChannel != null) {
                try {
                    inChannel.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }


    //2.使用直接缓冲区复制文件（内存映射文件），效率更高
    //好处：不用通过通道读写，而直接在内存中操作
    @Test
    public void test2() throws IOException {
        //以读模式打开源文件
        FileChannel inChannel = FileChannel.open(Paths.get("C:\\Users\\Administrator\\Desktop\\1.jpg"), StandardOpenOption.READ);
        //以写模式打开目标文件，如果不存在则创建
        FileChannel outChannel = FileChannel.open(Paths.get("C:\\Users\\Administrator\\Desktop\\2.jpg"), StandardOpenOption.WRITE, StandardOpenOption.READ, StandardOpenOption.CREATE);

        //内存映射文件
        MappedByteBuffer inMappedBuf = inChannel.map(FileChannel.MapMode.READ_ONLY, 0, inChannel.size());
        MappedByteBuffer outMappedBuf = outChannel.map(FileChannel.MapMode.READ_WRITE, 0, inChannel.size());

        //直接读写缓冲区
        byte[] dst = new byte[inMappedBuf.limit()];
        inMappedBuf.get(dst);
        outMappedBuf.put(dst);

        inChannel.close();
        outChannel.close();
    }
}
