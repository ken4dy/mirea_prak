package prak6.Computer;


public class Computer {
    private String Name = "No pc name";

    private Brand computerBrand = Brand.ASUS;

    private Processor processor = new Processor();
    private Monitor  monitor = new Monitor();
    private Memory memory = new Memory();

    Computer(String name)
    {
        Name = name;
    }

    public String getName()
    {
        return Name;
    }

    public Memory getMemory()
    {
        return memory;
    }

    public Monitor getMonitor()
    {
        return monitor;
    }

    public Processor getProcessor()
    {
        return processor;
    }

    public void setMemory(Memory memory)
    {
        this.memory = memory;
    }

    public void setMonitor(Monitor monitor)
    {
        this.monitor = monitor;
    }

    public void setProcessor(Processor processor)
    {
        this.processor = processor;
    }

    public void setComputerBrand(Brand computerBrand)
    {
        this.computerBrand = computerBrand;
    }

    public Brand getComputerBrand()
    {
        return computerBrand;
    }
}