package prak8;

import java.util.Scanner;

public class RightLeft {
    private static void Recursion(long counter, int summs)
    {
        long symbol = counter%10;

        if(counter > 0)
            System.out.print(String.format("%s ",symbol));
        else
            return;

        long number = counter/10;

        Recursion(number, ++summs);
    }

    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число N: ");
        long N = scanner.nextLong();

        System.out.println("Перевёрнутое число: ");
        Recursion(N, 1);
    }
}