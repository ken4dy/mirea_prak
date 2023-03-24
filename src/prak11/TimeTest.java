package prak11;

import java.util.ArrayList;
import java.util.LinkedList;

public class TimeTest {
    public static void main(String[] args)
    {
        ArrayList<Integer> testAL = new ArrayList<>();
        LinkedList<Integer> testLL = new LinkedList<>();


        for (int i = 0; i <= 100; i++)
        {
            testAL.add((int)(Math.random()*100));
            testLL.add(testAL.get(i));
        }


        long time  = System.nanoTime();

        testAL.add(1000);
        time = System.nanoTime() - time;
        System.out.print("Arraylist Добавление: ");
        System.out.printf("%.3f s\n", time / 1000000.0);

        time = System.nanoTime();
        testLL.add(66);
        time = System.nanoTime() - time;
        System.out.print("linkedlist Добавление: ");
        System.out.printf("%.3f s\n", time / 1000000.0);
        System.out.println("\n");
        time = System.nanoTime();
        testAL.add(0, 2);
        time = System.nanoTime() - time;
        System.out.print("Arraylist Вставка: ");
        System.out.printf("%.3f s\n", time / 1000000.0);

        time = System.nanoTime();
        testLL.add(0, 2);
        time = System.nanoTime() - time;
        System.out.print("linkedlist Вставка: ");
        System.out.printf("%.3f s\n", time / 1000000.0);
        System.out.println("\n");
        time = System.nanoTime();
        testAL.indexOf(66);
        time = System.nanoTime() - time;
        System.out.print("Arraylist Поиск: ");
        System.out.printf("%.3f s\n", time / 1000000.0);

        time = System.nanoTime();
        testLL.indexOf(66);
        time = System.nanoTime() - time;
        System.out.print("linkedlist Поиск: ");
        System.out.printf("%.3f s\n", time / 1000000.0);
        System.out.println("\n");
        time = System.nanoTime();
        testAL.remove(0);
        time = System.nanoTime() - time;
        System.out.print("Arraylist Удаление: ");
        System.out.printf("%.3f s\n", time / 1000000.0);

        time = System.nanoTime();
        testLL.remove(0);
        time = System.nanoTime() - time;
        System.out.print("linkedlist Удаление: ");
        System.out.printf("%.3f s\n", time / 1000000.0);
    }
}