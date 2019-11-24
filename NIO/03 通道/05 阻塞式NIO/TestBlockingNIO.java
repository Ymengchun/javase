import org.junit.Test;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * Client-Server
 * 选择器：监控每个通道的I/O状态，当Client的某个通道转备就绪时，选择器将对应的任务分配给Server的线程再运行
 *
 * 一、使用NIO完成网络通信的三个核心
 *  1.通道：负责连接
 *      java.nio.channels.Channel 接口：
 *          |--SelectableChannel
 *              |--SocketChannel
 *              |--ServerSocketChannel
 *              |--DatagramChannel
 *
 *              |--Pipe.SinkChannel
 *              |--Pipe.SourceChannel
 *  2.缓冲区：负责数据的存取
 *  3.选择器
 *
 *  有以上三个是非阻塞式NIO，现在先来看阻塞式NIO
 */

//阻塞式NIO
public class TestBlockingNIO {
    //客户端
    @Test
    public void client() throws IOException {
        //1.获取通道
        //写你自己的IP地址
        SocketChannel socketChannel = SocketChannel.open(new InetSocketAddress("192.168.0.101", 9999));
        FileChannel inChannel = FileChannel.open(Paths.get("1.jpg"), StandardOpenOption.READ);

        //2.分配指定大小的缓冲区
        ByteBuffer buf = ByteBuffer.allocate(1024);

        //3.读取本地文件，并发送到服务器
        while ((inChannel.read(buf)) != -1) {
            buf.flip();
            socketChannel.write(buf);
            buf.clear();
        }

        //4.关闭通道
        inChannel.close();
        socketChannel.close();

    }


    //服务器端
    @Test
    public void server() throws IOException {
        ServerSocketChannel ssChannel = ServerSocketChannel.open();
        FileChannel outChannel = FileChannel.open(Paths.get("2.jpg"), StandardOpenOption.WRITE, StandardOpenOption.CREATE);

        //2.绑定连接
        ssChannel.bind(new InetSocketAddress(9999));

        //3.获取客户端连接的通道
        SocketChannel socketChannel = ssChannel.accept();

        //4.分配指定大小的缓冲区
        ByteBuffer buf = ByteBuffer.allocate(1024);

        //5.接收客户端的数据，并保存到本地
        while ((socketChannel.read(buf)) != -1) {
            buf.flip();
            outChannel.write(buf);
            buf.clear();
        }

        //6.关闭通道
        socketChannel.close();
        outChannel.close();
    }


}
