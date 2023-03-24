package prak6.Convertable;
import java.util.Scanner;

public class Test {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите температуру в Цельсиях: ");
        float c = input.nextFloat();
        float conv = new Convert1().convert(c);
        System.out.println(String.format("По Фаренгейту это будет: %.2f F",conv));
        conv = new Convert2().convert(c);
        System.out.println(String.format("По Кельвину это будет: %.2f K",conv));
    }
}
