package DesignPattern.Strategy.Demo1;

public class StrategyPatterDemo {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println(context.executeOperation(10,5));

        context = new Context(new OperationMinus());
        System.out.println(context.executeOperation(10,5));

        context = new Context(new OperationMultiply());
        System.out.println(context.executeOperation(10,5));
    }
}
