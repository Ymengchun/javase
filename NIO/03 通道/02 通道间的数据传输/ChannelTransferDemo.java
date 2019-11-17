import org.junit.Test;

import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * 通道间的数据传输（直接缓冲器）：操作更简单
 *  1.TransferFrom()
 *  2.TransferTo()
 */
public class ChannelTransferDemo {
    @Test
    public void test() throws IOException {
        //操作文件
        FileChannel inChannel = FileChannel.open(Paths.get("C:\\Users\\Administrator\\Desktop\\1.jpg"), StandardOpenOption.READ);
        FileChannel outChannel = FileChannel.open(Paths.get("C:\\Users\\Administrator\\Desktop\\2.jpg"), StandardOpenOption.WRITE, StandardOpenOption.READ, StandardOpenOption.CREATE);
        inChannel.transferTo(0, inChannel.size(), outChannel);

        inChannel.close();
        outChannel.close();
    }
}
