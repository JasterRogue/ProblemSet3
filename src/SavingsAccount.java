public class SavingsAccount extends BankAccount{

    private double balance;

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public double getBalance()
    {
        return balance;
    }

    public SavingsAccount(String name, int accnum, double balance)
    {
        setBalance(balance);
        setName(name);
        setAccnum(accnum);
    }

    public void lodge(double amount)
    {
        this.balance += amount;
    }

    public void withdraw(double amount)
    {
        this.balance -= amount;
    }

    public double calcTax()
    {
        double tax;
        tax = balance * 0.20;
        return tax;

    }

    public String toString()
    {
        return "Name: " + getName() +
                "\nAccount Number: " + getAccnum() +
                "\nBalance: " + getBalance();
    }

}
