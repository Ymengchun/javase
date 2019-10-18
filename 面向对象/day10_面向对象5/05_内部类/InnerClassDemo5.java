/*
	局部内部类：在局部位置（方法中）定义的类
		A:可以直接访问外部类的成员
		B:如何使用：在外部类的方法以内，在局部内部类以外创建局部内部类对象，调用局部内部类方法

	局部内部类访问局部变量的注意事项?
		局部内部类访问局部变量必须用final修饰
		原因：
			局部变量是随着方法的调用而创建，随着调用完毕而消失。
			而局部内部类对象存放在中并不会立即消失。这是就会出现了一个悲剧的结果，
			局部内部类对象访问一个已不存在的局部变量。
			解决：为变量加final就行了
*/
class Outer {
    private int num  = 10;

    public void method() {
        //int num2 = 20;    //错误，必须用final修饰
        final int num2 = 20;
        class Inner {
            public void show() {
                System.out.println(num);	//内部类可以直接访问外部类的成员变量
                //从内部类中外部类变量num2; 需要将num2声明为final类型
                System.out.println(num2);   //20
            }
        }
        

        Inner i = new Inner();
        i.show();
    }
}

class InnerClassDemo5 {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.method();
    }
}