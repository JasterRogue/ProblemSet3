public class Memory {

    private String type;
    private int size;

    public void setType(String type)
    {
        this.type = type;
    }

    public void setSize(int size)
    {
        this.size = size;
    }

    public String getType()
    {
        return type;
    }

    public int getSize()
    {
        return size;
    }

    public Memory()
    {
        this.type = "No type specified";
        this.size = 0;
    }

    public Memory(String type, int size)
    {
        this.type = type;
        this.size = size;
    }

    public String toString()
    {
        return  "";
    }

}
