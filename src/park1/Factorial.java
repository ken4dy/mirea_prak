package park1;

import java.sql.SQLOutput;

public class Factorial {
    public static void main(String[] args){
        int fact;
        int mult = 1;
        int i=1;
        while(i<=4){
            mult=i*mult;
            i++;
        }
        System.out.print(mult);
    }
}

