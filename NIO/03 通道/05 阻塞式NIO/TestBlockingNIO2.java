import org.junit.Test;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

//改进：服务器反馈，客户端接收反馈
public class TestBlockingIO2 {
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


        //接收服务器端反馈
        int len = 0;
        while ((len = socketChannel.read(buf)) != -1) {
            buf.flip();
            System.out.println(new String(buf.array(), 0, len));
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


        //给服务器端反馈
        buf.put("服务器端接收数据成功".getBytes());
        buf.flip();
        socketChannel.write(buf);


        //6.关闭通道
        socketChannel.close();
        outChannel.close();
    }
}