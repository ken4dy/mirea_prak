package prak14;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tester {
    public static void main(String[] args)
    {
        System.out.println("Введите строку: ");
        Scanner input = new Scanner(System.in);

        String string = input.nextLine();

        Pattern pattern = Pattern.compile("(([a-zA-Z]+)|(\\d+))|((\\d+)|([a-zA-Z]+))");
        Matcher matcher = pattern.matcher(string);

        List<Object> tokens = new LinkedList<Object>();
        while(matcher.find())
        {
            String token = matcher.group( 1 );
            tokens.add(token);
        }
        System.out.println("\n" + tokens);

    }
}