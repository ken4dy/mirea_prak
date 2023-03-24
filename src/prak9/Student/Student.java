package prak9.Student;

import java.util.Random;
import java.util.Scanner;

public class Student {
    Random random = new Random();
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    public int iDNumber[];
    Student()
    {
        iDNumber = new int[n];
        for(int i = 0; i<n; i++)
        {
            iDNumber[i] = random.nextInt(1, 10);
        }
    }

    public void Sort()
    {
        for (int i = 0; i < iDNumber.length; i++)
        {
            int min = iDNumber[i];
            int min_i = i;
            for (int j = i + 1; j < iDNumber.length; j++)
                if (iDNumber[j] < min)
                {
                    min = iDNumber[j];//сдвиг вправо
                    min_i = j;
                }
            if (i != min_i)
            {
                int tmp = iDNumber[i];
                iDNumber[i] = iDNumber[min_i];
                iDNumber[min_i] = tmp;
            }
        }
    }

    public void Print()
    {
        for (int aIdNumber : iDNumber)
        {
            System.out.format(String.valueOf(aIdNumber)+" ");
        }
    }
}
