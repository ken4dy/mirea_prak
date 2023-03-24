package prak5.figura;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Test {
    public static void main(String[] args)
    {
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new FlowLayout());
        mainPanel.setBackground(Color.BLACK);

        for(int counter = 1; counter <= 20; counter++)
        {
            Figure figure = new Figure(0,0,100,200);
            figure.SetNumber(counter);
            figure.SetColor(new Random().nextInt(255),new Random().nextInt(255),new Random().nextInt(255));
            mainPanel.add(figure.GetJFectangle());
        }

        JFrame frame = new JFrame("20 фигур");
        frame.setPreferredSize(new Dimension(800,500));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(mainPanel);
        frame.pack();
        frame.setVisible(true);
    }

}