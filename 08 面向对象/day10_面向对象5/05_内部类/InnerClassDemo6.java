/*
	匿名内部类：内部类的简化写法。

	前提：存在一个类（具体内/抽象类都行）或者接口

	格式：
		new 类名或者接口名(){
			重写方法;
		}

	本质：一个继承了该类或者实现了该接口的子类匿名对象。
*/
interface Inter {
    public abstract void show();
    public abstract void show2();
}

class Outer {
    public void method() {
        Inter i = new Inter() { //多态
            public void show() {
                System.out.println("show");
            }

            public void show2() {
                System.out.println("show2");
            }
        };

        i.show();
        i.show2();
    }
}

class InnerClassDemo6 {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.method();
    }
}