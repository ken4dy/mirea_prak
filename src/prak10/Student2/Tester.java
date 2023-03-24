package prak10.Student2;

import java.util.Comparator;
import java.util.Scanner;

public class Tester {
    private Comparator<Student> cmp;
    private Student[] idNumber;
    public Tester(Comparator<Student> comp, Student[] s)
    {
        this.cmp = comp;
        idNumber = s;
    }
    public Tester() {}

    public void setCmp(Comparator<Student> cmp)
    {
        this.cmp = cmp.reversed();
    }

    public void setArray(Student[] s)
    {
        idNumber = s;
    }

    public void outArray()
    {
        for(Student s : idNumber)
            System.out.println(s);
    }
    private int partition(Student[] s, int left, int right)
    {
        Student pivot = s[(left+right)/2];
        int i = left;
        int j = right;
        for(;;)
        {
            while(cmp.compare(s[i], pivot) < 0)
                i++;
            while(cmp.compare(pivot, s[j]) < 0)
                j--;
            if(i >= j) break;
            Student tmp = s[i];
            s[i] = s[j];
            s[j] = tmp;
        }
        return j;
    }
    private void _qsort(Student[] s, int left, int right)
    {
        if(left<right)
        {
            int p = partition(s, left, right);
            _qsort(s, left, p);
            _qsort(s, p + 1, right);
        }
    }
    private void merge(Student[] s, Student[] a, Student[] b, int left, int right)
    {
        int i = 0, j = 0, k = 0;
        while(i < left && j < right)
        {
            if(cmp.compare(a[i], b[j]) < 0)
                s[k++] = a[i++];
            else
                s[k++] = b[j++];
        }
        while(i < left)
            s[k++] = a[i++];
        while(j < right)
            s[k++] = b[j++];
    }
    private void msort(Student[] s, int n)
    {
        if(n < 2) return;
        int mid = n/2;

        Student[] left = new Student[mid];
        Student[] right = new Student[n-mid];

        for(int i = 0; i < mid; ++i)
            left[i] = s[i];
        for(int i = mid; i < n; ++i)
            right[i-mid] = s[i];
        msort(left, mid);
        msort(right, n-mid);
        merge(s, left, right, mid, n-mid);
    }
    public void quicksort()
    {
        _qsort(idNumber, 0, idNumber.length-1);
    }
    public void mergeSort()
    {
        msort(idNumber, idNumber.length);
    }

    public void mergeAndSort(Student[] s1, Student[] s2)
    {
        merge(new Student[s1.length+s2.length], s1, s2, s1.length, s2.length);
        mergeSort();
    }


    public static void main(String[] args)
    {
        Student[] students1 = new Student[5];
        students1[0]=new Student("Грегори", "Прайз", "Программист", 1, 3 );
        students1[1]=new Student("Бобс", "Шир", "Программист", 4,4 );
        students1[2]=new Student("Владимир", "Смирнов", "Химик", 4, 5);
        students1[3]=new Student("Адам", "Чернов", "Юрист", 2, 6);
        students1[4]=new Student("Дмитрий", "Первый", "Историк", 3,1 );

        Student[] students2 = new Student[5];
        students2[0]=new Student("Георгий", "Донецков", "Программист", 1, 3 );
        students2[1]=new Student("Борис", "Адамов", "Программист", 4,4 );
        students2[2]=new Student("Виктор", "Вареников", "Химик", 4, 5);
        students2[3]=new Student("Артём", "Грач", "Юрист", 2, 6);
        students2[4]=new Student("Диана", "Болтикова", "Историк", 3,1 );


        System.out.println("Вид сортировки: ");
        System.out.println("1 - Имя, 2 - Фамилия, 3 - Специальность, 4 - Курс, 5 - Группа");
        Scanner scanner = new Scanner(System.in);

        Comparator<Student> cmp;
        while(true)
        {
            int a = scanner.nextInt();
            if(a==1)
            {
                cmp = Comparator.comparing(Student::getName);
                break;
            }
            else if(a==2)
            {
                cmp = Comparator.comparing(Student::getSname);
                break;
            }
            else if(a==3)
            {
                cmp = Comparator.comparing(Student::getSpec);
                break;
            }
            else if(a==4)
            {
                cmp = Comparator.comparing(Student::getKurs);
                break;
            }
            else if(a==5)
            {
                cmp = Comparator.comparing(Student::getGroup);
                break;
            }
            else System.out.println("Ошибка!");
        }
        Tester main = new Tester(cmp, students1);
        //main.quicksort();
        main.outArray();
        System.out.println("\n");

        Tester _main = new Tester(cmp, students2);
        //_main.quicksort();
        _main.outArray();
        System.out.println("\n");

        int count = 0;

        Student[] students = new Student[students1.length + students2.length];
        for(int i = 0; i<students1.length; i++)
        {
            students[i] = students1[i];
            count++;
        }
        for(int j = 0;j<students2.length;j++)
        {
            students[count++] = students2[j];
        }
        Tester m = new Tester(cmp, students);

        m.mergeAndSort(students1, students2);

        m.outArray();
    }
}