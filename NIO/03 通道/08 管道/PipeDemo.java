import org.junit.Test;
import sun.invoke.util.BytecodeName;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Pipe;

/**
 * 管道（Pipe）：NIO中两个线程间的单向数据连接
 * 组成：source通道、sink通道。数据写到sink通道，从source通道读取
 */
public class PipeDemo {
    @Test
    public void test() throws IOException {
        //1.获取管道
        Pipe pipe = Pipe.open();

        //2.将缓冲区数据写入管道
        ByteBuffer buf = ByteBuffer.allocate(1024);

        Pipe.SinkChannel sinkChannel = pipe.sink();
        buf.put("发送数据".getBytes());
        buf.flip();
        sinkChannel.write(buf);


        //读缓冲区的数据
        Pipe.SourceChannel sourceChannel = pipe.source();
        buf.flip();
        int len = sourceChannel.read(buf);
        System.out.println(new String(buf.array(), 0, len));


        sinkChannel.close();
        sourceChannel.close();
    }
}
