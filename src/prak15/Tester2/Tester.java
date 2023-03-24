package prak15.Tester2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class Tester {
    public static void main(String args[])
    {
        JFrame frame = new JFrame("Меню");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        UIManager.put("MenuBar.background", Color.ORANGE);

        JMenu fileMenu = new JMenu("Файл");
        menuBar.add(fileMenu);
        JMenuItem menuItem1 = new JMenuItem("Сохранить");
        fileMenu.add(menuItem1);
        JMenuItem menuItem2 = new JMenuItem("Выйти");
        fileMenu.add(menuItem2);

        JMenu editMenu = new JMenu("Правка");
        editMenu.setMnemonic(KeyEvent.VK_E);
        menuBar.add(editMenu);
        JMenuItem menuItem3 = new JMenuItem("Копировать");
        editMenu.add(menuItem3);
        JMenuItem menuItem4 = new JMenuItem("Вырезать");
        editMenu.add(menuItem4);
        JMenuItem menuItem5 = new JMenuItem("Вставить");
        editMenu.add(menuItem5);

        JMenu searchMenu = new JMenu("Справка");
        //searchMenu.setMnemonic(KeyEvent.VK_S);
        menuBar.add(searchMenu);

        final TextField tf = new TextField();
        tf.setBounds(10,100, 245,20);
        tf.setForeground(Color.black);
        tf.setText("Область в которой можно печатать текст!");
        Button b = new Button("Кнопка 1");
        b.setBounds(10,60,60,30);
        Button c = new Button("Кнопка 2");
        c.setBounds(80, 60, 60,30);

        frame.add(b);
        frame.add(c);
        frame.add(tf);
        frame.setLayout(null);
        frame.setJMenuBar(menuBar);
        frame.setSize(280, 250);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}