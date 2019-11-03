//抽象的建造者：装电脑的步骤
//至于安装什么型号的主板，我不关心，那是具体的建造者关心的
public interface Builder {
    // 安装主板
    void createMainBoard(String mainBoard) ;
    // 安装 cpu
    void createCpu(String cpu) ;
    // 安装硬盘
    void createhardDisk(String hardDisk) ;
    // 安装内存
    void createMemory(String memory) ;
    // 组成电脑
    Computer createComputer() ;

}
