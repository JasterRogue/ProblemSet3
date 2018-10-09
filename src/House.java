public class House {

    private String address;
    private String type;
    private float price;
    private Person owner;

    public void setAddress(String address)
    {
        this.address = address;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public void setPrice(float price)
    {
        this.price = price;
    }

    public void setOwner(Person owner)
    {
        this.owner = owner;
    }

    public String getAddress()
    {
        return address;
    }

    public String getType()
    {
        return type;
    }

    public float getPrice()
    {
        return price;
    }

    public Person getOwner()
    {
        return owner;
    }

    public House()
    {
        this.address = "No address specified";
        this.type = "No type specified";
        this.price = 0.0f;
        this.owner = new Person("No owner specified", 0, 'n');

    }

    public House(String address, String type, float price,String name, int age, char gender)
    {
        this.address = address;
        this.type = type;
        this.price = price;
        setOwner(new Person(name, age, gender));
    }

    public String toString()
    {
        return "Address: " + getAddress() +
                "\nType: " + getType() +
                "\nPrice: " + getPrice() +
                "\nOwner " + getOwner();
    }

}
