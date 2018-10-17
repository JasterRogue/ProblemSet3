

import javax.swing.*;

public class ComputerTest {
    public static void main(String[] args)
    {
        Computer com = new Computer();
        Computer computersArray[] = new Computer[5];
        JTextArea jta = new JTextArea();
        String comType;

        for(int i = 0;i<computersArray.length;i++)
        {
            String type;
            int size;

            Computer c = new Computer();
           // Laptop lap = new Laptop();
            c.setMake(JOptionPane.showInputDialog("Enter make"));

            if(c.getMake().equals(""))
            {
                break;
            }

           // lap.setMake(c.getMake());
            type = JOptionPane.showInputDialog("Enter the memory type");
            size = Integer.parseInt(JOptionPane.showInputDialog("Enter memory size"));
            c.setMemory(new Memory(type, size));
            //lap.setMemory(new Memory(type,size));
            comType = JOptionPane.showInputDialog("Desktop or Laptop");
            c.setComType(comType);

            computersArray[i] = c;

            if
            (computersArray[i] == null)
                break;

        }

        for(int i=0;i<computersArray.length;i++)
        {
            if(computersArray[i]!=null)
                 jta.append(computersArray[i].toString());
            else
            {
                break;
            }
        }

        JOptionPane.showMessageDialog(null,jta);

        System.exit(0);



    }
}
