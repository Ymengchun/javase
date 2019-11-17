import org.junit.Test;

import java.nio.ByteBuffer;

/**
 * 非直接缓冲区：通过allocate()分配缓冲区，缓冲区建立在JVM内存中
 * 直接缓冲区：通过allocateDirect()分配缓冲区，缓冲区直接建立在物理内存中，效率更高；但不安全，且对内存资源消耗大
 *
 * 两者对数据的存储方法基本相同
 */
public class TestDirectBuffer {
    @Test
    public void test() {
        //分配直接缓冲区
        ByteBuffer buf = ByteBuffer.allocateDirect(1024);

        //判断是否为直接缓冲区
        System.out.println(buf.isDirect());
    }
}
