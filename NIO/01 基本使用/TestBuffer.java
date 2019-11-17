import org.junit.Test;

import java.nio.ByteBuffer;

/**
 * NIO：比原来的IO更高效，基于缓冲区和通道
 * 区别：
 *  1.NIO：面向缓冲区、非阻塞IO、支持选择器
 *  2.IO：面向流、阻塞IO，不支持选择器
 *
 * 缓冲区和通道
 *  1.通道：原来的IO通过流连接程序和文件，传输数据；NIO通过通道传输数据；
 *  2.缓冲区：NIO将数据封装在缓冲区中，缓冲区在通道内移动；缓冲区负责数据的存取；缓冲区可以提高效率
 *
 * 缓冲区本质：数组，存储不同类型的数据
 * 缓冲区分类（Boolean除外）：ByteBuffer（最常用）、CharBuffer、ShortBuffer、LongBuffer、IntBuffer、FloatBuffer、DoubleBuffer
 *
 * 缓冲区的使用方法
 *  1.allocate()：获取缓冲区
 *  2.put()：存数据
 *  3.get()：取数据
 *  4.hasRemainning(): 还有没有可以操作的数据
 *  5.hasRemainning(): 还有几个可以操作的数据
 *
 * 缓冲区的4个核心属性
 *  1.capacity()：容量（最大存储量），一旦声明不能改变
 *  2.limit()：界限（指示可以操作数据的多少）；写模式中，limit=capacity（在数组末尾），因为只要数据有空位就能写
 *  读模式中，limit移动到已有数据的末尾，因为只能读已有的数据，没有数据额定空位置不能读
 *  3.position()：正在操作的数据的位置
 *  4.mark()：标记当前position的位置，可以在以后某个时刻通过reset()复位到此标记处
 *
 *  position <= limit <= capacity
 *
 *
 */
public class TestBuffer {
    @Test
    public void test1() {
        String str = "abcde";

        //1.分配一个指定大小的缓冲区
        ByteBuffer buf = ByteBuffer.allocate(1024);
        System.out.println("-------------alocate()-------------");
        System.out.println(buf.capacity());
        System.out.println(buf.limit());
        System.out.println(buf.position());

        //2.写数据
        //写数据不改变limit
        buf.put(str.getBytes());
        System.out.println("-------------put()以后-------------");
        System.out.println(buf.capacity()); //不变
        System.out.println(buf.limit());    //不变
        System.out.println(buf.position()); //向前移动5位，因为"abcde"占5字节


        //3.切换为读模式：flip()
        //读数据改变limit，limit移动到已有数据的末尾
        System.out.println("-------------切换为读模式-------------");
        buf.flip();
        System.out.println(buf.capacity()); //1024
        System.out.println(buf.limit());    //变为5
        System.out.println(buf.position()); //0


        //4.读数据
        byte[] dst = new byte[buf.limit()];
        buf.get(dst);
        System.out.println("-------------get()以后-------------");
        System.out.println("缓冲区中数据库：" + new String(dst, 0, dst.length));
        System.out.println(buf.capacity()); //1024
        System.out.println(buf.limit());    //5
        System.out.println(buf.position()); //5


        //5.rewind()：复位，从初始位置读取
        System.out.println("-------------rewind()以后-------------");
        buf.rewind();
        System.out.println(buf.capacity()); //1024
        System.out.println(buf.limit());    //5
        System.out.println(buf.position()); //0


        //6.clear(): 清空缓冲区，limit回到末尾
        //但缓冲区中的数据依然存在，只是出于被遗忘状态——不知道数据的具体位置，不知道有多少
        System.out.println("-------------clear()以后-------------");
        buf.clear();
        System.out.println(buf.capacity()); //1024
        System.out.println(buf.limit());    //1024
        System.out.println(buf.position()); //0

        System.out.println((char)buf.get());    //a;clear()不会删除数据，只是处于被遗忘状态
    }



    @Test
    public void test2() {
        String str = "abcde";
        ByteBuffer buf = ByteBuffer.allocate(1024);
        buf.put(str.getBytes());
        buf.flip();
        byte[] dst = new byte[buf.limit()];
        buf.get(dst, 0, 2); //读取前2个字符
        System.out.println(new String(dst, 0, 2));  //打印前2个字符
        System.out.println(buf.position()); //position=2

        //mark标记
        buf.mark();
        buf.get(dst, 2, 2); //读取第2~3个字符
        System.out.println(new String(dst, 2, 2));  //打印第2~3个字符
        System.out.println(buf.position()); //4
        buf.reset();    //复位
        System.out.println(buf.position()); //2

        //hasRemaining(): 还有没有可以操作的数据
        System.out.println(buf.hasRemaining()); //true
        if (buf.hasRemaining()) {
            System.out.println(buf.remaining());    //3
        }

    }
}
