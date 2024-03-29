import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Java四大内置函数式接口
 *
 * 消费者接口: Consumer<T>       void accept(T t)
 * 供给型接口: Supplier<T>       T target()
 * 函数型接口: Function<T,R>     R apply(T t)
 * 断定型接口: Predicate<T>      boolean test(T t)
 */


public class Demo {
    @Test
    public void test1() {
        happyTime(500, new Consumer<Double>() {
            @Override
            public void accept(Double aDouble) {
                System.out.println("价格为：" + aDouble);
            }
        });

        System.out.println("-------------------------");

        //Lambda表达式改写
        happyTime(500, aDouble -> System.out.println("价格为：" + aDouble));
    }

    public void happyTime(double money, Consumer<Double> con) {
        con.accept(money);
    }




    @Test
    public void test2() {
        List<String> list = Arrays.asList("北京", "南京", "天津", "东京", "西京", "普京");
        List<String> filterStrs = filterString(list, new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.contains("京");
            }
        });
        System.out.println(filterStrs);

        System.out.println("--------------------");

        //Lambda表达式改写
        List<String> filterStr1= filterString(list, s -> s.contains("京"));
        System.out.println(filterStr1);
    }

    // 根据规则过滤集合中的字符串，此规则由Predicate的方法决定，需要重写
    public List<String> filterString(List<String> list, Predicate<String> pre) {
        ArrayList<String> filterList = new ArrayList<>();

        for (String s : list) {
            if (pre.test(s)) {
                filterList.add(s);
            }
        }
        return filterList;
    }


}