package prak9.SortStudent;


public class Test extends SortGPA{
    public Test(int idNumber)
    {
        super(idNumber);
    }

    public static void main(String[] args)
    {
        {
            SortingStudentsByGPA comparator = new SortingStudentsByGPA();
            SortGPA[] students = new SortGPA[5];
            students[0] = new SortGPA(4, 0);
            students[1] = new SortGPA(5, 75);
            students[2] = new SortGPA(3, 19);
            students[3] = new SortGPA(2, 50);
            students[4] = new SortGPA(1, 20);
            comparator.qsort(students, 0, students.length - 1);
            for (SortGPA s : students)
                System.out.println(s.getGPA());
        }
    }
}
