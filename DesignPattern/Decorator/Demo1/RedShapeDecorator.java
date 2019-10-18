package DesignPattern.Decorator.Demo1;

public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decoratorShape) {
        super(decoratorShape);
    }

    private void setRedBorder(Shape decoratorShape) {
        System.out.print(" with red border\n");
    }

    @Override
    public void draw() {
        super.draw();
        setRedBorder(decoratorShape);   //功能扩展
    }
}
