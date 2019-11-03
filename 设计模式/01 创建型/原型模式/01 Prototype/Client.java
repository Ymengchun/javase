//测试类
public class Client {
    public static void main(String[] args) {
        ConcretePrototype cp = new ConcretePrototype(); //创建具体原型对象
        for (int i=0; i<10; i++) {
            ConcretePrototype clonecp = (ConcretePrototype) cp.clone();
            clonecp.show();
        }
    }
}
