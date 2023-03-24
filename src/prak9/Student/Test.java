package prak9.Student;
public class Test {
    public static void main(String[] args)
    {
        System.out.println("Введите размер массива: ");
        Student student = new Student();
        System.out.println("Массив: ");
        student.Print();
        student.Sort();
        System.out.println("\n");
        System.out.println("Отсортированный массив: ");
        student.Print();
        System.out.println("\n");
    }
}
