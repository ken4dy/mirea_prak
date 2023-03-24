package prak8;
// DZ8_25variant_eto_polindrom;

import java.util.Scanner;

public class Polindrom {
    public static boolean PolindromCheck(String string)
    {
        String clean = string.replaceAll("\\s+", "").toLowerCase();
        StringBuffer plain = new StringBuffer(clean);
        StringBuffer reverse = plain.reverse();
        return (reverse.toString()).equals(clean);
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите строку (слово): ");
        String string = input.nextLine();
        Polindrom p = new Polindrom();
        System.out.println("Является ли строка (слово) полиндромом: ");
        //System.out.println(PolindromCheck(string));
        if(PolindromCheck(string)==true)
        {
            System.out.println("YES");
        }
        else {System.out.println("NO");}
    }
}