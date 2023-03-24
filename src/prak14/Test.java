package prak14;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите строку (верная - wannagetsomesleep9): ");
        String string = input.nextLine();

        Pattern pattern = Pattern.compile("wannagetsomesleep9");
        Matcher matcher = pattern.matcher(string);

        boolean b = matcher.matches();

        if(b == true)
        {
            System.out.println("Строки совпадают!");
        }
        else System.out.println("Строки не совпадают!");

    }
}