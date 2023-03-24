package prak9.myCompare;

import java.util.TreeSet;

public class Tester implements Comparable<Object>{
    String str;
    String  TEMPLATE = "Буква = '%s'";

    Tester(String str)
    {
        this.str = str;
    }

    @Override
    public int compareTo(Object obj)
    {
        Tester entry = (Tester) obj;
        int result = str.compareTo(entry.str);
        if(result != 0)
            return result;
        if(result != 0)
            return (int) result / Math.abs( result );

        return 0;
    }

    @Override
    public String toString()
    {
        return String.format(TEMPLATE, str);
    }

    public static void main(String[] args)
    {
        TreeSet<Tester> data = new TreeSet<Tester>();
        data.add(new Tester("А"));
        data.add(new Tester("Г"));
        data.add(new Tester("Д"));
        data.add(new Tester("Б"));
        data.add(new Tester("В"));
        for (Tester e : data)
            System.out.println(e.toString());
    }
}
