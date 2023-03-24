package prak15.Tester;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Tester extends JFrame implements ItemListener {
    static JFrame frame;
    static JLabel label1, label2;
    static JComboBox combo;

    public static void main(String[] args)
    {
        frame = new JFrame("Страны");

        Tester tester = new Tester();

        frame.setLayout(new FlowLayout());

        String[] strings = new String[4];
        strings[0] = "Австралия";
        strings[1] = "Китай";
        strings[2] = "Россия";
        strings[3] = "Англия";

        combo = new JComboBox(strings);
        //combo.setEditable(true);
        combo.addItemListener(tester);

        label1 = new JLabel("Выберите страну: ");
        label1.setForeground(Color.red);

        label2 = new JLabel("*здесь будет информация о стране*");
        label2.setForeground(Color.red);

        JPanel panel = new JPanel();

        panel.add(label1);
        panel.add(combo);
        panel.add(label2);

        frame.add(panel);
        frame.setSize(600,200);
        frame.setLocationRelativeTo(null);
        frame.show();;
    }


    @Override
    public void itemStateChanged(ItemEvent e)
    {
        if (e.getSource() == combo)
        {
            if(combo.getSelectedItem()=="Австралия")
            {
                label2.setText(" - страна-кенгуру");
            }
            else if (combo.getSelectedItem()=="Россия")
            {
                label2.setText(" - здесь находится мирэа");
            }
            else if (combo.getSelectedItem()=="Китай")
            {
                label2.setText(" - чин чопа");
            }
            else if (combo.getSelectedItem()=="Англия")
            {
                label2.setText(" - bottle of wottta");
            }
        }
    }
}