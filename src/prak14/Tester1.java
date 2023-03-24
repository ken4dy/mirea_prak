package prak14;


import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tester1 {
    public static void main(String[] args)
    {
        ArrayList<String> arr = new ArrayList<>();

        String[] formula = new String[5];
        formula[0] = "1+2/4-(43+12)";
        formula[1] = "1*2/4-(43*12)";
        formula[2] = "1/43+12";
        formula[3] = "43*32*43";
        formula[4] = "21+43+12+11";

        Pattern pattern = Pattern.compile("[0-9]+[ ]*[+]");

        for(int i = 0; i < formula.length; i++)
        {
            Matcher matcher = pattern.matcher(formula[i]);

            if(matcher.find() == true)
            {
                arr.add(formula[i]);
            }
        }
        System.out.println(arr);
    }
}
