package prak13.M_String;
import java.lang.String;

public class Tester {
    public static void main(String[] args)
    {
        M_String str = new M_String();

        String string = str.string("I like Java!!!");

        System.out.println(string);

        System.out.println(string.charAt(string.length()-1));

        if(string.endsWith("!!!")==true)
        {
            System.out.println("Строка оканчивается на !!!");
        }
        else System.out.println("Ошибка!");

        if(string.startsWith("I like")==true)
        {
            System.out.println("Строка начинается на I like");
        }
        else System.out.println("Ошибка!");

        if(string.contains("Java")==true)
        {
            System.out.println("Строка содержит Java");
        }
        else System.out.println("Ошибка!");

        System.out.println("[ " + string.indexOf("J") + " ; " + string.lastIndexOf("a") + " ]");

        System.out.println(string.replace('a', 'o'));

        System.out.println(string.toUpperCase());

        System.out.println(string.toLowerCase());

        System.out.println(string.substring(7,11));
    }
}