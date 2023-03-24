package prak13.Phone;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите номер телефона: ");
        String ph = input.nextLine();

        Phone phone = new Phone();
        StringBuilder a = new StringBuilder(ph);
        if(a.charAt(0) == '+')
        {
            String code = a.substring(1,2);
            String pachka1 = a.substring(2, 5);
            String pachka2 = a.substring(5, 8);
            String pachka3 = a.substring(8, 12);
            System.out.println("\n" + "Номер: " + phone.toString1(code, pachka1, pachka2, pachka3));
        }
        else if(a.charAt(0)=='8')
        {
            String code = "+7";
            String pachka1 = a.substring(1, 4);
            String pachka2 = a.substring(4, 7);
            String pachka3 = a.substring(7, 11);
            System.out.println("\n" + "Номер: " + phone.toString2(code, pachka1, pachka2, pachka3));
        }
    }
}