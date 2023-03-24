package prak5.Game;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Match {
    private static JLabel jLabel1 = new JLabel();
    private static JLabel jLabel2 = new JLabel();
    private static JLabel jLabel3 = new JLabel();

    public static void main(String[] args)
    {
        Game game = new Game();

        jLabel1.setText("");
        jLabel2.setText("");
        jLabel3.setText("");

        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.Y_AXIS));
        topPanel.add(jLabel1);
        topPanel.add(jLabel2);
        topPanel.add(jLabel3);

        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new BoxLayout(bottomPanel, BoxLayout.X_AXIS));

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new FlowLayout());
        mainPanel.setBackground(Color.LIGHT_GRAY);
        mainPanel.add(topPanel);
        mainPanel.add(bottomPanel);

        ActionListener actionListener1 = new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                game.milan.AddScore();
                SetText(game, game.milan);
            }
        };

        ActionListener actionListener2 = new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                game.madrid.AddScore();
                SetText(game, game.madrid);
            }
        };

        JButton buttonMil = new JButton("AC Milan");
        JButton buttonMad = new JButton("Real Madrid");
        bottomPanel.add(buttonMil);
        bottomPanel.add(buttonMad);
        buttonMil.addActionListener(actionListener1);
        buttonMad.addActionListener(actionListener2);


        JFrame frame = new JFrame("Match Madrid Milan");
        frame.setPreferredSize(new Dimension(300, 200));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(mainPanel);
        frame.pack();
        frame.setVisible(true);
    }

    private static void SetText(Game game, Team lastScorer)
    {
        jLabel1.setText(String.format("Result: %s X %s", game.milan.GetScore(), game.madrid.GetScore()));

        jLabel2.setText(String.format("Last scorer: %s", lastScorer.GetName()));

        if (game.madrid.GetScore() > game.milan.GetScore())
            jLabel3.setText(String.format("Winner: %s", game.madrid.GetName()));
        else if(game.madrid.GetScore() < game.milan.GetScore())
            jLabel3.setText(String.format("Winner: %s", game.milan.GetName()));
        else if (game.madrid.GetScore() == game.milan.GetScore())
            jLabel3.setText(String.format("Winner: DRAW", game.madrid.GetName()));
    }
}