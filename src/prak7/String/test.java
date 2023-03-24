package prak7.String;


import java.util.Scanner;

public class test {
    public static void main(String[] args)
    {
        IntString stringWorker = new StringTest();

        Scanner input = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String a = input.nextLine();
        //java.lang.String testString = "hello world";

        System.out.println("Нечётные символы: " + stringWorker.getNewStringFromString(a));
        System.out.println("Инвертированный: " + stringWorker.invertString(a));
        System.out.println("Кол-во символов: " + stringWorker.countSymbols(a));
    }
}
