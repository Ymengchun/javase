import com.sun.xml.internal.fastinfoset.util.FixedEntryStringIntMap;
import org.junit.Test;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.util.Map;
import java.util.Set;

/**
 * 字符集
 *  1.编码：字符串->字符数组
 *  2.解码：字符数组->字符串
 */
public class CharSetDemo {

    //打印所有字符集
    @Test
    public void test1() {
        Map<String, Charset> map = Charset.availableCharsets(); //支持的所有字符集
        Set<Map.Entry<String, Charset>> set = map.entrySet();
        //打印所有支持的字符集
        for (Map.Entry<String, Charset> entry : set) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }


    @Test
    public void test2() throws Exception {
        Charset cs = Charset.forName("GBK");

        //获取编码器
        CharsetEncoder ce = cs.newEncoder();

        //获取解码器
        CharsetDecoder cd = cs.newDecoder();

        CharBuffer cBuf = CharBuffer.allocate(1024);
        cBuf.put("你好帅");
        cBuf.flip();

        //编码
        ByteBuffer bBuf = ce.encode(cBuf);
        for(int i=0; i<6; i++) {   //一个汉字占两字节
            System.out.println(bBuf.get());
        }

        //编码
        bBuf.flip();
        CharBuffer cBuf2 = cd.decode(bBuf);
        System.out.println(cBuf2.toString());

        //如果编码和解码的字符集不同，就会乱码
        Charset cs2 = Charset.forName("UTF-8");
        bBuf.flip();    //别忘了
        CharBuffer cBuf3 = cs2.decode(bBuf);
        System.out.println(cBuf3.toString());   //乱码
    }
}
