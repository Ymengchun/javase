
/*
finalize()是Object类的方法，任何类中都默认继承此方法
作用：垃圾回收周期性地运行，检查对象不再被运行状态引用或间接地通过其他对象引用,就在对象被释放之前，运行系统调用该对象的finalize( )
 */
public class testFinalize {
    public static void main(String[] args) {
        Person p1 = new Person(1);
        Person p2 = new Person(2);
        Person p3 = new Person(3);
        //置为null表示不再使用
        p2 = null;
        p3 = null;
        System.gc();    //调用垃圾回收器

    }
}

class Person{
    int id;

    public Person(int id) {
        this.id = id;
        System.out.println("创建Person");
    }

    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("销毁Person");
    }
}
