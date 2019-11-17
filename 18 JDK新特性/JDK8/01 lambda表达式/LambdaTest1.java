import org.junit.Test;

import java.util.Comparator;
import java.util.function.Consumer;

/**
 * 1.举例：(o1,o2)->Integer.compare(o1,o2)
 * 2.格式
 *      ->：lambda操作符
 *      ->左边：lambda形参列表（对应接口中方法的形参列表）
 *      ->右边：lambda体（对应重写的抽象方法的方法体）
 * 3.lambda表达式的使用：6种情况
 * 4.lambda表达式的本质：作为函数式接口的实例
 *
 * 总结：
 *	左边：Lambda形参列表的参数类型可以省略（类型推断），如果Lambda形参列表只有一个参数，括号()也可以省略
 * 	右边：Lambda体使用一对括号包裹，如果Lambda体只有一条执行语句（可能是return语句），可以省略大括号{}和return关键字 
 *
 * 5.函数式接口：如果一个接口中只声明了一个方法，该接口就称为函数式接口
 *	例如：Runnable接口，查看源码→该接口有注解@FunctionalInterface
 */
public class LambdaTest1 {
    // 语法格式一：无参，无返回值
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

    // 语法格式二：一个参数，无返回值
    @Test
    public void test2() {
        Consumer<String> con = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        con.accept("我爱祖国"); //方法调用

        System.out.println("-------------------");

        Consumer<String> con1 = (String s) -> {
            System.out.println(s);
        };
        con1.accept("我爱祖国");    //方法调用
    }


    // 语法格式三：数据类型可省略，因为可由编译器腿短出，称为“类型推断”
    // 类型推断举例：ArrayList<String> array = new ArrayList<>();
    // 类型推断举例：int[] a = {1,2,3};
    @Test
    public void test3() {
        Consumer<String> con = (s) -> {
            System.out.println(s);
        };
        con.accept("我爱祖国");
    }


    // 语法格式四：lambda若只需要一个参数时，参数的小括号可以省略
    @Test
    public void test4() {
        Consumer<String> con = s -> {
            System.out.println(s);
        };
        con.accept("我爱祖国");
    }


    // 语法格式五：lambda需要两个或两个以上的参数，多条执行语句，并且可能有返回值
    @Test
    public void test5() {
        Comparator<Integer> con = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                System.out.println(o1); //多条执行语句
                System.out.println(o2);
                return o1.compareTo(o2);
            }
        };
        System.out.println(con.compare(12,21));

        System.out.println("--------------------------");

        Comparator<Integer> con1 = (o1,o2) -> {
            System.out.println(o1); //多条执行语句
            System.out.println(o2);
            return o1.compareTo(o2);
        };
        System.out.println(con1.compare(12,21));
    }


    // 语法格式六：当lambda体只有一条语句时，return与大括号可以省略
    @Test
    public void test6() {
        Comparator<Integer> con = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return compare(o1, o2);
            }
        };
        System.out.println(con.compare(12,21));

        Comparator<Integer> con1 = (o1, o2) -> o1.compareTo(o2);    //省略return和大括号
        System.out.println(con1.compare(12,21));
    }




}
