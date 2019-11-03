//导演类：指挥建造过程
public class Director {
    private Builder builder;
    // 使用多态，装机员工非常多，我管你小美，小兰，小猪，统统都归我管
    public Director(Builder builder) {
        this.builder = builder;
    }

    //导演只想看到成品
    public Computer createComputer(String cpu,String hardDisk,String mainBoard,String memory) {
        this.builder.createCpu(cpu);
        this.builder.createhardDisk(hardDisk);
        this.builder.createMainBoard(mainBoard);
        this.builder.createMemory(memory);
        return this.builder.createComputer();
    }
}
