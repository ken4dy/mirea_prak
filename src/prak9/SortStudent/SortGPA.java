package prak9.SortStudent;

public class SortGPA implements Comparable<SortGPA>{
    private int idNumber;
    private int GPA;

    public int getGPA()
    {
        return GPA;
    }

    public int getIdNumber()
    {
        return idNumber;
    }

    public SortGPA(int idNumber) {
        this.idNumber = idNumber;
    }

    public SortGPA(int idNumber, int GPA)
    {
        this.idNumber = idNumber;
        this.GPA = GPA;
    }

    @Override
    public String toString()
    {
        return String.valueOf(idNumber);
    }

    @Override
    public int compareTo(SortGPA o)
    {
        return Integer.compare(idNumber, o.idNumber);
    }

    static void sort(SortGPA[] students)
    {
        for(int i=1;i<students.length;++i)
        {
            for(int j=i;j>=1;--j){
                if(students[j-1].compareTo(students[j])>0)
                {
                    SortGPA tmp = students[j-1];
                    students[j-1]=students[j];
                    students[j]=tmp;
                }
                else break;
            }
        }
    }
}