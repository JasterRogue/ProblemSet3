import javax.swing.*;

public class HouseTest {
    public static void main(String[] args)
    {
        String priceString, name;
        int age;
        String gender;
        float price;
        char gen;

        House house = new House();
        Person person = new Person();

        house.setAddress(JOptionPane.showInputDialog("Enter Address"));
        house.setType(JOptionPane.showInputDialog("Enter house type"));
        priceString = JOptionPane.showInputDialog("Enter price");
        price = Float.parseFloat(priceString);
        if(price<1)
        {
            house.setPrice(0.0f);
        }
        house.setPrice(price);

        name = JOptionPane.showInputDialog("Enter owner name");
        age = Integer.parseInt((JOptionPane.showInputDialog("Enter age")));
        gender = JOptionPane.showInputDialog("Enter gender");
        gen = gender.charAt(0);

        person = new Person(name, age, gen);
        house.setOwner(person);

        JOptionPane.showMessageDialog(null,house.toString());



    }
}
