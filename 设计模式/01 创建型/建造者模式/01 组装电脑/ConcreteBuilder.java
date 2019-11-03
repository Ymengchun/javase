//具体建造者（员工）：可以有多个，组装不同型号的电脑，这里只写一个class ConcreteBuilder类
public class ConcreteBuilder implements Builder {

    private Computer computer = new Computer();
    @Override
    public void createMainBoard(String mainBoard) {
        computer.setMainBoard(mainBoard);
    }

    @Override
    public void createCpu(String cpu) {
        computer.setCpu(cpu);
    }

    @Override
    public void createhardDisk(String hardDisk) {
        computer.setHardDisk(hardDisk);
    }

    @Override
    public void createMemory(String memory) {
        computer.setMemory(memory);
    }

    @Override
    public Computer createComputer() {
        return computer;
    }
}
