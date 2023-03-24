package prak9.Listone;
public class Test {
    public static void main(String[] args)
    {
        Student[] students1 = new Student[5];
        Student[] students2 = new Student[5];
        students1[0] = new Student(11);
        students1[1] = new Student(4);
        students1[2] = new Student(6);
        students1[3] = new Student(8);
        students1[4] = new Student(10);

        students2[0] = new Student(1);
        students2[1] = new Student(3);
        students2[2] = new Student(5);
        students2[3] = new Student(7);
        students2[4] = new Student(9);

        System.out.println("Первый массив: ");
        for(Student s: students1)
        {
            System.out.format(String.valueOf(s) + " ");
        }
        System.out.println("\n");
        System.out.println("Второй массив: ");
        for(Student s: students2)
        {
            System.out.format(String.valueOf(s) + " ");
        }
        System.out.println("\n");
        System.out.println("Общая сортировка: ");
        for(Student s : Merge.mergeArrays(students1, students2))
            System.out.format(String.valueOf(s) + " ");
    }
}