import jdk.management.resource.internal.ResourceNatives;
import org.junit.Test;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * 分散读取（Scatter Read）：将通道中的数据分散到多个缓冲区中，按缓冲区顺序依次填满各个缓冲区
 * 聚集写入（Gathering Write）：将多个缓冲器的数据聚集到通道中，按缓冲区顺序将 position 和 limit 之间的数据写到通道中
 *
 * 原来是操作缓冲区，现在是操作缓冲区数组
 */


public class ChannelTransferDemo {
    @Test
    public void test() throws IOException {
        RandomAccessFile raf1 = new RandomAccessFile("1.txt", "rw");    //以可读写的方式打开文件

        //1.获取通道
        FileChannel channel1 = raf1.getChannel();

        //2.分配指定大小的缓冲区
        ByteBuffer buf1 = ByteBuffer.allocate(100);
        ByteBuffer buf2 = ByteBuffer.allocate(1024);

        //3.分散读取
        ByteBuffer[] bufs = {buf1, buf2};
        channel1.read(bufs);
        for (ByteBuffer byteBuffer : bufs) {
            byteBuffer.flip();
        }

        System.out.println(new String(bufs[0].array(), 0, bufs[0].limit()));
        System.out.println("-----------------------");
        System.out.println(new String(bufs[1].array(), 0, bufs[1].limit()));


        //4.聚集写入
        RandomAccessFile raf2 = new RandomAccessFile("2.txt", "rw");
        FileChannel channel2 = raf2.getChannel();
        channel2.write(bufs);

    }

}
