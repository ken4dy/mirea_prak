package prak13.Person;


import java.util.Scanner;

public class Tester extends Person{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите фамилию: ");
        String s_name = input.nextLine();
        System.out.println("Введите имя: ");
        String name = input.nextLine();
        System.out.println("Введите отчество: ");
        String otch = input.nextLine();

        StringBuilder c_name = new StringBuilder(name);

        if(name == "" || otch == "")
        {
            System.out.println("Ошибка в вводе данных!");
        }
        else
        {
            String n = String.valueOf(c_name.delete(1, name.length()));

            StringBuilder c_otch = new StringBuilder(otch);
            String o = String.valueOf(c_otch.delete(1, otch.length()));

            Person person = new Person();
            StringBuilder string = new StringBuilder(person.C_String(s_name, n, o));


            System.out.println(string);
        }
    }
}