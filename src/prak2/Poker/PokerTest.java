package prak2.Poker;

import java.util.Scanner;

public class PokerTest {
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        int playersCount;

        while (true)
        {
            playersCount = sc.nextInt();
            if (playersCount * 5 > 36)
            {
                System.out.println("Некорректное число игроков. Введите снова");
                continue;
            }
            else
            {
                break;
            }

        }

        Poker poker = new Poker(playersCount);
        poker.StartGame();
    }
}
