package prak15.Tester3;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tester extends JFrame implements ActionListener {
    static JFrame frame;

    static JTextField text;

    String s0, s1, s2;

    Tester()
    {
        s0 = s1 = s2 = "";
    }

    public static void main(String args[])
    {
        frame = new JFrame("Калькулятор");

        try
        {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (Exception e)
        {
            System.err.println(e.getMessage());
        }

        Tester c = new Tester();

        text = new JTextField(16);
        text.setMargin(new Insets(10, 30, 10, 150));
        text.setHorizontalAlignment(SwingConstants.RIGHT);

        text.setEditable(false);

        JButton button0, button1, button2,
                button3, button4, button5,
                button6, button7, button8,
                button9, plus, minus, del, pow, point, C, equal;

        button0 = new JButton("0");
        button0.setMargin(new Insets(10, 30, 10, 30));
        button0.setVerticalAlignment(SwingConstants.TOP);
        button0.setHorizontalAlignment(SwingConstants.RIGHT);
        button0.setHorizontalTextPosition(SwingConstants.LEFT);
        button0.setVerticalTextPosition(SwingConstants.BOTTOM);

        button1 = new JButton("1");
        button1.setMargin(new Insets(10, 30, 10, 30));
        button1.setVerticalAlignment(SwingConstants.TOP);
        button1.setHorizontalAlignment(SwingConstants.RIGHT);
        button1.setHorizontalTextPosition(SwingConstants.LEFT);
        button1.setVerticalTextPosition(SwingConstants.BOTTOM);

        button2 = new JButton("2");
        button2.setMargin(new Insets(10, 30, 10, 30));
        button2.setVerticalAlignment(SwingConstants.TOP);
        button2.setHorizontalAlignment(SwingConstants.RIGHT);
        button2.setHorizontalTextPosition(SwingConstants.LEFT);
        button2.setVerticalTextPosition(SwingConstants.BOTTOM);

        button3 = new JButton("3");
        button3.setMargin(new Insets(10, 30, 10, 30));
        button3.setVerticalAlignment(SwingConstants.TOP);
        button3.setHorizontalAlignment(SwingConstants.RIGHT);
        button3.setHorizontalTextPosition(SwingConstants.LEFT);
        button3.setVerticalTextPosition(SwingConstants.BOTTOM);

        button4 = new JButton("4");
        button4.setMargin(new Insets(10, 30, 10, 30));
        button4.setVerticalAlignment(SwingConstants.TOP);
        button4.setHorizontalAlignment(SwingConstants.RIGHT);
        button4.setHorizontalTextPosition(SwingConstants.LEFT);
        button4.setVerticalTextPosition(SwingConstants.BOTTOM);

        button5 = new JButton("5");
        button5.setMargin(new Insets(10, 30, 10, 30));
        button5.setVerticalAlignment(SwingConstants.TOP);
        button5.setHorizontalAlignment(SwingConstants.RIGHT);
        button5.setHorizontalTextPosition(SwingConstants.LEFT);
        button5.setVerticalTextPosition(SwingConstants.BOTTOM);

        button6 = new JButton("6");
        button6.setMargin(new Insets(10, 30, 10, 30));
        button6.setVerticalAlignment(SwingConstants.TOP);
        button6.setHorizontalAlignment(SwingConstants.RIGHT);
        button6.setHorizontalTextPosition(SwingConstants.LEFT);
        button6.setVerticalTextPosition(SwingConstants.BOTTOM);

        button7 = new JButton("7");
        button7.setMargin(new Insets(10, 30, 10, 30));
        button7.setVerticalAlignment(SwingConstants.TOP);
        button7.setHorizontalAlignment(SwingConstants.RIGHT);
        button7.setHorizontalTextPosition(SwingConstants.LEFT);
        button7.setVerticalTextPosition(SwingConstants.BOTTOM);

        button8 = new JButton("8");
        button8.setMargin(new Insets(10, 30, 10, 30));
        button8.setVerticalAlignment(SwingConstants.TOP);
        button8.setHorizontalAlignment(SwingConstants.RIGHT);
        button8.setHorizontalTextPosition(SwingConstants.LEFT);
        button8.setVerticalTextPosition(SwingConstants.BOTTOM);

        button9 = new JButton("9");
        button9.setMargin(new Insets(10, 30, 10, 30));
        button9.setVerticalAlignment(SwingConstants.TOP);
        button9.setHorizontalAlignment(SwingConstants.RIGHT);
        button9.setHorizontalTextPosition(SwingConstants.LEFT);
        button9.setVerticalTextPosition(SwingConstants.BOTTOM);

        equal = new JButton("=");
        equal.setMargin(new Insets(10, 30, 10, 30));
        equal.setVerticalAlignment(SwingConstants.TOP);
        equal.setHorizontalAlignment(SwingConstants.RIGHT);
        equal.setHorizontalTextPosition(SwingConstants.LEFT);
        equal.setVerticalTextPosition(SwingConstants.BOTTOM);

        plus = new JButton("+");
        plus.setMargin(new Insets(10, 30, 10, 30));
        plus.setVerticalAlignment(SwingConstants.TOP);
        plus.setHorizontalAlignment(SwingConstants.RIGHT);
        plus.setHorizontalTextPosition(SwingConstants.LEFT);
        plus.setVerticalTextPosition(SwingConstants.BOTTOM);

        minus = new JButton("-");
        minus.setMargin(new Insets(10, 30, 10, 30));
        minus.setVerticalAlignment(SwingConstants.TOP);
        minus.setHorizontalAlignment(SwingConstants.RIGHT);
        minus.setHorizontalTextPosition(SwingConstants.LEFT);
        minus.setVerticalTextPosition(SwingConstants.BOTTOM);

        del = new JButton("/");
        del.setMargin(new Insets(10, 30, 10, 30));
        del.setVerticalAlignment(SwingConstants.TOP);
        del.setHorizontalAlignment(SwingConstants.RIGHT);
        del.setHorizontalTextPosition(SwingConstants.LEFT);
        del.setVerticalTextPosition(SwingConstants.BOTTOM);

        pow = new JButton("*");
        pow.setMargin(new Insets(10, 30, 10, 30));
        pow.setVerticalAlignment(SwingConstants.TOP);
        pow.setHorizontalAlignment(SwingConstants.RIGHT);
        pow.setHorizontalTextPosition(SwingConstants.LEFT);
        pow.setVerticalTextPosition(SwingConstants.BOTTOM);

        point = new JButton(".");
        point.setMargin(new Insets(10, 30, 10, 30));
        point.setVerticalAlignment(SwingConstants.TOP);
        point.setHorizontalAlignment(SwingConstants.RIGHT);
        point.setHorizontalTextPosition(SwingConstants.LEFT);
        point.setVerticalTextPosition(SwingConstants.BOTTOM);

        JPanel panel = new JPanel();

        pow.addActionListener(c);
        del.addActionListener(c);
        minus.addActionListener(c);
        plus.addActionListener(c);
        button9.addActionListener(c);
        button8.addActionListener(c);
        button7.addActionListener(c);
        button6.addActionListener(c);
        button5.addActionListener(c);
        button4.addActionListener(c);
        button3.addActionListener(c);
        button2.addActionListener(c);
        button1.addActionListener(c);
        button0.addActionListener(c);
        point.addActionListener(c);
        //C.addActionListener(c);
        equal.addActionListener(c);

        panel.add(text);
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);
        panel.add(del);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(pow);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(minus);
        panel.add(button0);
        panel.add(point);
        panel.add(equal);
        //panel.add(C); panel.add
        panel.add(plus);

        panel.setBackground(Color.gray);
        panel.setBorder(new EmptyBorder(70, 80, 150, 80));

        frame.add(panel);
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.show();
    }
    public void actionPerformed(ActionEvent e)
    {
        String s = e.getActionCommand();
        if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.')
        {
            if (!s1.equals(""))
                s2 = s2 + s;
            else
                s0 = s0 + s;
            text.setText(s0 + s1 + s2);
        }

        else if (s.charAt(0) == '=')
        {
            double te;
            if (s1.equals("+"))
                te = (Double.parseDouble(s0) + Double.parseDouble(s2));
            else if (s1.equals("-"))
                te = (Double.parseDouble(s0) - Double.parseDouble(s2));
            else if (s1.equals("/"))
                te = (Double.parseDouble(s0) / Double.parseDouble(s2));
            else
                te = (Double.parseDouble(s0) * Double.parseDouble(s2));
            text.setText(s0 + s1 + s2 + "=" + te);
            s0 = Double.toString(te);
            s1 = s2 = "";
        }
        else
        {
            if (s1.equals("") || s2.equals(""))
                s1 = s;
            else
            {
                double te;
                if (s1.equals("+"))
                    te = (Double.parseDouble(s0) + Double.parseDouble(s2));
                else if (s1.equals("-"))
                    te = (Double.parseDouble(s0) - Double.parseDouble(s2));
                else if (s1.equals("/"))
                    te = (Double.parseDouble(s0) / Double.parseDouble(s2));
                else
                    te = (Double.parseDouble(s0) * Double.parseDouble(s2));
                s0 = Double.toString(te);
                s1 = s;
                s2 = "";
            }
            text.setText(s0 + s1 + s2);
        }
    }
}