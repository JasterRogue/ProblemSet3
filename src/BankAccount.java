public abstract class BankAccount implements Transactable, Taxable {

    protected String name;
    protected int accnum;

    public abstract void lodge(double amount);

    public abstract void withdraw(double amount);

    public abstract double calcTax();

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAccnum(int accnum)
    {
        this.accnum = accnum;
    }

    public String getName()
    {
        return name;
    }

    public int getAccnum()
    {
        return accnum;
    }





}
