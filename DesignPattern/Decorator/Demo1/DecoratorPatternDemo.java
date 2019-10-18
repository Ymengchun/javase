package DesignPattern.Decorator.Demo1;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        ShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        ShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());


        System.out.println("普通的圆：");
        circle.draw();

        System.out.println("有红色边界的圆：");
        redCircle.draw();

        System.out.println("有红色边界的长方形:");
        redRectangle.draw();
    }
}
