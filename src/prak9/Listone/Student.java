package prak9.Listone;

public class Student implements Comparable<Student> {
    private int idNumber;
    private int GPA;
    public int getGPA(){ return GPA; }
    public int getIdNumber() { return idNumber; }

    public Student(int idNumber) {
        this.idNumber = idNumber;
    }
    public Student(int idNumber, int GPA)
    {
        this.idNumber = idNumber;
        this.GPA = GPA;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(idNumber, o.idNumber);
    }

    @Override
    public String toString()
    {
        return String.valueOf(idNumber);
    }

    static void sort(Student[] students)
    {
        for(int i=1;i<students.length;++i)
        {
            for(int j=i;j>=1;--j)
            {
                if(students[j-1].compareTo(students[j])>0)
                {
                    Student tmp = students[j-1];
                    students[j-1]=students[j];
                    students[j]=tmp;
                }else break;
            }
        }
    }
}
