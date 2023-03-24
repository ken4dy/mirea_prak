package prak9.SortStudent;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<SortGPA>
{
    @Override
    public int compare(SortGPA o1, SortGPA o2)
    {
        if(o1.getGPA()==o2.getGPA())
            return 0;
        else if(o1.getGPA()>o2.getGPA())
            return 1;
        else
            return -1;
    }

    public int  partition(SortGPA[] students, int beg, int end)
    {
        SortGPA piv = students[(beg+end)/2];
        int i=beg;
        int j=end;
        for(;;)
        {
            while(this.compare(students[i], piv)<0)
                i++;
            while(this.compare(students[j], piv)>0)
                j--;
            if(i>=j) return j;
            SortGPA tmp=students[i];
            students[i]=students[j];
            students[j]=tmp;
        }
    }
    public void qsort(SortGPA[] students, int beg, int end)
    {
        if(beg<end)
        {
            int p = partition(students, beg, end);
            qsort(students, beg, p);
            qsort(students, p+1, end);
        }
    }
}
