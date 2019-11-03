//测试类
public class Test {
    public static void main(String[] args) {
        //装机员
        Builder builder = new ConcreteBuilder();    //多态
        //老板
        Director director = new Director(builder);
        //老板把需求交给装机员，自己拿产品
        Computer computer = director.createComputer("Intel 酷睿i9 7900X","三星M9T 2TB （HN-M201RAD）","技嘉AORUS Z270X-Gaming 7","科赋Cras II 红灯 16GB DDR4 3000");
        System.out.println("小明这台电脑使用的是：\n"+computer.getMainBoard()+" 主板\n"+computer.getCpu()+" CPU\n"+computer.getHardDisk()+"硬盘\n"+computer.getMainBoard()+" 内存\n");
    }
}
