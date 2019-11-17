import org.junit.Test;

import java.util.Comparator;

public class LambdaTest {

    @Test
    public void test1() {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("我爱祖国");
            }
        };
        r1.run();

        System.out.println("------------------");

        // lambda表达式
        Runnable r2 = () -> System.out.println("我爱祖国");
        r2.run();
    }

    @Test
    public void test2() {
        Comparator<Integer> c = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        };
        int compare = c.compare(11, 21);
        System.out.println(compare);

        System.out.println("------------------");

        // lambda表达式
        Comparator<Integer> c1 = (o1, o2) -> Integer.compare(o1, o2);
        int compare1 = c1.compare(11, 21);
        System.out.println(compare1);

        System.out.println("------------------");

        // 方法引用
        Comparator<Integer> c2 = Integer :: compare;
        int compare2 = c2.compare(11, 21);
        System.out.println(compare2);

    }
}
