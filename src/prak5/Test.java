package prak5;
import javax.swing.*;
import java.awt.*;


public class Test
{
    public static void main(String[] args)
    {
        String[] strings = new String[1];
        strings[0] = "C:\\Users\\Виктор\\Desktop\\картинка.jpg";

        Image bgImage= Toolkit.getDefaultToolkit().getImage(strings[0]);
        JLabel jLabel = new JLabel(new ImageIcon(bgImage));

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(Color.BLACK);
        mainPanel.add(jLabel);

        JFrame frame = new JFrame("Пейзаж");
        frame.setPreferredSize(new Dimension(1200,1200));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(mainPanel, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
}

