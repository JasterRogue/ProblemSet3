public class Computer implements IDable{

    private String id;
    private String make;
    protected Memory memory;
    private String comType;

  //  @Override
    public void setID(String id)
    {
        this.id = id;
    }

    public void setMake(String make)
    {
        this.make = make;
    }

    public void setMemory(Memory memory)
    {
        this.memory = memory;
    }

    public String getId()
    {
        return id;
    }

    public String getMake()
    {
        return make;
    }

    public Memory getMemory()
    {
        return memory;
    }

    public void setComType(String comType)
    {
        this.comType = comType;
    }

    public String getComType()
    {
        return comType;
    }

    public Computer()
    {
        this.id = "0";
        this.make = "No make specified";
        this.memory = new Memory("No type specified", 0);
        this.comType = "No type";
    }

    public Computer(String id, String make, String type, int size)
    {
        this.id = id;
        this.make = make;
        setMemory(new Memory(type, size));
        this.comType = comType;
    }

    public String toString()
    {
        return "Make: " + getMake() +
                "\nMemory Type: " + memory.getType() +
                "\nMemory Size: " + memory.getSize() +
                "\nComputer Type: " + comType + "\n";
    }

   /* public Laptop makeLaptop()
    {
        return  ;


    }*/




}
