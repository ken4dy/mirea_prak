package park1;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int m = 0, sum = 0, max = 0, min = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.println("Insert elements: ");
        while (m < size) {
            array[m] = input.nextInt();
            sum += array[m];
            m++;
        }
        for (int n = 0; n < array.length; n++) {
            if (max < array[n]) {
                max = array[n];
            }
        }
        for (int n = 0; n < array.length; n++) {
            if (min > array[n]) {
                min = array[n];
            }
        }
        System.out.println("Sum : " + sum);
        System.out.println("Max element : " + max);
        System.out.println("Min element : " + min);
    }
}