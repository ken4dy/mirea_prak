package prak11.Student;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите имя студента и его дату рождения (год, месяц, день): ");
        String n = input.next();
        //int c = input.nextInt();
        Calendar calendar = new GregorianCalendar();
        calendar.set(Calendar.YEAR, input.nextInt());
        calendar.set(Calendar.MONTH, input.nextInt()-1);
        calendar.set(Calendar.DAY_OF_MONTH, input.nextInt());
        Student s = new Student(n, calendar.getTime());
        System.out.println(s.toString(1));
        System.out.println("\n");
        System.out.println(s.toString(2));
        System.out.println("\n");
        System.out.println(s.toString(3));
    }
}
