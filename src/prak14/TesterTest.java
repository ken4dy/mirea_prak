package prak14;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TesterTest {
    public static void main(String[] args)
    {
        ArrayList<String> arr = new ArrayList<String>();

        String[] money = new String[5];
        money[0] = "25.98 USD";
        money[1] = "47 RUB";
        money[2] = "23 EU";
        money[3] = "0.0005 EU";
        money[4] = "12 RIB";

        Pattern pattern1 = Pattern.compile("\\d\\d.\\d\\d USD");
        Pattern pattern2 = Pattern.compile("\\d\\d RUB");
        Pattern pattern3 = Pattern.compile("\\d\\d EU");


        for(int i = 0; i < money.length; i++)
        {
            Matcher matcher1 = pattern1.matcher(money[i]);
            boolean b = matcher1.matches();
            if(b == true)
            {
                arr.add(money[i]);
            }

            Matcher matcher2 = pattern2.matcher(money[i]);
            boolean c = matcher2.matches();
            if(c == true)
            {
                arr.add(money[i]);
            }

            Matcher matcher3 = pattern3.matcher(money[i]);
            boolean d = matcher3.matches();
            if(d == true)
            {
                arr.add(money[i]);
            }
        }
        System.out.println(arr);
    }
}