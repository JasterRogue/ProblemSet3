import javax.swing.*;

public class SavingsAccountTest{
    public static void main(String[] args)
    {
        int choice;

        SavingsAccount sa = new SavingsAccount("",0,0);

        sa.setName(JOptionPane.showInputDialog("Enter account name"));
        sa.setAccnum(Integer.parseInt(JOptionPane.showInputDialog("Enter account number")));
        sa.setBalance(Double.parseDouble(JOptionPane.showInputDialog("Enter account balance")));

       choice = Integer.parseInt(JOptionPane.showInputDialog("1. Lodge Money" +
                "\n2. Withdraw Money" +
                "\n3. Calculate Tax"));

       if(choice == 1)
       {
           double amount;
           amount = Double.parseDouble(JOptionPane.showInputDialog("Enter the amount you wish to lodge"));
           sa.lodge(amount);
       }

       if(choice == 2)
       {
           double amount;
           amount = Double.parseDouble(JOptionPane.showInputDialog("Enter the amount you wish to withdraw"));
           sa.withdraw(amount);
       }

       if(choice == 3)
       {
           double tax;
           tax = sa.calcTax();
           JOptionPane.showMessageDialog(null,"Tax: " + tax);
       }

       JOptionPane.showMessageDialog(null,sa.toString());

    }
}
